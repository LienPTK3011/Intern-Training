package Project1;

import java.util.Scanner;

public class ConferenceRoom {
	private int IDroom;
	private String RoomCode;
	private float PricePerHour;
	private String Note;
	
	
	public ConferenceRoom() {
		super();
	}

	public ConferenceRoom(int iDroom, String roomCode, float pricePerHour, String note) {
		super();
		IDroom = iDroom;
		RoomCode = roomCode;
		PricePerHour = pricePerHour;
		Note = note;
	}
	

	public int getIDroom() {
		return IDroom;
	}

	public void setIDroom(int iDroom) {
		IDroom = iDroom;
	}

	public String getRoomCode() {
		return RoomCode;
	}

	public void setRoomCode(String roomCode) {
		RoomCode = roomCode;
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
		return "ConferenceRoom [IDroom=" + IDroom + ", RoomCode=" + RoomCode + ", PricePerHour=" + PricePerHour
				+ ", Note=" + Note + "]";
	}

	public void outputConferenceRoom() {
		System.out.println(toString());
	}
	
	public void inputConferenceRoom() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Conference room");
		IDroom = Integer.parseInt(sca.nextLine());
		System.out.println("Enter Room code");
		RoomCode = sca.nextLine();
		System.out.println("Enter price per hour");
		PricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		Note = sca.nextLine();
	}
}
