package model;

public class ConferenceRoom {
	private int id;
	private String roomCode;
	private double pricePerHour;
	private String note;

	public ConferenceRoom() {
	
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

	@Override
	public String toString() {
		return this.id + " - " + this.roomCode + " - " + this.pricePerHour + " - " + this.note;
	}
}
