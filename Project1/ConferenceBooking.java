package Project1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ConferenceBooking {

	private String id;
	private LocalDate day;
	private LocalTime startTime;
	private LocalTime endTime;
	private String roomID;
	private float price;


	public ConferenceBooking() {
		
	}


	public ConferenceBooking(String id, LocalDate day, LocalTime startTime, LocalTime endTime, String roomID,
			float price) {
		
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomID = roomID;
		this.price = price;
	}


	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getDay() {
		return day;
	}


	public void setDay(LocalDate day) {
		this.day = day;
	}


	public LocalTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}


	public LocalTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	public String getRoomID() {
		return roomID;
	}


	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "ConferenceBooking [id=" + id + ", day=" + day + ", startTime="
				+ startTime + ", endTime=" + endTime + ", roomID=" + roomID + ", price=" + calculatePrice() + "]";
	}


	public void outputConferenceBooking() {
		System.out.println(toString());
	}
	

	
	public float calculatePrice() {
		Duration duration = Duration.between(startTime, endTime);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() - hours * 60;
		double payMoney = (hours + (minutes * 1.0 / 60)) * this.getPrice();
		return (float) Math.round(payMoney * 100) / 100;
		
	}
	
	
	
}
