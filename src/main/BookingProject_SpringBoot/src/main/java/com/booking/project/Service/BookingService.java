package com.booking.project.Service;

import com.booking.project.Domain.Booking;
import com.booking.project.Domain.ConferenceBooking;
import com.booking.project.Domain.ConferenceRoom;
import com.booking.project.Domain.SeatBooking;
import com.booking.project.Dto.BookingRoomDto;
import com.booking.project.Dto.BookingSeatDto;
import com.booking.project.Infrastructure.ConferenceBookingDao;
import com.booking.project.Infrastructure.SeatBookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookingService {
    @Autowired
    ConferenceBookingDao conferenceBookingDao;
    @Autowired
    SeatBookingDao seatBookingDao;

    public String bookingRoom(BookingRoomDto bookingRoomDto){
        ConferenceBooking roomBooking = new ConferenceBooking(bookingRoomDto);
        List<ConferenceBooking> conferenceBookingList = conferenceBookingDao.getAll();
        if (roomBooking.getStartTime().isAfter(roomBooking.getEndTime())) {
            return "Can not booking for this time!";
        }
        for (ConferenceBooking conferenceBooking : conferenceBookingList) {
            if (roomBooking.getDay().equals(conferenceBooking.getDay())
                    && timeAfter(roomBooking.getStartTime(), conferenceBooking.getStartTime()).isBefore(
                    timeBefore(roomBooking.getEndTime(), conferenceBooking.getEndTime()))) {
                return "This room has been booked at this time!";
            }
        }
        conferenceBookingDao.save(roomBooking);
        return String.valueOf(roomBooking.calculatePrice());
    }

    public List<BookingRoomDto> showBookingRoom(){
        List<ConferenceBooking> conferenceBookingList = conferenceBookingDao.getAll();
        List<BookingRoomDto> bookingRoomDtoList = new ArrayList<>();
        for(ConferenceBooking conferenceBooking:conferenceBookingList){
            BookingRoomDto bookingRoomDto = new BookingRoomDto();
            bookingRoomDto.convertToDto(conferenceBooking);
            bookingRoomDtoList.add(bookingRoomDto);
        }
        return bookingRoomDtoList;
    }

    public List<BookingSeatDto> showSeatRoom(){
        List<SeatBooking> seatBookingList = seatBookingDao.getAll();
        List<BookingSeatDto> bookingSeatDtoList = new ArrayList<>();
        for(SeatBooking seatBooking:seatBookingList){
            BookingSeatDto bookingSeatDto = new BookingSeatDto();
            bookingSeatDto.convertToDto(seatBooking);
            bookingSeatDtoList.add(bookingSeatDto);
        }
        return bookingSeatDtoList;
    }

    public String bookingSeat(BookingSeatDto bookingSeatDto){
        SeatBooking seatBooking = new SeatBooking(bookingSeatDto);
        List<SeatBooking> seatBookingList = seatBookingDao.getAll();
        if (seatBooking.getStartTime().isAfter(seatBooking.getEndTime())) {
            return "Can not booking for this time!";
        }
        for (SeatBooking element : seatBookingList) {
            if (seatBooking.getDay().equals(element.getDay())
                    && timeAfter(seatBooking.getStartTime(), element.getStartTime()).isBefore(
                    timeBefore(seatBooking.getEndTime(), element.getEndTime()))) {
                return "This room has been booked at this time!";
            }
        }
        seatBookingDao.save(seatBooking);
        return String.valueOf(seatBooking.calculatePrice());
    }

    private LocalTime timeAfter(LocalTime lt1, LocalTime lt2) {
        if (lt1.isAfter(lt2)) {
            return lt1;
        }
        return lt2;
    }

    private LocalTime timeBefore(LocalTime lt1, LocalTime lt2) {
        if (lt1.isBefore(lt2)) {
            return lt1;
        }
        return lt2;
    }
}
