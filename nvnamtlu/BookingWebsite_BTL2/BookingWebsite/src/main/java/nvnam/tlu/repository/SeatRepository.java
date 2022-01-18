package nvnam.tlu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvnam.tlu.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findBySeatCodeContaining(String q);
}