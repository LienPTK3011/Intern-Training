package Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.Scanner;

public class ManageBooking {
	
	static Scanner sca = new Scanner(System.in);
	
	// date convert
	DateTimeFormatter dtd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	// convert string to datetime
	public LocalDate stringToDate(String s) {
		LocalDate d = LocalDate.parse(s,dtd);
		return d;
	}
	
	// convert datetime to string
	public String dateToString(LocalDate d) {
		return dtd.format(d);
	}

	
	// time convert
	DateTimeFormatter dtt = DateTimeFormatter.ofPattern("HH:mm");
	
	// convert string to datetime
	public LocalTime stringToTime(String s) {
		LocalTime t = LocalTime.parse(s, dtt);
		return t;
	}
	
	// convert datetime to string
	public String timeToString(LocalTime t) {
		return dtt.format(t);
	}
	
	
	// read file seatBooking.txt
	public void readFileSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\seatBooking.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = buf.readLine();
			while (line != null) {
				String[] p = line.split(";");
				if (p.length == 6) {
					SeatBooking seatBooking = new SeatBooking();
					seatBooking.setId(p[0]);
					seatBooking.setDay(stringToDate(p[1]));
					seatBooking.setStartTime(stringToTime(p[2]));
					seatBooking.setEndTime(stringToTime(p[3]));
					seatBooking.setSeatID(p[4]);
					seatBooking.setPrice(Float.parseFloat(p[5]));
					
					listSeatBooking.add(seatBooking);
				}
				line = buf.readLine();
			}
			buf.close();
			read.close();
			fis.close();
		} catch (Exception e) {
			
		}
	}
	
	
	// read file conferenceroomBooking.txt
	public void readFileConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\conferenceroomBooking.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			String line = buf.readLine();
			while (line != null) {
				String[] p = line.split(";");
				if (p.length == 6) {
					ConferenceBooking conferenceBooking = new ConferenceBooking();
					conferenceBooking.setId(p[0]);
					conferenceBooking.setDay(stringToDate(p[1]));
					conferenceBooking.setStartTime(stringToTime(p[2]));
					conferenceBooking.setEndTime(stringToTime(p[3]));
					conferenceBooking.setRoomID(p[4]);
					conferenceBooking.setPrice(Float.parseFloat(p[5]));
					
					listConferenceBooking.add(conferenceBooking);
				}
				line = buf.readLine();
			}
			buf.close();
			read.close();
			fis.close();
		} catch (Exception e) {
			
		}
	}
	
	// write file seatBooking.txt
	public void saveFileSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\seatBooking.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (SeatBooking seatBooking : listSeatBooking) {
				String line = seatBooking.getId() + ";" + 
							dateToString(seatBooking.getDay()) + ";" + 
							timeToString(seatBooking.getStartTime()) + ";" + 
							timeToString(seatBooking.getEndTime()) + ";" + 
							seatBooking.getSeatID() + ";" + 
							seatBooking.getPrice();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			
		}
	}
	
	// write file conferenceroomBooking.txt
	public void saveFileConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\conferenceroomBooking.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (ConferenceBooking conferenceBooking : listConferenceBooking) {
				String line = conferenceBooking.getId() + ";" + 
						dateToString(conferenceBooking.getDay()) + ";" + 
						timeToString(conferenceBooking.getStartTime()) + ";" + 
						timeToString(conferenceBooking.getEndTime()) + ";" + 
						conferenceBooking.getRoomID() + ";" + 
						conferenceBooking.getPrice();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
	
		}
	}
	
	// insert seat booking
	public void insertSeatBooking(ArrayList<SeatBooking> listSeatBooking, ArrayList<Seat> listSeat) {
		System.out.println("Enter the seatID you want to booking");
		SeatBooking seatBooking = new SeatBooking();
		String seatId ;
		boolean check = false;
		float pricePerHour = 0;
		
		// check existed seat id
		while (true) {
			seatId = sca.nextLine();
			for (int i = 0; i < listSeat.size(); i++) {
				if(listSeat.get(i).getSeatCode().equals(seatId)) {
					pricePerHour = listSeat.get(i).getPricePerHour();
					check = true;
					
				}
			}
			if(check == true) {
				System.out.println("seat ID matches! Please continue to enter information");
				break;
			}else {
				System.err.println("seat id does not exist = " + seatId + " Please try again");
			}	
		}
		
		System.out.println("Enter id ");
		String id = sca.nextLine();
		System.out.println("Enter date: (dd/MM/yyyy)");
		String day = sca.nextLine();
		LocalDate date = stringToDate(day);
		
		System.out.println("Enter start time");
		String startTime = sca.nextLine();
		LocalTime start = stringToTime(startTime);
			
		System.out.println("Enter end time");
		String endTime = sca.nextLine();
		LocalTime end = stringToTime(endTime);
		
		// Check overlapping booking time
		boolean duplicate = false;
			
		for (int i = 0; i < listSeatBooking.size(); i++) {
			if(listSeatBooking.get(i).getDay().equals(date)) {
				if( (listSeatBooking.get(i).getStartTime().isBefore(end)) && (listSeatBooking.get(i).getEndTime().isAfter(start))  ) {
					duplicate = true;
					break;
				}
			}	
		}
		if(duplicate == true) {
			System.err.println("Duplicate time! Please try again");
				
		}else {
			System.out.println("Time is suitable");
				
		}
		
		// price of seat booking  = (End time - Start time) * seatPricePerHour
		Float price = seatBooking.calculatePrice(pricePerHour, start, end);
		
		if(duplicate== false) {
			SeatBooking seatBooking1 = new SeatBooking(id, date, start, end, seatId, price);
			listSeatBooking.add(seatBooking1);
		}

	}
	
	// insert Conference room Booking
	public void insertConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking, ArrayList<ConferenceRoom> listConferenceRooms) {
		System.out.println("Enter the roomID you want to booking");
		ConferenceBooking conferenceBooking = new ConferenceBooking();
		String roomId ;
		boolean check = false;
		float pricePerHour = 0;
		
		// check existed  room id
		while (true) {
			roomId = sca.nextLine();
			for (int i = 0; i < listConferenceRooms.size(); i++) {
				if(listConferenceRooms.get(i).getRoomCode().equals(roomId)) {
					pricePerHour = listConferenceRooms.get(i).getPricePerHour();
					check = true;
					
				}
			}
			if(check == true) {
				System.out.println("room ID matches! Please continue to enter information");
				break;
			}else {
				System.err.println("room id does not exist = " + roomId + " Please try again");
			}	
		}
		
		System.out.println("Enter id ");
		String id = sca.nextLine();
		System.out.println("Enter date: (dd/MM/yyyy)");
		String day = sca.nextLine();
		LocalDate date = stringToDate(day);
		
		System.out.println("Enter start time");
		String startTime = sca.nextLine();
		LocalTime start = stringToTime(startTime);
			
		System.out.println("Enter end time");
		String endTime = sca.nextLine();
		LocalTime end = stringToTime(endTime);
		
		// Check overlapping booking time
		boolean duplicate = false;
			
		for (int i = 0; i < listConferenceBooking.size(); i++) {
			if(listConferenceBooking.get(i).getDay().equals(date)) {
				if( (listConferenceBooking.get(i).getStartTime().isBefore(end)) && (listConferenceBooking.get(i).getEndTime().isAfter(start))  ) {
					duplicate = true;
					break;
				}
			}	
		}
		if(duplicate == true) {
			System.err.println("Duplicate time! Please try again");
				
		}else {
			System.out.println("Time is suitable");
				
		}
		
		// price of conference room booking  = (End time - Start time) * conferencePricePerHour
		Float price = conferenceBooking.calculatePrice(pricePerHour, start, end);
		
		if(duplicate== false) {
			ConferenceBooking conferenceBooking1 = new ConferenceBooking(id, date, start, end, roomId, price);
			listConferenceBooking.add(conferenceBooking1);
		}

	}
	
	// view seat booking 
	public void viewSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		listSeatBooking.stream().forEach(System.out::println);
	}
	
	// view Conference room Booking
	public void viewConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		listConferenceBooking.stream().forEach(System.out::println);
	}
	
	// calculate total price for all seat and conference room bookings
	public void calculateTotalPrice(ArrayList<SeatBooking> listSeatBooking, ArrayList<ConferenceBooking> listConferenceBooking) {
		float sum1= (float) listSeatBooking.stream().mapToDouble(SeatBooking::getPrice).sum();
		float sum2= (float) listConferenceBooking.stream().mapToDouble(ConferenceBooking::getPrice).sum();
		float sumAll = sum1 +sum2;
		System.out.println("Total price for booking = "+ sumAll);
	}
}
