package by.asptour.service;

import by.asptour.entity.Tour;
import org.springframework.data.domain.Page;

public interface TourService {

    Page<Tour> findByCountry(String country, int pageNumber);

    Tour findById(Integer id);

    Tour save(Tour tour);

    void delete(Integer id);
}