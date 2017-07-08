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

@Repository
@Service
@Transactional
public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<Tour> findByCountry(String country, int pageNumber) {
        PageRequest request = new PageRequest(pageNumber - 1, 20);
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

    @Autowired
    public void setTourRepository(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
}