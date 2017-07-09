package by.asptour.service;

import by.asptour.entity.Tour;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TourService {

    Page<Tour> findByCountry(String country, int pageNumber);

    Tour findById(Integer id);

    Tour save(Tour tour);

    void delete(Integer id);

    List<Tour> findToursForMainPage();
}