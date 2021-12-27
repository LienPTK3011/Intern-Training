package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class conferenceBooking extends Booking{
	private int roomID;

	public conferenceBooking(int id, LocalDate day, LocalTime startTime, LocalTime endTime, double price, int roomID) {
		super(id, day, startTime, endTime, price);
		this.roomID = roomID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
	
}
