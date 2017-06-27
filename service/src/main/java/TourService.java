import by.asptour.entity.Tour;

import java.util.List;

public interface TourService {

    List<Tour> findByCountry(String country);


}