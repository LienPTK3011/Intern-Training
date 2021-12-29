package Project1;

import java.util.Scanner;

public class ConferenceBooking {

	private String IDconferenceBooking;
	private String Day;
	private String StartTime;
	private String EndTime;
	private String RoomID;
	private float Price;


	public ConferenceBooking() {
		super();
	}


	public ConferenceBooking(String iDconferenceBooking, String day, String startTime, String endTime, String roomID,
			float price) {
		super();
		IDconferenceBooking = iDconferenceBooking;
		Day = day;
		StartTime = startTime;
		EndTime = endTime;
		RoomID = roomID;
		Price = price;
	}

	

	public String getIDconferenceBooking() {
		return IDconferenceBooking;
	}


	public void setIDconferenceBooking(String iDconferenceBooking) {
		IDconferenceBooking = iDconferenceBooking;
	}


	public String getDay() {
		return Day;
	}


	public void setDay(String day) {
		Day = day;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getRoomID() {
		return RoomID;
	}

	public void setRoomID(String roomID) {
		RoomID = roomID;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "ConferenceBooking [IDconferenceBooking=" + IDconferenceBooking + ", Day=" + Day + ", StartTime="
				+ StartTime + ", EndTime=" + EndTime + ", RoomID=" + RoomID + ", Price=" + CalculatePrice() + "]";
	}


	public void outputConferenceBooking() {
		System.out.println(toString());
	}
	

	public void inputConferenceBooking() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		IDconferenceBooking = sca.nextLine();
		System.out.println("Enter Day");
		Day = sca.nextLine();
		System.out.println("Enter Start Time");
		StartTime = sca.nextLine();
		System.out.println("Enter End Time");
		EndTime = sca.nextLine();
		System.out.println("Enter Room ID");
		RoomID = sca.nextLine();
	}
	
	public float CalculatePrice() {
		return Price ; // Price = (End time - Start time) * getPricePerHour()
		
	}
	
	// đọc theo dấu ,
	public String getFileLine() {
		return IDconferenceBooking + "," + Day + "," + StartTime + "," + EndTime + "," + RoomID + "," + CalculatePrice()  + "\n";
		
	}
	
	
	// chuyển sang string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			IDconferenceBooking = p[0];
			Day = p[1];
			StartTime = p[2];
			EndTime = p[3];
			RoomID = p[4];
			Price = Float.parseFloat(p[5]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
