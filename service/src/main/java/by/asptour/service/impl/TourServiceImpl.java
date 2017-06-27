package by.asptour.service.impl;

import by.asptour.entity.Tour;
import by.asptour.repository.TourRepository;
import by.asptour.service.TourService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Service
@Transactional
public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Tour> findByCountry(String country) {
        return Lists.newArrayList(tourRepository.findByCountry(country));
    }

    @Autowired
    public void setTourRepository(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
}