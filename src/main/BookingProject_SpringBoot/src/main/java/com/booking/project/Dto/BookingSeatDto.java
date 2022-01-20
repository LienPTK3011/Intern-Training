package com.booking.project.Dto;

import com.booking.project.Domain.SeatBooking;
import com.booking.project.Util.DateConverter;
import com.booking.project.Util.TimeConverter;

public class BookingSeatDto {
    String seatCode;
    String inputDay;
    String inputTime;
    String outputTime;
    String price;

    public BookingSeatDto() {
    }

    public String getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode;
    }

    public String getInputDay() {
        return inputDay;
    }

    public void setInputDay(String inputDay) {
        this.inputDay = inputDay;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void convertToDto(SeatBooking seatBooking){
        this.inputDay = DateConverter.dateToString(seatBooking.getDay());
        this.inputTime = TimeConverter.timeToString(seatBooking.getStartTime());
        this.outputTime = TimeConverter.timeToString(seatBooking.getEndTime());
        this.seatCode = seatBooking.getSeatCode();
        this.price = String.valueOf(seatBooking.getPrice());
    }
}
