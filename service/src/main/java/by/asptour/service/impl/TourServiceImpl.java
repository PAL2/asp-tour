package by.asptour.service.impl;

import by.asptour.entity.Tour;
import by.asptour.repository.TourRepository;
import by.asptour.service.TourService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;

    @Override
    public List<Tour> findByCountry(String country) {
        return Lists.newArrayList(tourRepository.findByCountry(country));
    }

    @Autowired
    public void setTourRepository(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
}