package booking_project.program;

import java.util.ArrayList;
import java.util.Scanner;

import booking_project.function.IoRoom;
import booking_project.function.IoSeat;
import booking_project.function.IoUser;
import booking_project.model.ConferenceRoom;
import booking_project.model.Seat;
import booking_project.model.User;

public class Main {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
	
	
	public static void main(String[] args) {
		
		System.out.println("*****Booking Program****");
		int login = login();
		while(true) {
			switch(login) {
			case 1: 
				menu();
				break;
			case 2:
				System.err.println("Login failed,User name or password is wrong! Please try again!");
				login = login();
				break;
			}
		}
	}

	//method login to check input username and password
	private static int login() {
		ArrayList<User> listUser = new ArrayList<User>();
		listUser = IoUser.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\user_pass.txt");
		System.out.println("----Login----");
		System.out.println("Enter User Name & Password:");
		System.out.print("Username: ");
		String username = new Scanner(System.in).nextLine();
		System.out.print("Password: ");
		String password = new Scanner(System.in).nextLine();
		for(User user : listUser) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				return 1;
			}
		}
		return 2;
	}

	//method create menu
	private static void menu() {
		System.out.println("=>>Login Successful !");
		System.out.println("----Main Menu----");
		System.out.println("1.User");
		System.out.println("2.Booking");
		System.out.println("3.Room");
		System.out.println("4.Seat");
		System.out.println("5.End program");
		System.out.println("Please choose action:");
		
		int n = new Scanner(System.in).nextInt();
		if (n == 1) {
			while (true) {
				System.out.println("---User Menu---");
				System.out.println("1.Create new user");
				System.out.println("2.Show list user");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("Choose one action:");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
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
		}
		
		
		else if (n == 2) {
			while (true) {
				System.out.println("---Booking Menu---");
				System.out.println("1.BookingRoom");
				System.out.println("2.BookingSeat");
				System.out.println("3.Back to main menu");
				System.out.println("Please choose action :");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					bookingSeat();
					break;
				case 2:
					bookingRoom();
					break;
				case 3:
					menu();
					break;
				}
			}
		}
		
		else if (n == 3) {
			while (true) {
				System.out.println("---Room Menu---");
				System.out.println("1.Create new room");
				System.out.println("2.Show list room");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("Please choose action :");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
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
		}
		else if (n == 4) {
			while (true) {
				System.out.println("---Seat Menu---");
				System.out.println("1.Add new seat");
				System.out.println("2.Show list seat");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("Please choose action");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					addNewSeat();
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
		}
		else {
			System.err.println("Good bye!");
			System.exit(0);
		}	
	}
	
		
		private static void bookingRoom() {
		// TODO Auto-generated method stub
		
	}

		private static void bookingSeat() {
		// TODO Auto-generated method stub
		
	}

		//read file seat_information.txt
		private static void readSeatFile() {
			listSeat = IoSeat.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_information.txt");
			System.out.println("-->Read file seat_information.txt into listSeat success");
		}

		//save listSeat in seatinformation.txt
		private static void saveSeatFile() {
			if (IoSeat.saveFile(listSeat, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_information.txt")) {
				System.out.println("-->Save listSeat into file seat_information.txt success");
			}
		}

		//show all seat of listSeat
		private static void showSeats() {
			for (Seat seat : listSeat) {
				System.out.println(seat);
			}
		}

		// method to create new seat
		private static void addNewSeat() {
			System.out.print("Input seat code: ");
			String seatCode = new Scanner(System.in).nextLine();
			System.out.print("Input price per hour($): ");
			double pricePerHour = new Scanner(System.in).nextDouble();
			System.out.print("Input note: ");
			String note = new Scanner(System.in).nextLine();

			Seat seat = new Seat();
			if (listSeat.size() == 0) {
				seat.setId(1);
			} else {
				seat.setId((listSeat.get(listSeat.size() - 1).getId()) + 1);
			}
			seat.setSeatCode(seatCode);
			seat.setPricePerHour(pricePerHour);
			seat.setNote(note);

			if (listSeat.add(seat)) {
				System.out.println("==>Add new seat into listSeat success");
			} else {
				System.out.println("==>Add new seat into listSeat failed!");
			}
		}

		//read file user_pass.txt
		private static void readUserFile() {
			listUser = IoUser.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\user_pass.txt");
			System.out.println("-->Read file complete");
		
	}

		//save listUser in user_pass.txt
		private static void saveUserFile() {
		if (IoUser.saveFile(listUser, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\user_pass.txt")) {
			System.out.println("-->Save file success");
		}
	}

		//show all user of list user
		private static void showUsers() {
		for (User user : listUser) {
			System.out.println(user);
				}
			
	}
		//create user 
		private static void createUser() {
			System.out.print("Input Username: ");
			String username = new Scanner(System.in).nextLine();
			System.out.print("Input Password: ");
			String password = new Scanner(System.in).nextLine();

			User user = new User(username, password);
			listUser.add(user);
		
}
		//create a new room
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
		//read file room.txt
		private static void readRoomFile() {
			listRoom = IoRoom.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\conferenceroom_info.txt");
			System.out.println("-->Read file complete");
		}
		
		//save listRoom in room.txt
		private static void saveRoomFile() {
			if (IoRoom.saveFile(listRoom, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\conferenceroom_info.txt")) {
				System.out.println("-->Save file success");
			}
		}
		
		//show all room of listRoom
		private static void showRooms() {
			for (ConferenceRoom room : listRoom) {
				System.out.println(room);
			}
		}
		
}
