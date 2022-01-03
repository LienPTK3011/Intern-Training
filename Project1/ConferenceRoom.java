package Project1;

import java.util.Scanner;

public class ConferenceRoom {
	private String id;
	private String roomCode;
	private float pricePerHour;
	private String note;
	

	public ConferenceRoom() {
	
	}

	public ConferenceRoom(String id, String roomCode, float pricePerHour, String note) {
	
		this.id = id;
		this.roomCode = roomCode;
		this.pricePerHour = pricePerHour;
		this.note = note;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
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
		return "ConferenceRoom [id=" + id + ", roomCode=" + roomCode + ", pricePerHour=" + pricePerHour
				+ ", note=" + note + "]";
	}

	
	public void inputConferenceRoom() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Conference room");
		id = sca.nextLine();
		System.out.println("Enter Room code");
		roomCode = sca.nextLine();
		System.out.println("Enter price per hour");
		pricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		note = sca.nextLine();
	}
}
