package booking_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
	
	
	public static void main(String[] args) {
		
		System.out.println("***Booking Program***");
		int login = login();
		while(true) {
			switch(login) {
			case 1: 
				menu();
				break;
			case 2:
				System.err.println("Login failed, username or password is wrong!");
				login = login();
				break;
			}
		}
	}


	private static int login() {
		ArrayList<User> listUser = new ArrayList<User>();
		listUser = IoUser.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\bin\\booking_project\\user_pass.txt");
		System.out.println("----Login----");
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


	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Already in");

	}

}
