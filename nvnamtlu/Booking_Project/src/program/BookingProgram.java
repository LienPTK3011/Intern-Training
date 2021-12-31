package program;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import io.IORoom;
import io.IORoomBooking;
import io.IOSeat;
import io.IOSeatBooking;
import io.IOUser;
import model.ConferenceRoom;
import model.Seat;
import model.User;
import util.DateConverter;
import util.TimeConverter;
import model.ConferenceBooking;
import model.SeatBooking;

public class BookingProgram {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
	static ArrayList<SeatBooking> listSeatBooking = new ArrayList<SeatBooking>();
	static ArrayList<ConferenceBooking> listRoomBooking = new ArrayList<ConferenceBooking>();

	// method to create menu for manager
	public static void menuForManager() {
		System.out.println("--- Menu for Manager ---");
		System.out.println("1.User");
		System.out.println("2.Room");
		System.out.println("3.Seat");
		System.out.println("4.End program");
		System.out.println("What do you want?");

		int n = new Scanner(System.in).nextInt();
		if (n == 1) {
			while (true) {
				System.out.println("-- User manage menu --");
				System.out.println("1.Add new user");
				System.out.println("2.Show list user");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					addNewUser();
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
					menuForManager();
					break;
				}
			}
		} else if (n == 2) {
			while (true) {
				System.out.println("-- Room manage menu --");
				System.out.println("1.Add new room");
				System.out.println("2.Show list room");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					addNewRoom();
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
					menuForManager();
					break;
				}
			}
		} else if (n == 3) {
			while (true) {
				System.out.println("-- Seat manage menu --");
				System.out.println("1.Add new seat");
				System.out.println("2.Show list seat");
				System.out.println("3.Save file");
				System.out.println("4.Read file");
				System.out.println("5.Back to main menu");
				System.out.println("What do you want?");

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
					menuForManager();
					break;
				}
			}
		} else {
			System.err.println("Good bye!");
			System.exit(0);
		}
	}

	// method to read file seat.txt
	private static void readSeatFile() {
		listSeat = IOSeat.readFile("G:\\databk\\seat.txt");
		System.out.println("-->Read file seat.txt into listSeat success");
	}

	// method to save listSeat in seat.txt
	private static void saveSeatFile() {
		if (IOSeat.saveFile(listSeat, "G:\\databk\\seat.txt")) {
			System.out.println("-->Save listSeat into file seat.txt success");
		}
	}

	// method to show all seat of listSeat
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
			System.out.println("-->Add new seat into listSeat success");
		} else {
			System.out.println("-->Add new seat into listSeat failed!");
		}
	}

	// method to read file room.txt
	private static void readRoomFile() {
		listRoom = IORoom.readFile("G:\\databk\\room.txt");
		System.out.println("-->Read file room.txt into listRoom success");
	}

	// method to save listRoom in room.txt
	private static void saveRoomFile() {
		if (IORoom.saveFile(listRoom, "G:\\databk\\room.txt")) {
			System.out.println("-->Save listRoom into file room.txt success");
		}
	}

	// method to show all room of listRoom
	private static void showRooms() {
		for (ConferenceRoom room : listRoom) {
			System.out.println(room);
		}
	}

	// method to create new room
	private static void addNewRoom() {
		System.out.print("Input room code: ");
		String roomCode = new Scanner(System.in).nextLine();
		System.out.print("Input price per hour($): ");
		double pricePerHour = new Scanner(System.in).nextDouble();
		System.out.print("Input note: ");
		String note = new Scanner(System.in).nextLine();

		ConferenceRoom room = new ConferenceRoom();
		if (listRoom.size() == 0) {
			room.setId(1);
		} else {
			room.setId((listRoom.get(listRoom.size() - 1).getId()) + 1);
		}
		room.setRoomCode(roomCode);
		room.setPricePerHour(pricePerHour);
		room.setNote(note);

		if (listRoom.add(room)) {
			System.out.println("-->Add new room into listRoom success");
		} else {
			System.out.println("-->Add new room into listRoom failed!");
		}
	}

	// method to read file user.txt
	private static void readUserFile() {
		listUser = IOUser.readFile("G:\\databk\\user.txt");
		System.out.println("-->Read file user.txt into listUser success");
	}

	// method to save listUser in user.txt
	private static void saveUserFile() {
		if (IOUser.saveFile(listUser, "G:\\databk\\user.txt")) {
			System.out.println("-->Save listUser into file user.txt success");
		}
	}

	// method to show all user of listUser
	private static void showUsers() {
		for (User user : listUser) {
			System.out.println(user);
		}
	}

	// method to create new user
	private static void addNewUser() {
		System.out.print("Input Username: ");
		String username = new Scanner(System.in).nextLine();
		System.out.print("Input Password: ");
		String password = new Scanner(System.in).nextLine();

		User user = new User(username, password);

		if (listUser.add(user)) {
			System.out.println("-->Add new user into listUser success");
		} else {
			System.out.println("-->Add new room into listUser failed!");
		}

	}

	// method to create menu for user
	public static void menuForUser() {
		System.out.println("--- Menu for user ---");
		System.out.println("1.Booking room");
		System.out.println("2.Booking seat");
		System.out.println("3.End program");
		System.out.println("What do you want?");

		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			bookingRoom();
			break;
		case 2:
			bookingSeat();
			break;
		case 3:
			System.err.println("Good bye!");
			System.exit(0);
			break;
		}
	}

	// method to get the later time between two input times
	private static LocalTime timeAfter(LocalTime lt1, LocalTime lt2) {
		if (lt1.isAfter(lt2)) {
			return lt1;
		}
		return lt2;
	}

	// method to get the previous time between two input times
	private static LocalTime timeBefore(LocalTime lt1, LocalTime lt2) {
		if (lt1.isBefore(lt2)) {
			return lt1;
		}
		return lt2;
	}

	// method to booking seat for user
	private static void bookingSeat() {
		listSeat = IOSeat.readFile("G:\\databk\\seat.txt");
		listSeatBooking = IOSeatBooking.readFile("G:\\databk\\seatBooking.txt");
		System.out.print("Input seat code: ");
		String seatCode = new Scanner(System.in).nextLine();
		System.out.print("Input Date(dd/MM/yyyy): ");
		String strDay = new Scanner(System.in).nextLine();
		System.out.print("Input start time(HH:mm): ");
		String strST = new Scanner(System.in).nextLine();
		System.out.print("Input end time(HH:mm): ");
		String strET = new Scanner(System.in).nextLine();

		SeatBooking seatBooking = new SeatBooking();
		if (listSeatBooking.size() == 0) {
			seatBooking.setId(1);
		} else {
			seatBooking.setId((listSeatBooking.get(listSeatBooking.size() - 1).getId()) + 1);
		}
		seatBooking.setSeatCode(seatCode);
		seatBooking.setDay(DateConverter.stringToDate(strDay));
		seatBooking.setStartTime(TimeConverter.stringToTime(strST));
		seatBooking.setEndTime(TimeConverter.stringToTime(strET));

		int temp = 0;
		boolean overlapTime = false;
		for (int i = 0; i < listSeat.size(); i++) {
			if (listSeat.get(i).getSeatCode().equals(seatCode)) {
				temp = 1;
				seatBooking.setPrice(listSeat.get(i).getPricePerHour());
				for (int j = 0; j < listSeatBooking.size(); j++) {
					if (seatBooking.getDay().equals(listSeatBooking.get(j).getDay())
							&& timeAfter(seatBooking.getStartTime(), listSeatBooking.get(j).getStartTime()).isBefore(
									timeBefore(seatBooking.getEndTime(), listSeatBooking.get(j).getEndTime()))) {
						overlapTime = true;
						break;
					}
				}
				if (seatBooking.getStartTime().isAfter(seatBooking.getEndTime())) {
					System.err.println("Can not booking for this time!");
				} else {
					if (overlapTime) {
						System.err.println("This seat has been booked at this time!");
						break;
					} else {
						System.out.println("--> Done booking seat with:");
						System.out.println("Seat code: " + seatBooking.getSeatCode());
						System.out.println("Date: " + DateConverter.dateToString(seatBooking.getDay()));
						System.out.println("Time: " + seatBooking.getStartTime() + " to " + seatBooking.getEndTime());
						System.out.println("Price per hour: " + seatBooking.getPrice()+"$");
						System.out.println("Your must to pay " + seatBooking.calculatePrice() + "$");
						listSeatBooking.add(seatBooking);
						IOSeatBooking.saveFile(listSeatBooking, "G:\\databk\\seatBooking.txt");
						break;
					}
				}
			}
		}
		if (temp == 0) {
			System.err.println("Seat code does not exist!");
		}
	}

	// method to booking room for user
	private static void bookingRoom() {
		listRoom = IORoom.readFile("G:\\databk\\room.txt");
		listRoomBooking = IORoomBooking.readFile("G:\\databk\\roomBooking.txt");
		System.out.print("Input room code: ");
		String roomCode = new Scanner(System.in).nextLine();
		System.out.print("Input Date(dd/MM/yyyy): ");
		String strDay = new Scanner(System.in).nextLine();
		System.out.print("Input start time(HH:mm): ");
		String strST = new Scanner(System.in).nextLine();
		System.out.print("Input end time(HH:mm): ");
		String strET = new Scanner(System.in).nextLine();

		ConferenceBooking roomBooking = new ConferenceBooking();
		if (listRoomBooking.size() == 0) {
			roomBooking.setId(1);
		} else {
			roomBooking.setId(listRoomBooking.get(listRoomBooking.size() - 1).getId() + 1);
		}
		roomBooking.setRoomCode(roomCode);
		roomBooking.setDay(DateConverter.stringToDate(strDay));
		roomBooking.setStartTime(TimeConverter.stringToTime(strST));
		roomBooking.setEndTime(TimeConverter.stringToTime(strET));

		int temp = 0;
		boolean overlapTime = false;
		for (int i = 0; i < listRoom.size(); i++) {
			if (listRoom.get(i).getRoomCode().equals(roomCode)) {
				temp = 1;
				roomBooking.setPrice(listRoom.get(i).getPricePerHour());
				for (int j = 0; j < listRoomBooking.size(); j++) {
					if (roomBooking.getDay().equals(listRoomBooking.get(j).getDay())
							&& timeAfter(roomBooking.getStartTime(), listRoomBooking.get(j).getStartTime()).isBefore(
									timeBefore(roomBooking.getEndTime(), listRoomBooking.get(j).getEndTime()))) {
						overlapTime = true;
						break;
					}
				}
				if (roomBooking.getStartTime().isAfter(roomBooking.getEndTime())) {
					System.err.println("Can not booking for this time!");
				} else {
					if (overlapTime) {
						System.err.println("This room has been booked at this time!");
						break;
					} else {
						System.out.println("--> Done booking conference room with:");
						System.out.println("Room code: " + roomBooking.getRoomCode());
						System.out.println("Date: " + DateConverter.dateToString(roomBooking.getDay()));
						System.out.println("Time: " + roomBooking.getStartTime() + " to " + roomBooking.getEndTime());
						System.out.println("Price per hour: " + roomBooking.getPrice()+"$");
						System.out.println("Your must to pay " + roomBooking.calculatePrice() + "$");

						listRoomBooking.add(roomBooking);
						IORoomBooking.saveFile(listRoomBooking, "G:\\databk\\roomBooking.txt");
						break;
					}
				}
			}
		}
		if (temp == 0) {
			System.err.println("Room code does not exist!");
		}
	}

	// method of handling login to the program
	public static int login() {
		ArrayList<User> listManager = new ArrayList<User>();
		listManager = IOUser.readFile("G:\\databk\\manager.txt");
		ArrayList<User> listUser = new ArrayList<User>();
		listUser = IOUser.readFile("G:\\databk\\user.txt");
		System.out.println("---- Login ----");
		System.out.print("Username: ");
		String username = new Scanner(System.in).nextLine();
		System.out.print("Password: ");
		String password = new Scanner(System.in).nextLine();
		for (User manager : listManager) {
			if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
				return 1;
			}
		}
		for (User user : listUser) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return 2;
			}
		}
		return 3;
	}

	public static void main(String[] args) {
		System.out.println("***Booking Program***");
		int role = login(); // role = 1: manager, role = 2: user, role = 3: login failed
		while (true) {
			switch (role) {
			case 1:
				menuForManager();
				break;
			case 2:
				menuForUser();
				break;
			case 3:
				System.err.println("Login failed, username or password is wrong!");
				role = login();
				break;
			}
		}
	}
}
