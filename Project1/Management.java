package Project1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
	
	
	
	// đọc file seat.txt
	public void readFileSeat(ArrayList<SeatBooking> listSeatBooking) {
		System.out.println("read file seat.txt");
		try {
			FileInputStream fis = new FileInputStream("seat.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = null;
			while((line = buf.readLine()) != null) {
				if(line.isEmpty()) {
					continue;
				}
				SeatBooking seat = new SeatBooking();
				seat.parse(line);  // parse()
				listSeatBooking.add(seat);
				
				buf.close();
				read.close();
				fis.close();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// đọc file conferenceroom.txt
	public void readFileConferenceRoom(ArrayList<ConferenceBooking> listConferenceBooking) {
		System.out.println("read file conferenceroom.txt");
		try {
			FileInputStream fis = new FileInputStream("conferenceroom.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = null;
			while((line = buf.readLine()) != null) {
				if(line.isEmpty()) {
					continue;
				}
				ConferenceBooking con = new ConferenceBooking();
				con.parse(line);  // parse()
				listConferenceBooking.add(con);
				
				buf.close();
				read.close();
				fis.close();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// ghi  file seat.txt
	public void saveFileSeat(ArrayList<SeatBooking> listSeatBooking) {
		System.out.println("save file seat.txt");
		try {
			FileOutputStream fos = new FileOutputStream("seat.txt");
			for (SeatBooking s : listSeatBooking) {
				String line = s.getFileLine(); /// getFileLine()
				byte[] b = line.getBytes("utf8");
				fos.write(b);
				fos.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// ghi file conferenceroom.txt
	public void saveFileConferenceRoom(ArrayList<ConferenceBooking> listConferenceBooking) {
		System.out.println("save file conferenceroom.txt");
		try {
			FileOutputStream fos = new FileOutputStream("conferenceroom.txt");
			for (ConferenceBooking s : listConferenceBooking) {
				String line = s.getFileLine(); /// getFileLine()
				byte[] b = line.getBytes("utf8");
				fos.write(b);
				fos.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// đặt thêm chỗ ngồi 
	public void insertSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		System.out.println("insert SeatBooking");
		Scanner sca = new Scanner(System.in);
		SeatBooking s = new SeatBooking();
		s.inputSeat();
		listSeatBooking.add(s);
	}
	
	// đặt thêm phòng
	public void insertConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		System.out.println("insert ConferenceBooking");
		Scanner sca = new Scanner(System.in);
		ConferenceBooking s = new ConferenceBooking();
		s.inputConferenceRoom();
		listConferenceBooking.add(s);
	}
	
	// hiển thị chỗ ngồi
	public void viewSeatBooking(ArrayList<SeatBooking> listSeatBooking) {
		for (SeatBooking s : listSeatBooking) {
			s.outputSeat();
		}
	}
		
	// hiển thị phòng
	public void viewConferenceBooking(ArrayList<ConferenceBooking> listConferenceBooking) {
		for (ConferenceBooking s : listConferenceBooking) {
			s.outputConferenceRoom();
		}
	}	
	
	public void CalculateAll(ArrayList<SeatBooking> listSeatBooking, ArrayList<ConferenceBooking> listConferenceBooking) {
		float sum1 = 0;
		float sum2 = 0;
		
		for (SeatBooking s : listSeatBooking) {
			sum1 += s.CalculatePrice();
		}
		for (ConferenceBooking c : listConferenceBooking) {
			sum2 += c.CalculatePrice();
		}
		float sumAll = sum1+sum2;
	}
}
