package by.asptour.service.impl;

import by.asptour.entity.Bid;
import by.asptour.repository.BidRepository;
import by.asptour.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;

public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    @Override
    public Bid save(Bid bid) {
        return bidRepository.save(bid);
    }

    @Autowired
    public void setBidRepository(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }
}
