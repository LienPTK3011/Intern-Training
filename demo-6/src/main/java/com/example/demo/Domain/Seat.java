package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String seatcode;
	private double priceperhour;
	private String note;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSeatcode() {
		return seatcode;
	}
	public void setSeatcode(String seatcode) {
		this.seatcode = seatcode;
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
