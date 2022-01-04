/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01.file;

import btl01.model.Booking;
import btl01.name.ConferenceRoom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Bookingio {
    
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
    
    public static boolean save(ArrayList<Booking> listBooking, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Booking booking : listBooking) {
				String line =  booking.getId() + ";" + dateToString(booking.getDay()) + ";"+timeToString(booking.getStartTime()) + ";" + timeToString(booking.getEndTime()) + ";" + booking.getRoomid() + ";" + booking.getSeatid() + ";" + booking.getPrice();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Booking> readFile(String path) {
		ArrayList<Booking> listBooking = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 8) {
					Booking booking = new Booking();
					booking.setId(arr[0]);
					booking.setDay(stringToDate(arr[1]));
                                        booking.setStartTime(stringToTime(arr[2]));
					booking.setEndTime(stringToTime(arr[3]));
                                        booking.setRoomid(arr[4]);
					booking.setSeatid(arr[5]);
					booking.setPrice(Double.parseDouble(arr[6]));
					listBooking.add(booking);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBooking;
	}
}
