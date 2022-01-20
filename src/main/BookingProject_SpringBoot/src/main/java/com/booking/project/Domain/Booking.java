package com.booking.project.Domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@MappedSuperclass
public abstract class Booking {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(name = "day")
    protected LocalDate day;
    @Column(name = "start_time")
    protected LocalTime startTime;
    @Column(name = "end_time")
    protected LocalTime endTime;
    @Column(name = "price")
    protected double price;

    public Booking() {

    }

    public Booking(LocalDate day, LocalTime startTime, LocalTime endTime, double price) {
        super();
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
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

    protected double calculatePrice() {
        return 0;
    }
}
