package nvnam.tlu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvnam.tlu.model.SeatBooking;
import nvnam.tlu.repository.SeatBookingRepository;

@Service
public class SeatBookingServiceImpl implements SeatBookingService {
	@Autowired
    private SeatBookingRepository seatBookingRepository;
    @Override
    public Iterable<SeatBooking> findAll() {
        return seatBookingRepository.findAll();
    }
	@Override
	public void save(SeatBooking seatBooking) {
		seatBookingRepository.save(seatBooking);
	}
}
