package model;

public class Seat {
	private int id;
	private String seatCode;
	private double pricePerHour;
	private String note;

	public Seat() {

	}

	public Seat(int id, String seatCode, double pricePerHour, String note) {
		super();
		this.id = id;
		this.seatCode = seatCode;
		this.pricePerHour = pricePerHour;
		this.note = note;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeatCode() {
		return seatCode;
	}

	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
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
		return this.getId() + " - " + this.getSeatCode() + " - " + this.getPricePerHour() + " - " + this.getNote();
	}
}
