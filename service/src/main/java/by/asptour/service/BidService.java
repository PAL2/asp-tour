package by.asptour.service;

import by.asptour.entity.Bid;

import java.util.List;

public interface BidService {

    Bid save(Bid bid);

    void delete(Integer id);

    List<Bid> findAll();
}