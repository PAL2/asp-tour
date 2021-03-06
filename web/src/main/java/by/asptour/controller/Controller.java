package by.asptour.controller;

import by.asptour.entity.Bid;
import by.asptour.entity.Tour;
import by.asptour.service.BidService;
import by.asptour.service.TourService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private TourService tourService;
    private BidService bidService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Tour> tours = tourService.findToursForMainPage();
        model.addAttribute("tours", tours);
        model.addAttribute("bid", new Bid());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String indexPost(@ModelAttribute("bid") Bid bid) {
        bidService.save(bid);
        return "redirect:/";
    }

    @RequestMapping(value = "find", method = RequestMethod.POST)
    public String findTourOrder(@ModelAttribute("bid") Bid bid) {
        bidService.save(bid);
        return "redirect:/";
    }

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public String findTourGet(@RequestParam(value = "country") String country,
                              @RequestParam(value = "city") String city,
                              @RequestParam(value = "start") String startDateString,
                              @RequestParam(value = "end") String endDateString,
                              @RequestParam(value = "nightsFrom") byte nightsFrom,
                              @RequestParam(value = "nightsTo") byte nightsTo,
                              @RequestParam(value = "stars") String stars,
                              @RequestParam(value = "starsMore", required = false) boolean starsMore,
                              @RequestParam(value = "child") byte child,
                              @RequestParam(value = "adult") byte adult,
                              @RequestParam(value = "priceFrom") int priceFrom,
                              @RequestParam(value = "priceTo") int priceTo,
                              Model model) throws ParseException {
        model.addAttribute("bid", new Bid());
        byte star = Byte.parseByte(stars.substring(0, 1));
        double coefficient = adult + child * 0.5;
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("MM/dd/yyyy");
        Date startDate = format.parse(startDateString);
        Date endDate = format.parse(endDateString);
        List<Tour> tours;
        if (city.equals("Любой")) {
            tours = tourService.findByCountryAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
                    (country, startDate, endDate, nightsFrom, nightsTo, star);
        } else {
            tours = tourService.findByCityAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
                    (city, startDate, endDate, nightsFrom, nightsTo, star);
        }
        for (Tour tour : tours) {
            tour.setPrice((int) (tour.getPrice() * coefficient));
            tour.setPriceByn((int) (tour.getPriceByn() * coefficient));
        }
        Iterator<Tour> iterator = tours.iterator();
        while (iterator.hasNext()) {
            Tour tour = iterator.next();
            if (!starsMore) {
                if (tour.getStar() > star) iterator.remove();
            }
            if (!(priceFrom <= tour.getPrice() && priceTo >= tour.getPrice())) iterator.remove();
        }
        model.addAttribute("tours", tours);
        return "find";
    }

    @RequestMapping(value = "{country}/{pageNumber}", method = RequestMethod.GET)
    public String showToursByCountry(Model model, @PathVariable String country, @PathVariable int pageNumber) {
        int toursPerPage = 28;
        Page<Tour> pages = tourService.findByCountry(country, pageNumber, toursPerPage);
        List<Tour> tours = pages.getContent();
        int current = pages.getNumber() + 1;
        int begin = Math.max(1, current - 3);
        int end = Math.min(current + 3, pages.getTotalPages());
        model.addAttribute("pages", pages);
        model.addAttribute("tours", tours);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("bid", new Bid());
        return country;
    }

    @RequestMapping(value = "{country}/{pageNumber}", method = RequestMethod.POST)
    public String saveBid(@ModelAttribute("bid") Bid bid) {
        bidService.save(bid);
        return "redirect:/";
    }

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "order", method = RequestMethod.GET)
    public String order() {
        return "order";
    }

    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public String contacts() {
        return "contacts";
    }

    @RequestMapping(value = "news", method = RequestMethod.GET)
    public String news() {
        return "news";
    }

    @RequestMapping(value = "picking", method = RequestMethod.GET)
    public String picking() {
        return "picking";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "loginfail", method = RequestMethod.GET)
    public String getLoginFailPage() {
        return "loginfail";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String getAdminPage() {
        return "admin";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String getLogoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) new SecurityContextLogoutHandler().logout(request, response, authentication);
        return "redirect:/";
    }

    @RequestMapping(value = "admin/{id}", method = RequestMethod.GET)
    public String editTour(@PathVariable Integer id, Model model) {
        Tour tour = tourService.findById(id);
        model.addAttribute("tour", tour);
        return "admin/edit";
    }

    @RequestMapping(value = "admin/{id}", params = "form", method = RequestMethod.POST)
    public String editTourPost(Tour tour, @RequestParam(value = "file", required = false) MultipartFile file) {
        if (file != null) tour = addPhotoToTour(file, tour);
        tourService.save(tour);
        return "redirect:/admin";
    }

    @RequestMapping(value = "admin/bids", method = RequestMethod.GET)
    public String findAllBids(Model model) {
        List<Bid> bids = bidService.findByProcessed(false);
        model.addAttribute("bids", bids);
        return "admin/bids";
    }

    @RequestMapping(value = "admin/delete/{id}", method = RequestMethod.GET)
    public String deleteTour(@PathVariable Integer id) {
        tourService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping(value = "admin/process/bid/{id}", method = RequestMethod.GET)
    public String deleteBid(@PathVariable Integer id) {
        bidService.process(id);
        return "redirect:/admin/bids";
    }

    @RequestMapping(value = "admin/edit", method = RequestMethod.GET)
    public String addNewTour(Model model) {
        model.addAttribute("tour", new Tour());
        return "admin/edit";
    }

    @RequestMapping(value = "admin/edit", method = RequestMethod.POST)
    public String addTour(@ModelAttribute("tour") Tour tour,
                          @RequestParam(value = "file", required = false) MultipartFile file) {
        if (file != null) tour = addPhotoToTour(file, tour);
        tourService.save(tour);
        return "redirect:/admin";
    }

    @RequestMapping(value = "tour/{id}", method = RequestMethod.GET)
    @ResponseBody
    public byte[] downloadPhoto(@PathVariable("id") Integer id) {
        Tour tour = tourService.findById(id);
        if (tour.getPhoto() != null) {
            System.out.println("Downloading photo for id: " + id + " with size: " + tour.getPhoto().length);
        }
        return tour.getPhoto();
    }

    private Tour addPhotoToTour(MultipartFile file, Tour tour) {
        byte[] fileContent = null;
        try {
            InputStream inputStream = file.getInputStream();
            if (inputStream == null) System.out.println("File inputstream is null");
            fileContent = IOUtils.toByteArray(inputStream);
            tour.setPhoto(fileContent);
        } catch (IOException e) {
            System.out.println("Error");
        }
        tour.setPhoto(fileContent);
        return tour;
    }

    @GetMapping(value = "hotels/{country}/{city}/{hotel}")
    public String showHotel(@PathVariable String country, @PathVariable String city, @PathVariable String hotel) {
        return "hotels/" + country + "/" + city + "/" + hotel;
    }

    @Autowired
    public void setTourService(TourService tourService) {
        this.tourService = tourService;
    }

    @Autowired
    public void setBidService(BidService bidService) {
        this.bidService = bidService;
    }
}