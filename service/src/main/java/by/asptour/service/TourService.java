package by.asptour.service;

import by.asptour.entity.Tour;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface TourService {

    Page<Tour> findByCountry(String country, int pageNumber, int toursPerPage);

    Tour findById(Integer id);

    Tour save(Tour tour);

    void delete(Integer id);

    List<Tour> findToursForMainPage();

    List<Tour> findByCountryAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String country, Date start, Date end, byte nightsFrom, byte nightsTo, byte star);

    List<Tour> findByCityAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String city, Date start, Date end, byte nightsFrom, byte nightsTo, byte star);
}