package by.asptour.service.impl;

import by.asptour.entity.Bid;
import by.asptour.repository.BidRepository;
import by.asptour.service.BidService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Service
@Transactional
public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    @Override
    public Bid save(Bid bid) {
        return bidRepository.save(bid);
    }

    @Override
    public void delete(Integer id) {
        bidRepository.delete(id);
    }

    @Override
    public List<Bid> findAll() {
        return Lists.newArrayList(bidRepository.findAll());
    }

    @Autowired
    public void setBidRepository(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }
}