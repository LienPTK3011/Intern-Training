package Project1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import file.Student;

public class Login {
	
	
	// check login usename password
	public boolean checkLogin(ArrayList<User> listUser) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Username");
		String check1 = sca.nextLine();
		System.out.println("Enter Password");
		String check2 = sca.nextLine();
		
		boolean check = false;
		for (User user : listUser) {
			if(user.getUsername().equals(check1) && user.getPassword().equals(check2)){
				check = true;			
			}
		}
		if(check == true) {
			System.out.println("Logged in successfully");
		}else {
			System.out.println("Logged in failure. Please try again!");
		}
		return check;
		
	}
	
	// read file user
	public void readFileUser(ArrayList<User> listUser) {
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\user.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = null;
			while((line = buf.readLine()) != null) {
				if(line.isEmpty()) {
					continue;
				}
				User user = new User();
				user.parse(line);  // parse()
				listUser.add(user);	
			}
			buf.close();
			read.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// write file user
	public void saveFileUser(ArrayList<User> listUser) {
		System.out.println("save file user.txt");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\Project1\\user.txt");
			for (User user : listUser) {
				String line = user.getFileLine(); /// getFileLine()
				byte[] b = line.getBytes("utf8");
				fos.write(b);
				
			}
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// insert usename password
	public void insertUser(ArrayList<User> listUser) {
		System.out.println("insert User");
		Scanner sca = new Scanner(System.in);
		User user = new User();
		user.inputUser();
		listUser.add(user);
	}
	
	// update usename password
	public void updateUser(ArrayList<User> listUser)  {	
		Scanner sca = new Scanner(System.in);
		System.out.println("update User");
		System.out.println("Enter the Username to edit");
		String s = sca.nextLine();
		
		for (User user : listUser) {
			if(user.getUsername().equals(s)) {
				user.inputUser();
				break;
			}	
		}

	}
	
	// delete usename password
	public void deleteUser(ArrayList<User> listUser)  {	
		Scanner sca = new Scanner(System.in);
		System.out.println("delete User");
		System.out.println("Enter the Username to delete");
		String s = sca.nextLine();
		
		for (User user : listUser) {
			if(user.getUsername().equals(s)) {
				listUser.remove(user);
				break;
			}	
		}

	}
	
	// view usename password
	public void viewUser(ArrayList<User> listUser) {
		listUser.stream().forEach(System.out::println);
	}
}
