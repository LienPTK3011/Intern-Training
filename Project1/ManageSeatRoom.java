package Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageSeatRoom {
	
	
	
	// read file seat.txt
	public void readFileSeat(ArrayList<Seat> listSeat) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\seat.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = buf.readLine();
			while (line != null) {
				String[] p = line.split(";");
				if(p.length == 4) {
					Seat seat = new Seat();
					seat.setId(p[0]);
					seat.setSeatCode(p[1]);
					seat.setPricePerHour(Float.parseFloat(p[2]));
					seat.setNote(p[3]);
					
					listSeat.add(seat);
				}
				line = buf.readLine();
			}
			
			buf.close();
			read.close();
			fis.close();
		} catch (Exception e) {
			
		}
	}
	
	// read file conferenceroom.txt
	public void readFileConferenceRoom(ArrayList<ConferenceRoom> listConferenceRoom) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\conferenceroom.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);

			String line = buf.readLine();
			while (line != null) {
				String[] p = line.split(";");
				if(p.length == 4) {
					ConferenceRoom conferenceRoom = new ConferenceRoom();
					
					conferenceRoom.setId(p[0]);
					conferenceRoom.setRoomCode(p[1]);
					conferenceRoom.setPricePerHour(Float.parseFloat(p[2]));
					conferenceRoom.setNote(p[3]);
					
					listConferenceRoom.add(conferenceRoom);
				}
				line = buf.readLine();
			}
			
			buf.close();
			read.close();
			fis.close();
			
		} catch (Exception e) {
			
		}
	}
	
	// write  file seat.txt
	public void saveFileSeat(ArrayList<Seat> listSeat) {
		System.out.println("save file seat.txt");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\seat.txt");
			OutputStreamWriter ows = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(ows);
			
			for (Seat s : listSeat) {
				String line = s.getId() + ";" + s.getSeatCode() + ";" + s.getPricePerHour() + ";" + s.getNote();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			ows.close();
			fos.close();
		} catch (Exception e) {
			
		}
	}
	
	// write file conferenceroom.txt
	public void saveFileConferenceRoom(ArrayList<ConferenceRoom> listConferenceRoom) {
		System.out.println("save file conferenceroom.txt");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\conferenceroom.txt");
			OutputStreamWriter ows = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(ows);
			for (ConferenceRoom s : listConferenceRoom) {
				String line = s.getId() + ";" + s.getRoomCode() + ";" + s.getPricePerHour() + ";" + s.getNote();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			ows.close();
			fos.close();
		} catch (Exception e) {
			
		}
	}
	
	// insert seat 
	public void insertSeat(ArrayList<Seat> listSeat) {
		System.out.println("insert SeatBooking");
		Scanner sca = new Scanner(System.in);
		Seat seat = new Seat();
		seat.inputSeat();
		listSeat.add(seat);
	}
	

	// insert Conference room
	public void insertConferenceRoom(ArrayList<ConferenceRoom> listConferenceRoom) {
		System.out.println("insert ConferenceBooking");
		Scanner sca = new Scanner(System.in);
		ConferenceRoom s = new ConferenceRoom();
		s.inputConferenceRoom();
		listConferenceRoom.add(s);
	}
	
	// view seat 
	public void viewSeat(ArrayList<Seat> listSeat) {
		listSeat.stream().forEach(System.out::println);

	}
		
	// view conference room
	public void viewConferenceRoom(ArrayList<ConferenceRoom> listConferenceRoom) {
		listConferenceRoom.stream().forEach(System.out::println);
		
	}	
	

}
