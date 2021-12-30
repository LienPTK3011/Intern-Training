package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<User> listUser = new ArrayList<>();
	static ArrayList<SeatBooking> listSeatBooking = new ArrayList<>();
	static ArrayList<ConferenceBooking> listConferenceBooking = new ArrayList<>();
	
	static Login login = new Login();
	static Management management = new Management();
	static Booking booking = new Booking();
	
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
	
	// choose management option
	public static  void managerSeatRoom() {
		int option =0;
		System.out.println("==== Management seat - room ===");
		System.out.println("Option 1: Seat management");
		System.out.println("Option 2: Room management");
		System.out.println("Option 3: back to main menu!");
		System.out.println("=> choose option: ");
		try {
			option = Integer.parseInt(sca.nextLine());
		} catch (Exception e) {
			System.err.println("you must enter the number");
		}
		
		do {
			switch (option) {
			case 1:
				managerSeat();
				break;
			case 2:
				managerRoom();
				break;
			case 3:
				System.out.println("back to main menu !");
				break;
			default:
				System.err.println("choose again");
				break;
			}
		} while (option !=3);

	}
	
	// management seat
	public static  void managerSeat() {
		int chose1 = 0;
		do {
			System.out.println("==== Seat Management ===");
			System.out.println("function 1: read file seat.txt");
			System.out.println("function 2: view seat");
			System.out.println("function 3: insert seat");
			System.out.println("function 4: save file seat.txt");
			System.out.println("function 5: back !");
				
			try {
				System.out.println("=> choose function ");
				chose1 = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose1) {
			case 1: 		
				management.readFileSeat(listSeatBooking);
				break;
			case 2: 		
				management.viewSeatBooking(listSeatBooking);
				break;
			case 3:
				management.insertSeatBooking(listSeatBooking);
				break;
			case 4:
				management.saveFileSeat(listSeatBooking);
				break;
			case 5:
				System.out.println("back !");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose1 !=5);
	}
	
	
	// management Room
	public static  void managerRoom() {
		int chose2 = 0;
		do {
			System.out.println("==== Room Management ===");
			System.out.println("function 1: read file conferenceroom.txt");
			System.out.println("function 2: view Conference Room");
			System.out.println("function 3: insert Conference Room");
			System.out.println("function 4: save file conferenceroom.txt");
			System.out.println("function 5: back !");
				
			try {
				System.out.println("=> choose function ");
				chose2 = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("you must enter the number");
			}
			
			switch (chose2) {
			case 1: 		
				management.readFileConferenceRoom(listConferenceBooking);
				break;
			case 2: 		
				management.viewConferenceBooking(listConferenceBooking);
				break;
			case 3:
				management.insertConferenceBooking(listConferenceBooking);
				break;
			case 4:
				management.saveFileConferenceRoom(listConferenceBooking);
				break;
			case 5:
				System.out.println("back !");
				break;
			default:
				System.out.println("choose again");
				break;
			}
		} while (chose2 !=5);
	}
	
	public static void main(String[] args) {
		
		
		login.readFileUser(listUser);
		if(login.checkLogin(listUser)) {

			int chooseMenu = 0;
			do {
				System.out.println("====**** Main menu ****====");
				System.out.println("Function 1: Account Management");
				System.out.println("Function 2: Management Seat - Room");
				System.out.println("Function 3: Booking");
				System.out.println("Function 4: Exit !");
				
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
					managerSeatRoom();
					break;
				case 3:
					
					break;
				case 4:
					System.out.println("Exit !");
					break;
				default:
					System.out.println("choose again");
					break;
				}
				
			} while (chooseMenu !=4);
		}
	
	}

	
}
