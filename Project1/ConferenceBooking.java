package Project1;

import java.util.Scanner;

public class ConferenceBooking extends ConferenceRoom{

	private int IDconferenceBooking;
	private String Day;
	private String StartTime;
	private String EndTime;
	private float Price;
	
	public ConferenceBooking(int iDconferenceBooking, String day, String startTime, String endTime, float price) {
		super();
		IDconferenceBooking = iDconferenceBooking;
		Day = day;
		StartTime = startTime;
		EndTime = endTime;
		Price = price;
	}

	public ConferenceBooking() {
		super();
	}

	public int getIDconferenceBooking() {
		return IDconferenceBooking;
	}

	public void setIDconferenceBooking(int iDconferenceBooking) {
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

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "ConferenceBooking [IDconferenceBooking=" + IDconferenceBooking + ", Day=" + Day + ", StartTime="
				+ StartTime + ", EndTime=" + EndTime + ", Price=" + CalculatePrice() + "]";
	}
	
	@Override
	public void outputConferenceRoom() {
		// TODO Auto-generated method stub
		super.outputConferenceRoom();
		System.out.println(toString());
	}
	
	@Override
	public void inputConferenceRoom() {
		// TODO Auto-generated method stub
		super.inputConferenceRoom();
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter ID Seat Booking");
		IDconferenceBooking = Integer.parseInt(sca.nextLine());
		System.out.println("Enter Day");
		Day = sca.nextLine();
		System.out.println("Enter Start Time");
		StartTime = sca.nextLine();
		System.out.println("Enter End Time");
		EndTime = sca.nextLine();
	}
	
	public float CalculatePrice() {
		return Price =  getPricePerHour(); // Price = (End time - Start time) * getPricePerHour()
		
	}
	
	// đọc theo dấu ,
	public String getFileLine() {
		return IDconferenceBooking + "," + Day + "," + StartTime + "," + EndTime + "," + CalculatePrice()  + "\n";
		
	}
	
	
	// chuyển sang string
	public void parse(String line) {
		
		try { //Float.parseFloat(p[1]);
			String[] p = line.split(",");
			IDconferenceBooking = Integer.parseInt(p[0]);
			Day = p[1];
			StartTime = p[2];
			EndTime = p[3];
			Price = Float.parseFloat(p[4]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
