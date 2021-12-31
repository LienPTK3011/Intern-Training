package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<User> listUser = new ArrayList<>();
	
	static ArrayList<Seat> listSeat = new ArrayList<>();
	static ArrayList<ConferenceRoom> listConferenceRooms = new ArrayList<>();
	
	static ArrayList<SeatBooking> listSeatBooking = new ArrayList<>();
	static ArrayList<ConferenceBooking> listConferenceBooking = new ArrayList<>();
	
	static Login login = new Login();
	static ManageSeatRoom managerSeatRoom = new ManageSeatRoom();
	static ManageBooking booking = new ManageBooking();
	
	static Scanner sca = new Scanner(System.in);
	

	// account management
	public static  void userManager() {
		int chose = 0;
		do {
			System.out.println("==== Account Management ===");
			System.out.println("function 1: view Username && Password");
			System.out.println("function 2: insert Username && Password");
			System.out.println("function 3: update Username && Password");
			System.out.println("function 4: delete Username && Password");
			System.out.println("function 5: save file User");
			System.out.println("function 6: back to main menu!");
				
			try {
				System.out.println("=> choose function ");
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose) {
			case 1: 		
				login.viewUser(listUser);
				break;
			case 2: 		
				login.insertUser(listUser);
				break;
			case 3:
				login.updateUser(listUser);
				break;
			case 4:
				login.deleteUser(listUser);
				break;
			case 5:
				login.saveFileUser(listUser);
				break;
			case 6:
				System.out.println("back to main menu");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose !=6);
	}
	

	
	// management seat
	public static  void managerSeat() {
		int chose = 0;

		do {
			System.out.println("==== Seat Management ===");
			System.out.println("function 1: read file seat.txt");
			System.out.println("function 2: view seat");
			System.out.println("function 3: insert seat");
			System.out.println("function 4: save file seat.txt");
			System.out.println("function 5: back to main menu!");
				
			try {
				System.out.println("=> choose function ");
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose) {
			case 1:
				managerSeatRoom.readFileSeat(listSeat);
				break;
			case 2: 		
				managerSeatRoom.viewSeat(listSeat);
				break;
			case 3:
				managerSeatRoom.insertSeat(listSeat);
				break;
			case 4:
				managerSeatRoom.saveFileSeat(listSeat);
				break;
			case 5:
				System.out.println("back to main menu");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose !=5);
	}
	
	
	// management Room
	public static  void managerRoom() {
		int chose = 0;
		
		do {
			System.out.println("==== Room Management ===");
			System.out.println("function 1: read file conferenceroom.txt");
			System.out.println("function 2: view Conference Room");
			System.out.println("function 3: insert Conference Room");
			System.out.println("function 4: save file conferenceroom.txt");
			System.out.println("function 5: back to main menu!");
				
			try {
				System.out.println("=> choose function ");
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose) {
			case 1:
				managerSeatRoom.readFileConferenceRoom(listConferenceRooms);
				break;
			case 2: 		
				managerSeatRoom.viewConferenceRoom(listConferenceRooms);
				break;
			case 3:
				managerSeatRoom.insertConferenceRoom(listConferenceRooms);
				break;
			case 4:
				managerSeatRoom.saveFileConferenceRoom(listConferenceRooms);
				break;
			case 5:
				System.out.println("back to main menu");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose !=5);
	}
	
	// seat booking 
	public static  void seatBooking() {
		int chose = 0;
		do {
			System.out.println("==== Seat Booking ===");
			System.out.println("function 1: read file seatBooking.txt");
			System.out.println("function 2: view Seat Booking");
			System.out.println("function 3: insert Seat Booking");
			System.out.println("function 4: save file seatBooking.txt");
			System.out.println("function 5: back to main menu!");
				
			try {
				System.out.println("=> choose function ");
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose) {
			case 1:
				booking.readFileSeatBooking(listSeatBooking);
				break;
			case 2: 		
				booking.viewSeatBooking(listSeatBooking);
				break;
			case 3:
				booking.insertSeatBooking(listSeatBooking);
				break;
			case 4:
				booking.saveFileSeatBooking(listSeatBooking);
				break;
			case 5:
				System.out.println("back to main menu");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose !=5);
	}
	
	// room booking 
	public static  void roomBooking() {
		int chose = 0;
		do {
			System.out.println("==== Room Booking ===");
			System.out.println("function 1: read file conferenceroomBooking.txt");
			System.out.println("function 2: view Room Booking");
			System.out.println("function 3: insert Room Booking");
			System.out.println("function 4: save file conferenceroomBooking.txt");
			System.out.println("function 5: back to main menu!");
				
			try {
				System.out.println("=> choose function ");
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose) {
			case 1:
				booking.readFileConferenceBooking(listConferenceBooking);
				break;
			case 2: 		
				booking.viewConferenceBooking(listConferenceBooking);
				break;
			case 3:
				booking.insertConferenceBooking(listConferenceBooking);
				break;
			case 4:
				booking.saveFileConferenceBooking(listConferenceBooking);
				break;
			case 5:
				System.out.println("back to main menu");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose !=5);
	}
	
	public static void main(String[] args) {
		login.readFileUser(listUser);
		if(login.checkLogin(listUser)) {

			int chooseMenu = 0;
			do {
				System.out.println("====**** Main menu ****====");
				System.out.println("Function 1: Account Management");
				System.out.println("Function 2: Seat Management");
				System.out.println("Function 3: Room Management");
				System.out.println("Function 4: Seat Booking");
				System.out.println("Function 5: Room Booking");
				System.out.println("Function 6: Exit !");
				
				try {
					System.out.println("=> choose Menu ");
					chooseMenu = Integer.parseInt(sca.nextLine());
				} catch (Exception e) {
					System.err.println("you must enter the number");
				}
				
				switch (chooseMenu) {
				case 1: 		
					userManager();
					break;
				case 2: 		
					managerSeat();
					break;
				case 3:
					managerRoom();
					break;
				case 4:
					seatBooking();
					break;
				case 5:
					roomBooking();
					break;
				case 6:
					System.out.println("Exit !");
					break;
				default:
					System.out.println("choose again");
					break;
				}
				
			} while (chooseMenu != 6);
		}
	
	}

	
}
