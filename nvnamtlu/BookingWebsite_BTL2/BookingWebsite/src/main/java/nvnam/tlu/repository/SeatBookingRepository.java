package nvnam.tlu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvnam.tlu.model.SeatBooking;

public interface SeatBookingRepository extends JpaRepository<SeatBooking, Long>{
	List<SeatBooking> findBySeatCodeContaining(String q);
}
