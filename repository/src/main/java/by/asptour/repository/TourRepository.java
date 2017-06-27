package by.asptour;

import by.asptour.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Алексей on 27.06.2017.
 */
public interface TourRepository extends JpaRepository<Tour, Integer> {
}
