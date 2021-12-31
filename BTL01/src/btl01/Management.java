/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01;

import btl01.file.Seatio;
import btl01.file.Roomio;
import btl01.name.User;
import btl01.name.Seat;
import btl01.name.ConferenceRoom;
import static btl01.file.Login.readFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Management {

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
    //-------------------------------------------------------------------------------------------
    //login
    private static int login() {
		ArrayList<User> listUser = new ArrayList<User>();
		listUser = readFile("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\txt\\user.txt");
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
    //---------------------------------------------------------------------------------------------
    //read file seat.txt
	private static void readSeat() {
		listSeat = Seatio.read("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\txt\\seat.txt");
	}
        //save listSeat in seat.txt
	private static void saveSeat() {
		if (Seatio.save(listSeat, "C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\txt\\seat.txt")) {
		
                }
	}
        
        //show all seat of listSeat
	private static void showSeat() {
		for (Seat seat : listSeat) {
			System.out.println(seat);
		}
	}
        //create new seat
	private static void createSeat() {
		System.out.print("Id: ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("Seat code: ");
		String setcode = new Scanner(System.in).nextLine();
		System.out.print("Price per hour: ");
		double priceperhour = new Scanner(System.in).nextDouble();
		System.out.print("Note: ");
		String note = new Scanner(System.in).nextLine();
		Seat seat = new Seat(id, setcode, priceperhour, note);
		listSeat.add(seat);
	}
        
        
        
     //---------------------------------------------------------------------------   
        
        //read file room.txt
	private static void readRoom() {
		listRoom = Roomio.readFile("C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\txt\\room.txt");
	}
	//save listRoom in room.txt
	private static void saveRoom() {
		if (Roomio.save(listRoom, "C:\\Users\\Asus\\Documents\\NetBeansProjects\\BTL01\\src\\btl01\\txt\\room.txt")) {
		
                }
	}
	// show room
	private static void showRoom() {
		for (ConferenceRoom room : listRoom) {
			System.out.println(room);
		}
	}
	
	//method to create new room
	private static void createRoom() {
		System.out.print("Id: ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("Room code: ");
		String roomcode = new Scanner(System.in).nextLine();
		System.out.print("Price per hour: ");
		double priceperhour = new Scanner(System.in).nextDouble();
		System.out.print("Note: ");
		String note = new Scanner(System.in).nextLine();
		ConferenceRoom room = new ConferenceRoom(id, roomcode, priceperhour, note);
		listRoom.add(room);
	}
        
    //============================menu===============================================    
    private static void menu() {  
                System.out.println("--- Menu for Manager ---");
		System.out.println("1.Room");
		System.out.println("2.Seat");
                System.out.println("3.Booking");
		System.out.println("4.End program");
		System.out.println("What do you want?");
                int m = new Scanner(System.in).nextInt();
				switch (m) {
				case 1:
					menu1();
					break;
				case 2:
					menu2();
					break;
                                case 3:
					menu3();
					break;
				case 4:
                                    login();
					break;
                                default:
                                    System.out.println("Agian:");
                                    break;
				}
                                while(m!=4);
	}
    //========================menu room======================
    private static void menu1() {  
                System.out.println("--- Room for Manager ---");
		System.out.println("1.Add");
		System.out.println("2.Show");
		System.out.println("3.Save");
                System.out.println("4.Read");
		System.out.println("5.Exit");
		System.out.println("What do you want?");  
                int m = new Scanner(System.in).nextInt();
				switch (m) {
                                    case 1:
                                            createRoom();
                                            break;
                                    case 2:
                                            showRoom();
                                            break;
                                    case 3:
                                            saveRoom();
                                            break;
                                    case 4:
                                            readRoom();
                                            break;
                                    case 5:
                                            break;        
                                    default:
                                        System.out.println("Agian:");
                                        break;
				}
                                while(m!=5);
	}
    //===========================menu seat========================================
    private static void menu2() {  
                System.out.println("--- Seat for Manager ---");
		System.out.println("1.Add");
		System.out.println("2.Show");
		System.out.println("3.Save");
                System.out.println("4.Read");
		System.out.println("5.Exit");
		System.out.println("What do you want?");  
                int m = new Scanner(System.in).nextInt();
				switch (m) {
                                    case 1:
                                            createSeat();
                                            break;
                                    case 2:
                                            showSeat();
                                            break;
                                    case 3:
                                            saveSeat();
                                            break;
                                    case 4:
                                            readSeat();
                                            break;
                                    case 5:
                                            break;        
                                    default:
                                        System.out.println("Agian:");
                                        break;
				}
                                while(m!=5);
	}
    
    //==============================menu booking===========================
}
