package Project1;

import java.util.Scanner;

public class ConferenceBooking {

	private String id;
	private String day;
	private String startTime;
	private String endTime;
	private String roomID;
	private float price;
	

	public ConferenceBooking() {
		
	}


	public ConferenceBooking(String id, String day, String startTime, String endTime, String roomID, float price) {
		
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomID = roomID;
		this.price = price;
	}

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getRoomID() {
		return roomID;
	}


	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "ConferenceBooking [id=" + id + ", day=" + day + ", startTime="
				+ startTime + ", endTime=" + endTime + ", roomID=" + roomID + ", price=" + calculatePrice() + "]";
	}


	public void outputConferenceBooking() {
		System.out.println(toString());
	}
	

	public void inputConferenceBooking() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		id = sca.nextLine();
		System.out.println("Enter day");
		day = sca.nextLine();
		System.out.println("Enter Start Time");
		startTime = sca.nextLine();
		System.out.println("Enter End Time");
		endTime = sca.nextLine();
		System.out.println("Enter Room ID");
		roomID = sca.nextLine();
	}
	
	public float calculatePrice() {
		return price ; // price = (End time - Start time) * getpricePerHour()
		
	}
	
	// get line format followed by ","
	public String getFileLine() {
		return id + "," + day + "," + startTime + "," + endTime + "," + roomID + "," + calculatePrice()  + "\n";
		
	}
	
	
	// parse string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			id = p[0];
			day = p[1];
			startTime = p[2];
			endTime = p[3];
			roomID = p[4];
			price = Float.parseFloat(p[5]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
