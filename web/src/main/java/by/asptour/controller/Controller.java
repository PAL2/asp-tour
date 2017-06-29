package by.asptour.controller;

import by.asptour.entity.Tour;
import by.asptour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private TourService tourService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("Hello");
        return "index";
    }

    @RequestMapping(value = "bulgaria", method = RequestMethod.GET)
    public String bulgaria() {
        System.out.println("Bulgaria");
        return "bulgaria";
    }

    @RequestMapping(value = "cuba", method = RequestMethod.GET)
    public String cuba() {
        System.out.println("Cuba");
        return "cuba";
    }

    @RequestMapping(value = "cyprus", method = RequestMethod.GET)
    public String cyprus() {
        System.out.println("cyprus");
        return "cyprus";
    }

    @RequestMapping(value = "egypt", method = RequestMethod.GET)
    public String egypt(Model model) {
        List<Tour> tours = tourService.findByCountry("Египет");
        model.addAttribute("tours", tours);
        return "egypt";
    }

    @RequestMapping(value = "greece", method = RequestMethod.GET)
    public String greece() {
        System.out.println("greece");
        return "greece";
    }

    @RequestMapping(value = "italy", method = RequestMethod.GET)
    public String italy() {
        System.out.println("italy");
        return "italy";
    }

    @RequestMapping(value = "montenegro", method = RequestMethod.GET)
    public String montenegro() {
        System.out.println("montenegro");
        return "montenegro";
    }

    @RequestMapping(value = "morocco", method = RequestMethod.GET)
    public String morocco() {
        System.out.println("morocco");
        return "morocco";
    }

    @RequestMapping(value = "spain", method = RequestMethod.GET)
    public String spain() {
        System.out.println("spain");
        return "spain";
    }

    @RequestMapping(value = "thailand", method = RequestMethod.GET)
    public String thailand() {
        System.out.println("thailand");
        return "thailand";
    }

    @RequestMapping(value = "turkey", method = RequestMethod.GET)
    public String turkey() {
        System.out.println("turkey");
        return "turkey";
    }

    @RequestMapping(value = "uae", method = RequestMethod.GET)
    public String uae() {
        System.out.println("uae");
        return "uae";
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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String getLogoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) new SecurityContextLogoutHandler().logout(request, response, authentication);
        return "redirect:/";
    }

    @Autowired
    public void setTourService(TourService tourService) {
        this.tourService = tourService;
    }
}