package by.asptour.repository;

import by.asptour.entity.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    Page<Tour> findByCountry(String country, Pageable pageable);
}