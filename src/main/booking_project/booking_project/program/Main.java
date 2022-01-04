package booking_project.program;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import booking_project.function.DateConverter;
import booking_project.function.IoRoom;
import booking_project.function.IoRoomBooking;
import booking_project.function.IoSeat;
import booking_project.function.IoSeatBooking;
import booking_project.function.IoUser;
import booking_project.function.TimeConverter;
import booking_project.model.ConferenceBooking;
import booking_project.model.ConferenceRoom;
import booking_project.model.Seat;
import booking_project.model.SeatBooking;
import booking_project.model.User;

public class Main {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
	static ArrayList<SeatBooking> listSeatBooking = new ArrayList<SeatBooking>();
	static ArrayList<ConferenceBooking> listRoomBooking = new ArrayList<ConferenceBooking>();
	
	
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
				System.out.println("--Booking Menu--");
				System.out.println("1.Booking Room");
				System.out.println("2.Booking Seat");
				System.out.println("3.Back to main menu");
				System.out.println("Please choose action :");

				int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					bookingRoom();
					break;
				case 2:
					bookingSeat();
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
	
		
	// method to booking room for user
		private static void bookingRoom() {
			listRoom = IoRoom.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\conferenceroom_infomation.txt");
			listRoomBooking = IoRoomBooking.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\room_booking.txt");
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
							System.out.println("==>Done booking conference room with:");
							System.out.println("Room code: " + roomBooking.getRoomCode());
							System.out.println("Date: " + DateConverter.dateToString(roomBooking.getDay()));
							System.out.println("Time: " + roomBooking.getStartTime() + " to " + roomBooking.getEndTime());
							System.out.println("Price per hour: " + roomBooking.getPrice()+"$");
							System.out.println("You have to pay: " + roomBooking.calculatePrice() + "$");
							System.out.println("Countinue Booking ? ");

							listRoomBooking.add(roomBooking);
							IoRoomBooking.saveFile(listRoomBooking, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\room_booking.txt");
							break;
						}
					}
				}
			}
			if (temp == 0) {
				System.err.println("Room code does not exist!");
			}
		}

		//get the previous time between two input times
		private static LocalTime timeBefore(LocalTime lt1, LocalTime lt2) {
			if (lt1.isBefore(lt2)) {
				return lt1;
			}
			return lt2;
		}
		//get the later time between two input times
		private static LocalTime timeAfter(LocalTime lt1, LocalTime lt2) {
			if (lt1.isAfter(lt2)) {
				return lt1;
			}
			return lt2;
		}

		//booking seat for user
		private static void bookingSeat() {
			listSeat = IoSeat.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_infomation.txt");
			listSeatBooking = IoSeatBooking.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_booking.txt");
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
							System.out.println("==> Done booking seat with:");
							System.out.println("Seat code: " + seatBooking.getSeatCode());
							System.out.println("Date: " + DateConverter.dateToString(seatBooking.getDay()));
							System.out.println("Time: " + seatBooking.getStartTime() + " to " + seatBooking.getEndTime());
							System.out.println("Price per hour: " + seatBooking.getPrice()+"$");
							System.out.println("You have to pay: " + seatBooking.calculatePrice() + "$");
							System.out.println("Countinue Booking ? ");
							listSeatBooking.add(seatBooking);
							IoSeatBooking.saveFile(listSeatBooking, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_booking.txt");
							break;
						}
					}
				}
			}
			if (temp == 0) {
				System.err.println("Seat code does not exist!");
			}
		}

		//read file seat_information.txt
		private static void readSeatFile() {
			listSeat = IoSeat.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_information.txt");
			System.out.println("-->Read file seat_information.txt into listSeat success");
		}

		//save listSeat in seatinformation.txt
		private static void saveSeatFile() {
			if (IoSeat.saveFile(listSeat, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\seat_information.txt")) {
				System.out.println("==>Save listSeat into file seat_information.txt success");
			}
		}

		//show all seat of listSeat
		private static void showSeats() {
			for (Seat seat : listSeat) {
				System.out.println(seat);
			}
		}

		//create new seat
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
			System.out.println("==>Read file complete");
		
	}

		//save listUser in user_pass.txt
		private static void saveUserFile() {
		if (IoUser.saveFile(listUser, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\user_pass.txt")) {
			System.out.println("==>Save file success");
		}
	}

		//show all user of list user
		private static void showUsers() {
			System.out.println("User List : ");
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
			if (listUser.add(user)) {
				System.out.println("==>Add user into listUser Success!!");
			} else {
				System.out.println("==>Add user into listUser failed!");
			}
		
}
		//create new room
		private static void createRoom() {
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
				System.out.println("==>Add new room into listRoom Success!");
			} else {
				System.out.println("==>Add new room into listRoom Failed!");
			}
		}

		//read file room.txt
		private static void readRoomFile() {
			listRoom = IoRoom.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\conferenceroom_info.txt");
			System.out.println("-==Read file complete");
		}
		
		//save listRoom in room.txt
		private static void saveRoomFile() {
			if (IoRoom.saveFile(listRoom, "E:\\Java\\Training\\Intern-Training\\src\\main\\booking_project\\booking_project\\data\\conferenceroom_info.txt")) {
				System.out.println("==>Save file success");
			}
		}
		
		//show all room of listRoom
		private static void showRooms() {
			System.out.println("Room : ");
			for (ConferenceRoom room : listRoom) {
				System.out.println(room);
			}
		}
		
}
