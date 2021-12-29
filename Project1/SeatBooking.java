package Project1;

import java.util.Scanner;

public class SeatBooking  {

	private String IDseatBooking;
	private String Day;
	private String StartTime;
	private String EndTime;
	private String SeatID;
	private float Price;

	public SeatBooking() {
		super();
	}

	public SeatBooking(String iDseatBooking, String day, String startTime, String endTime, String seatID, float price) {
		super();
		IDseatBooking = iDseatBooking;
		Day = day;
		StartTime = startTime;
		EndTime = endTime;
		SeatID = seatID;
		Price = price;
	}
	
	

	public String getIDseatBooking() {
		return IDseatBooking;
	}

	public void setIDseatBooking(String iDseatBooking) {
		IDseatBooking = iDseatBooking;
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

	public String getSeatID() {
		return SeatID;
	}

	public void setSeatID(String seatID) {
		SeatID = seatID;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "SeatBooking [IDseatBooking=" + IDseatBooking + ", Day=" + Day + ", StartTime=" + StartTime
				+ ", EndTime=" + EndTime + ", SeatID=" + SeatID + ", Price=" + CalculatePrice() + "]";
	}

	public void outputSeatBooking() {
		System.out.println(toString());
	}

	public void inputSeatBooking() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		IDseatBooking = sca.nextLine();
		System.out.println("Enter Day");
		Day = sca.nextLine();
		System.out.println("Enter Start Time");
		StartTime = sca.nextLine();
		System.out.println("Enter End Time");
		EndTime = sca.nextLine();
		System.out.println("Enter Seat ID");
		SeatID = sca.nextLine();
		
	}
	
	public float CalculatePrice() {
		return Price;  // Price = (End time - Start time) * getPricePerHour()
		
	}
	
	//  đọc theo dấu ,
	public String getFileLine() {
		return IDseatBooking + "," + Day + "," + StartTime + "," + EndTime + "," + SeatID + "," + CalculatePrice()  + "\n";
		
	}
	
	// chuyển sang string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			IDseatBooking = p[0];
			Day = p[1];
			StartTime = p[2];
			EndTime = p[3];
			SeatID = p[4];
			Price = Float.parseFloat(p[5]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
