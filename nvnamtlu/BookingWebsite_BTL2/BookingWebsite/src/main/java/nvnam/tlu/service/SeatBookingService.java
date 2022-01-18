package nvnam.tlu.service;

import nvnam.tlu.model.SeatBooking;

public interface SeatBookingService {
	Iterable<SeatBooking> findAll();
    void save(SeatBooking SeatBooking);
}
