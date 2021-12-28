package Project1;

import java.util.Scanner;

public class SeatBooking extends Seat {

	private int IDseatBooking;
	private String Day;
	private String StartTime;
	private String EndTime;
	private float Price;
	
	public SeatBooking() {
		super();
	}

	public SeatBooking(int iDseatBooking, String day, String startTime, String endTime, float price) {
		super();
		IDseatBooking = iDseatBooking;
		Day = day;
		StartTime = startTime;
		EndTime = endTime;
		Price = price;
	}

	public int getIDseatBooking() {
		return IDseatBooking;
	}

	public void setIDseatBooking(int iDseatBooking) {
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

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}
	
	
	@Override
	public String toString() {
		return "SeatBooking [IDseatBooking=" + IDseatBooking + ", Day=" + Day + ", StartTime=" + StartTime
				+ ", EndTime=" + EndTime + ", Price=" + CalculatePrice() + "]";
	}

	@Override
	public void outputSeat() {
		// TODO Auto-generated method stub
		super.outputSeat();
		System.out.println(toString());
	}
	
	@Override
	public void inputSeat() {
		// TODO Auto-generated method stub
		super.inputSeat();
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		IDseatBooking = Integer.parseInt(sca.nextLine());
		System.out.println("Enter Day");
		Day = sca.nextLine();
		System.out.println("Enter Start Time");
		StartTime = sca.nextLine();
		System.out.println("Enter End Time");
		EndTime = sca.nextLine();
		
	}
	
	public float CalculatePrice() {
		return Price =  getPricePerHour();  // Price = (End time - Start time) * getPricePerHour()
		
	}
	
	//  đọc theo dấu ,
	public String getFileLine() {
		return IDseatBooking + "," + Day + "," + StartTime + "," + EndTime + "," + CalculatePrice()  + "\n";
		
	}
	
	// chuyển sang string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			IDseatBooking = Integer.parseInt(p[0]);
			Day = p[1];
			StartTime = p[2];
			EndTime = p[3];
			Price = Float.parseFloat(p[4]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
