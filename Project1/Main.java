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
	
	
	// quản lý tài khoản mật khẩu
	public static  void loginUser() {
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
				// TODO: handle exception
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
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login.readFileUser(listUser);
		if(login.checkLogin(listUser)) {

			int chooseMenu = 0;
			do {
				System.out.println("====**** Main menu ****====");
				System.out.println("Function 1: Account Management");
				System.out.println("Function 2: Booking");
				System.out.println("Function 3: Management");
				System.out.println("Function 4: Exit !");
				
				try {
					System.out.println("=> choose Menu ");
					chooseMenu = Integer.parseInt(sca.nextLine());
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("you must enter the number");
				}
				
				switch (chooseMenu) {
				case 1: 		
					loginUser();
					break;
				case 2: 		
					
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
