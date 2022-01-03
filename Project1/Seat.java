package Project1;

import java.util.Scanner;

public class Seat {
	private String id;
	private String seatCode;
	private float pricePerHour;
	private String note;

	
	public Seat() {
		
	}

	public Seat(String id, String seatCode, float pricePerHour, String note) {

		this.id = id;
		this.seatCode = seatCode;
		this.pricePerHour = pricePerHour;
		this.note = note;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSeatCode() {
		return seatCode;
	}

	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}

	public float getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(float pricePerHour) {
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
		return "Seat [id=" + id + ", seatCode=" + seatCode + ", pricePerHour=" + pricePerHour + ", note=" + note + "]";
	}


	
	public void inputSeat() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID seat");
		id = sca.nextLine();
		System.out.println("Enter Seat code");
		seatCode = sca.nextLine();
		System.out.println("Enter price per hour");
		pricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		note = sca.nextLine();
	}
	
	
}
