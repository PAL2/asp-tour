package by.asptour.repository;

import by.asptour.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Integer> {
    List<Bid> findByProcessed(boolean processed);

    @Modifying
    @Query("UPDATE Bid B SET B.processed=1 WHERE B.id=:id")
    void processBid(@Param("id") Integer id);
}