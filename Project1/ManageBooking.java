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

public class ManageBooking {
	

	
	// date convert
	DateTimeFormatter dtd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public LocalDate stringToDate(String s) {
		LocalDate d = LocalDate.parse(s,dtd);
		return d;
	}
	
	public String dateToString(LocalDate d) {
		return dtd.format(d);
	}

	
	// time convert
	DateTimeFormatter dtt = DateTimeFormatter.ofPattern("HH:mm");
	public LocalTime stringToTime(String s) {
		LocalTime t = LocalTime.parse(s, dtt);
		return t;
	}
	
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
							seatBooking.getPrice() + ";" + 
							seatBooking.calculatePrice();
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
						conferenceBooking.getPrice() + ";" + 
						conferenceBooking.calculatePrice();
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
	public void insertSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		
	}
	
	// insert Conference room Booking
	public void insertConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		
	}
	
	// view seat booking 
	public void viewSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		for (SeatBooking seatBooking : listSeatBooking) {
			System.out.println(seatBooking);
		}
	}
	
	// view Conference room Booking
	public void viewConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		for (ConferenceBooking conferenceBooking : listConferenceBooking) {
			System.out.println(conferenceBooking);
		}
	}
}
