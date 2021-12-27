package program;

import java.util.ArrayList;
import java.util.Scanner;

import io.ioRoom;
import io.ioSeat;
import io.ioUser;
import model.ConferenceRoom;
import model.Seat;
import model.User;

public class BookingProgram {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
	public static void menu() {
		System.out.println("--- Main menu ---");
		System.out.println("1.User");
		System.out.println("2.Room");
		System.out.println("3.Seat");
		System.out.println("4.End program");
		System.out.println("What do you want?");
		
		int n = new Scanner(System.in).nextInt();
		if(n==1) {
			while(true) {
				System.out.println("-- User menu --");
				System.out.println("1.Create new user");
				System.out.println("2.Show list user");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");
				
				int m = new Scanner(System.in).nextInt();
				switch(m) {
				case 1:
					createUser();
					break;
				case 2:
					showUsers();
					break;
				case 3: 
					saveUserFile();
					break;
				case 4:
					readUserFile();
					break;
				case 5:
					menu();
					break;
				}
			}
		} else if(n==2) {
			while(true) {
				System.out.println("-- Room menu --");
				System.out.println("1.Create new room");
				System.out.println("2.Show list room");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");
				
				int m = new Scanner(System.in).nextInt();
				switch(m) {
				case 1:
					createRoom();
					break;
				case 2:
					showRooms();
					break;
				case 3: 
					saveRoomFile();
					break;
				case 4:
					readRoomFile();
					break;
				case 5:
					menu();
					break;
				}
			}
		} else if(n==3) {
			while(true) {
				System.out.println("-- Seat menu --");
				System.out.println("1.Create new seat");
				System.out.println("2.Show list seat");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");
				
				int m = new Scanner(System.in).nextInt();
				switch(m) {
				case 1:
					createSeat();
					break;
				case 2:
					showSeats();
					break;
				case 3: 
					saveSeatFile();
					break;
				case 4:
					readSeatFile();
					break;
				case 5:
					menu();
					break;
				}
			}
		} else {
			System.err.println("Good bye!");
			System.exit(0);
		}
	}
	
	private static void readSeatFile() {
		listSeat = ioSeat.readFile("G:\\databk\\seat.txt");
		System.out.println("-->Read file complete");
	}

	private static void saveSeatFile() {
		if(ioSeat.saveFile(listSeat, "G:\\databk\\seat.txt")) {
			System.out.println("-->Save file success");
		}
	}

	private static void showSeats() {
		for(Seat seat : listSeat) {
			System.out.println(seat);
		}
	}

	private static void createSeat() {
		System.out.print("Input id: ");
		int id = new Scanner(System.in).nextInt();
		System.out.print("Input seat code: ");
		String seatCode = new Scanner(System.in).nextLine();
		System.out.print("Input price per hour($): ");
		double pricePerHour = new Scanner(System.in).nextDouble();
		System.out.print("Input note: ");
		String note = new Scanner(System.in).nextLine();
		
		Seat seat = new Seat(id, seatCode, pricePerHour, note);
		listSeat.add(seat);
	}

	private static void readRoomFile() {
		listRoom = ioRoom.readFile("G:\\databk\\room.txt");
		System.out.println("-->Read file complete");
	}

	private static void saveRoomFile() {
		if(ioRoom.saveFile(listRoom, "G:\\databk\\room.txt")) {
			System.out.println("-->Save file success");
		}
	}

	private static void showRooms() {
		for(ConferenceRoom room : listRoom) {
			System.out.println(room);
		}
	}

	private static void createRoom() {
		System.out.print("Input id: ");
		int id = new Scanner(System.in).nextInt();
		System.out.print("Input room code: ");
		String roomCode = new Scanner(System.in).nextLine();
		System.out.print("Input price per hour($): ");
		double pricePerHour = new Scanner(System.in).nextDouble();
		System.out.print("Input note: ");
		String note = new Scanner(System.in).nextLine();
		
		ConferenceRoom room = new ConferenceRoom(id, roomCode, pricePerHour, note);
		listRoom.add(room);
	}

	private static void readUserFile() {
		listUser = ioUser.readFile("G:\\databk\\user.txt");
		System.out.println("-->Read file complete");
	}

	private static void saveUserFile() {
		if(ioUser.saveFile(listUser, "G:\\databk\\user.txt")) {
			System.out.println("-->Save file success");
		}
	}

	private static void showUsers() {
		for(User user : listUser) {
			System.out.println(user);
		}
	}

	private static void createUser() {
		System.out.print("Input Username: ");
		String username = new Scanner(System.in).nextLine();
		System.out.print("Input Password: ");
		String password = new Scanner(System.in).nextLine();
		
		User user = new User(username, password);
		listUser.add(user);
	}

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
}
