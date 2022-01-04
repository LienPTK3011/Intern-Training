/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Asus
 */
public class Booking {
    private String id;
    private String roomid;
    private String seatid;
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime ;
    private double price;

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

    public double getPrice() {
        
        return price;
    }

    public void setPrice(double price) {
        
        this.price = price;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getSeatid() {
        return seatid;
    }

    public void setSeatid(String seatid) {
        this.seatid = seatid;
    }

    public Booking() {
    }

    public Booking(String id, String roomid, String seatid, LocalDate day, LocalTime startTime, LocalTime endTime, double price) {
        this.id = id;
        this.roomid = roomid;
        this.seatid = seatid;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", roomid=" + roomid + ", seatid=" + seatid + ", day=" + day + ", startTime=" + startTime + ", endTime=" + endTime + ", price=" + price + '}';
    }
    
    public float calculatePrice(double price, LocalTime startTime, LocalTime endTime) {
		Duration duration = Duration.between(startTime, endTime);
		long hours = duration.toHours();
		long minutes = duration.toMinutes() - hours * 60;
		float money = (float) ((hours + (minutes * 1.0 / 60)) * price);
		return money;
	}
    
}