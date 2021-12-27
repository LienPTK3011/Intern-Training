package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class seatBooking extends Booking{
	private int seatID;

	public seatBooking(int id, LocalDate day, LocalTime startTime, LocalTime endTime, double price, int seatID) {
		super(id, day, startTime, endTime, price);
		this.seatID = seatID;
	}

	public int getSeatID() {
		return seatID;
	}

	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	
	
	
	
}
