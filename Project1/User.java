package Project1;

import java.util.Scanner;

public class User {
	private String username;
	private String password;

	public User() {
		
	}


	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	

	
	public void inputUser() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter username");
		username = sca.nextLine();
		System.out.println("Enter password");
		password = sca.nextLine();
	}
	
	// get line format followed by ","
	public String getFileLine() {
		return username + "," + password  + "\n";
		
	}
	
	// parse string
	public void parse(String line) {
		
		try {
			String[] p = line.split(",");
			username = p[0];
			password = p[1];
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
