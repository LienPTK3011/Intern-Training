package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class SeatBooking extends Booking {
	private String seatCode;

	public SeatBooking() {

	}

	public SeatBooking(int id, LocalDate day, LocalTime startTime, LocalTime endTime, double price, String seatCode) {
		super(id, day, startTime, endTime, price);
		this.seatCode = seatCode;
	}

	public String getSeatCode() {
		return seatCode;
	}

	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}
	
	//method to calculate price for seat booking
	@Override
	public double calculatePrice() {
		Duration duration = Duration.between(startTime, endTime);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() - hours * 60;
		double payMoney = (hours + (minutes * 1.0 / 60)) * this.getPrice();
		return (double) Math.round(payMoney * 100) / 100;
	}
}
