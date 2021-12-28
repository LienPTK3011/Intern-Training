package Project1;

import java.util.Scanner;

public class Seat {
	private int IDseat;
	private String SeatCode;
	private float PricePerHour;
	private String Note;
	

	public Seat() {
		super();
	}

	public Seat(int iDseat, String seatCode, float pricePerHour, String note) {
		super();
		IDseat = iDseat;
		SeatCode = seatCode;
		PricePerHour = pricePerHour;
		Note = note;
	}
	
	

	public int getIDseat() {
		return IDseat;
	}

	public void setIDseat(int iDseat) {
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
		return "Seat [ID=" + IDseat + ", SeatCode=" + SeatCode + ", PricePerHour=" + PricePerHour + ", Note=" + Note + "]";
	}
	
	public void outputSeat() {
		System.out.println(toString());
	}
	
	public void inputSeat() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID seat");
		IDseat = Integer.parseInt(sca.nextLine());
		System.out.println("Enter Seat code");
		SeatCode = sca.nextLine();
		System.out.println("Enter price per hour");
		PricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		Note = sca.nextLine();
	}
	
	
}
