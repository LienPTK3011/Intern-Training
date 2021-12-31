package booking_project.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
	//declare
	private int id;
	private LocalDate day;
	private LocalTime startTime;
	private LocalTime endTime;
	private double price;
	//constructer
	public Booking(int id, LocalDate day, LocalTime startTime, LocalTime endTime, double price) {
		super();
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
//method calculating price
	public void calculatePrice() {
		System.out.println("Calculate price for booking");
	}

}