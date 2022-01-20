package com.booking.project.Domain;

import com.booking.project.Dto.BookingRoomDto;
import com.booking.project.Util.DateConverter;
import com.booking.project.Util.TimeConverter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Duration;

@Entity
@Table(name = "room_booking")
public class ConferenceBooking extends Booking{

    @Column(name = "room_code")
    private String roomCode;

    public ConferenceBooking() {

    }

    public ConferenceBooking(BookingRoomDto bookingRoomDto) {
        super(DateConverter.stringToDate(bookingRoomDto.getInputDay()),
                TimeConverter.stringToTime(bookingRoomDto.getInputTime()),
                TimeConverter.stringToTime(bookingRoomDto.getOutputTime()),
                Double.parseDouble(bookingRoomDto.getPrice()));
        this.roomCode = bookingRoomDto.getRoomCode();
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
