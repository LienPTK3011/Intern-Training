package Project1;

import java.util.Scanner;

public class Seat {
	private String IDseat;
	private String SeatCode;
	private float PricePerHour;
	private String Note;


	public Seat() {
		super();
	}

	public Seat(String iDseat, String seatCode, float pricePerHour, String note) {
		super();
		IDseat = iDseat;
		SeatCode = seatCode;
		PricePerHour = pricePerHour;
		Note = note;
	}
	
	

	public String getIDseat() {
		return IDseat;
	}

	public void setIDseat(String iDseat) {
		IDseat = iDseat;
	}

	public String getSeatCode() {
		return SeatCode;
	}

	public void setSeatCode(String seatCode) {
		SeatCode = seatCode;
	}

	public float getPricePerHour() {
		return PricePerHour;
	}

	public void setPricePerHour(float pricePerHour) {
		PricePerHour = pricePerHour;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	
	
	@Override
	public String toString() {
		return "Seat [IDseat=" + IDseat + ", SeatCode=" + SeatCode + ", PricePerHour=" + PricePerHour + ", Note=" + Note + "]";
	}

	public void outputSeat() {
		System.out.println(toString());
	}
	
	public void inputSeat() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID seat");
		IDseat = sca.nextLine();
		System.out.println("Enter Seat code");
		SeatCode = sca.nextLine();
		System.out.println("Enter price per hour");
		PricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		Note = sca.nextLine();
	}
	
	
}
