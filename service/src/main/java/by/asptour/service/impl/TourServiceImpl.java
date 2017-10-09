package by.asptour.service.impl;

import by.asptour.entity.Tour;
import by.asptour.repository.TourRepository;
import by.asptour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Repository
@Service
@Transactional
public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<Tour> findByCountry(String country, int pageNumber, int toursPerPage) {
        PageRequest request = new PageRequest(pageNumber - 1, toursPerPage);
        return tourRepository.findByCountry(country, request);
    }

    @Override
    public Tour findById(Integer id) {
        return tourRepository.findOne(id);
    }

    @Override
    public Tour save(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public void delete(Integer id) {
        tourRepository.delete(id);
    }

    @Override
    public List<Tour> findToursForMainPage() {
        Tour tour;
        List<Tour> tours = new ArrayList<>();
        Random random = new Random();
        long count = (long) (tourRepository.count() * 1.2);
        while (tours.size() <= 15) {
            int id = random.nextInt((int) (count)) + 1;
            tour = tourRepository.findOne(id);
            if (tour != null) tours.add(tour);
        }
        return tours;
    }

    @Override
    public List<Tour> findByCountryAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String country, Date start, Date end, byte nightsFrom, byte nightsTo, byte star) {
        return tourRepository.findByCountryAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
                (country, start, end, nightsFrom, nightsTo, star);
    }

    @Override
    public List<Tour> findByCityAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String city, Date start, Date end, byte nightsFrom, byte nightsTo, byte star) {
        return tourRepository.findByCityAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
                (city, start, end, nightsFrom, nightsTo, star);
    }

    @Autowired
    public void setTourRepository(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
}