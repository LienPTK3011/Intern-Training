package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class ConferenceBooking extends Booking {
	private String roomCode;

	public ConferenceBooking() {
		super();
	}

	public ConferenceBooking(int id, LocalDate day, LocalTime startTime, LocalTime endTime, double price,
			String roomCode) {
		super(id, day, startTime, endTime, price);
		this.roomCode = roomCode;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	
	//method to calculate price for room booking
	@Override
	public double calculatePrice() {
		Duration duration = Duration.between(startTime, endTime);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() - hours * 60;
		double payMoney = (hours + (minutes * 1.0 / 60)) * this.getPrice();
		return (double) Math.round(payMoney * 100) / 100;
	}

}
