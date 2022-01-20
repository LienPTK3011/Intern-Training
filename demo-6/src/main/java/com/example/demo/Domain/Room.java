package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roomcode;
	private double priceperhour;
	private String note;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomcode() {
		return roomcode;
	}
	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}
	public double getPriceperhour() {
		return priceperhour;
	}
	public void setPriceperhour(double priceperhour) {
		this.priceperhour = priceperhour;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
