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
		
		System.out.println("Enter ID seat");
		String id = sca.nextLine();

		System.out.println("Enter Seat code");
		String seatCode;
		
		// check seat code duplicate
		while (true) {
			seatCode = sca.nextLine();
			boolean check = false;
			for (int i = 0; i < listSeat.size(); i++) {
				if(listSeat.get(i).getSeatCode().equalsIgnoreCase(seatCode)) {
					check = true;
					break;
				}
			}
			if(check == false ) {
				break;
			}else {
				System.err.println("Seat code duplicate! Please try again");
			}
		}
		
		System.out.println("Enter price per hour");
		Float pricePerHour = Float.parseFloat(sca.nextLine());
		System.out.println("Enter note");
		String note = sca.nextLine();
		
		Seat seat = new Seat(id, seatCode, pricePerHour, note);
		
		listSeat.add(seat);
		
	}


	// insert Conference room
	public void insertConferenceRoom(ArrayList<ConferenceRoom> listConferenceRoom) {
		System.out.println("insert ConferenceBooking");
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter ID Conference room");
		String id = sca.nextLine();
		
		System.out.println("Enter Room code");
		String roomCode ;
		
		// check room code duplicate
		while (true) {
			roomCode = sca.nextLine();
			boolean check = false;
			for (int i = 0; i < listConferenceRoom.size(); i++) {
				if(listConferenceRoom.get(i).getRoomCode().equalsIgnoreCase(roomCode)) {
					check = true;
					break;
				}
			}
			if(check == false ) {
				break;
			}else {
				System.err.println("room code duplicate! Please try again");
			}
		}
		
		System.out.println("Enter price per hour");
		Float pricePerHour = Float.parseFloat(sca.nextLine());
		
		System.out.println("Enter note");
		String note = sca.nextLine();
		
		ConferenceRoom conferenceRoom = new ConferenceRoom(id, roomCode, pricePerHour, note);
		
		listConferenceRoom.add(conferenceRoom);
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
