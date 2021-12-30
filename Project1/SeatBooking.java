package Project1;

import java.util.Scanner;

public class SeatBooking  {

	private String id;
	private String day;
	private String startTime;
	private String endTime;
	private String seatID;
	private float price;


	public SeatBooking() {
		
	}

	public SeatBooking(String id, String day, String startTime, String endTime, String seatID, float price) {
		
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.seatID = seatID;
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

	public String getSeatID() {
		return seatID;
	}

	public void setSeatID(String seatID) {
		this.seatID = seatID;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SeatBooking [id=" + id + ", day=" + day + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", seatID=" + seatID + ", price=" + calculatePrice() + "]";
	}

	public void outputSeatBooking() {
		System.out.println(toString());
	}

	public void inputSeatBooking() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		id = sca.nextLine();
		System.out.println("Enter day");
		day = sca.nextLine();
		System.out.println("Enter Start Time");
		startTime = sca.nextLine();
		System.out.println("Enter End Time");
		endTime = sca.nextLine();
		System.out.println("Enter Seat ID");
		seatID = sca.nextLine();
		
	}
	
	public float calculatePrice() {
		return price;  // price = (End time - Start time) * getpricePerHour()
		
	}
	
	// get line format followed by ","
	public String getFileLine() {
		return id + "," + day + "," + startTime + "," + endTime + "," + seatID + "," + calculatePrice()  + "\n";
		
	}
	
	//  parse string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			id = p[0];
			day = p[1];
			startTime = p[2];
			endTime = p[3];
			seatID = p[4];
			price = Float.parseFloat(p[5]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
