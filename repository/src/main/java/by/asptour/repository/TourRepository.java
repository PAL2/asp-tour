package by.asptour.repository;

import by.asptour.entity.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    Page<Tour> findByCountry(String country, Pageable pageable);

    List<Tour> findByCountryAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String country, Date start, Date end, byte nightsFrom, byte nightsTo, byte star);

    List<Tour> findByCityAndDateBetweenAndDurationBetweenAndStarGreaterThanEqual
            (String city, Date start, Date end, byte nightsFrom, byte nightsTo, byte star);
}