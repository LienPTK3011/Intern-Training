package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		ArrayList<User> listUser = new ArrayList<>();
		
		Management management = new Management();
		ArrayList<SeatBooking> listSeatBooking = new ArrayList<>();
		ArrayList<ConferenceBooking> listConferenceBooking = new ArrayList<>();
		
		
		Booking booking = new Booking();
		
		Scanner sca = new Scanner(System.in);
		login.checkLogin(listUser);
		
		int chose = 0;
		do {
			Menu();
			
			try {
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("enter number");
			}
			
			switch (chose) {
			case 1: 
				
				break;
			case 2: 		
				
				break;
			case 3: 		
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			default:
				System.out.println("chọn lại");
				break;
			}
		} while (chose !=7);
	}

	static void Menu() {
	
	}
}
