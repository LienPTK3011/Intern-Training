package com.booking.project.Domain;

import javax.persistence.*;

@Entity
@Table(name = "conferenceroom_information")
public class ConferenceRoom {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "room_code")
    private String roomCode;
    @Column(name = "price_per_hour")
    private double pricePerHour;
    @Column(name = "note")
    private String note;

    public ConferenceRoom() {
        super();
    }

    public ConferenceRoom(int id, String roomCode, double pricePerHour, String note) {
        super();
        this.id = id;
        this.roomCode = roomCode;
        this.pricePerHour = pricePerHour;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
