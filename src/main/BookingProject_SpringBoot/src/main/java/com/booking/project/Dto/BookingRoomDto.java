package com.booking.project.Dto;

import com.booking.project.Domain.ConferenceBooking;
import com.booking.project.Util.DateConverter;
import com.booking.project.Util.TimeConverter;

public class BookingRoomDto {
    String roomCode;
    String inputDay;
    String inputTime;
    String outputTime;
    String price;

    public BookingRoomDto() {
    }

    public BookingRoomDto(String roomCode, String inputDay, String inputTime, String outputTime, String price) {
        this.roomCode = roomCode;
        this.inputDay = inputDay;
        this.inputTime = inputTime;
        this.outputTime = outputTime;
        this.price = price;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
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

    public void convertToDto(ConferenceBooking conferenceBooking){
        this.inputDay = DateConverter.dateToString(conferenceBooking.getDay());
        this.inputTime = TimeConverter.timeToString(conferenceBooking.getStartTime());
        this.outputTime = TimeConverter.timeToString(conferenceBooking.getEndTime());
        this.roomCode = conferenceBooking.getRoomCode();
        this.price = String.valueOf(conferenceBooking.getPrice());
    }
}
