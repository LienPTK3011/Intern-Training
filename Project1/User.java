package Project1;

import java.util.Scanner;

public class User {
	private String Username;
	private String Password;
	
	public User(String username, String password) {
		super();
		Username = username;
		Password = password;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + "]";
	}
	
	public void outputUser() {
		System.out.println(toString());
	}
	
	public void inputUser() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Username");
		Username = sca.nextLine();
		System.out.println("Enter Password");
		Password = sca.nextLine();
	}
	
	// đọc theo dấu ,
	public String getFileLine() {
		return Username + "," + Password  + "\n";
		
	}
	
	public void parse(String line) {
		
		try {
			String[] p = line.split(",");
			Username = p[0];
			Password = p[1];
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
