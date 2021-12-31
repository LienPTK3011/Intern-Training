/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01;

import btl01.name.User;
import btl01.name.Seat;
import btl01.name.ConferenceRoom;
import static btl01.Login.readFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BTL01 {

    /**
     * @param args the command line arguments
     */
        static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
	static ArrayList<Seat> listSeat = new ArrayList<Seat>();
    public static void main(String[] args) {
        // TODO code application logic here
        int login = login();
		while(true) {
			switch(login) {
			case 1: 
				menu();
				break;
			case 2:
				System.err.println("Login failed");
				login = login();
				break;
			}
		}
    }
    private static int login() {
		ArrayList<User> listUser = new ArrayList<User>();
		listUser = readFile("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\bt1.txt");
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
    //read file seat.txt
	private static void readSeat() {
		listSeat = Seatio.read("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\seat.txt");
	}
        //read file room.txt
	private static void readRoom() {
		listRoom = Roomio.readFile("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\seat.txt");
	}
	
    private static void menu() {
          System.out.println("--- Menu for Manager ---");
		System.out.println("1.User");
		System.out.println("2.Room");
		System.out.println("3.Seat");
		System.out.println("4.End program");
		System.out.println("What do you want?");  
                int m = new Scanner(System.in).nextInt();
             
	}
}
