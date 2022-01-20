package com.booking.project.Domain;

import com.booking.project.Dto.BookingSeatDto;
import com.booking.project.Util.DateConverter;
import com.booking.project.Util.TimeConverter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Duration;

@Entity
@Table(name = "seat_booking")
public class SeatBooking extends Booking{
    @Column(name = "seat_code")
    private String seatCode;
    public SeatBooking() {

    }

    public SeatBooking(BookingSeatDto dto) {
        super(DateConverter.stringToDate(dto.getInputDay()),
                TimeConverter.stringToTime(dto.getInputTime()),
                TimeConverter.stringToTime(dto.getOutputTime()),
                Double.parseDouble(dto.getPrice()));
        this.seatCode = dto.getSeatCode();
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
