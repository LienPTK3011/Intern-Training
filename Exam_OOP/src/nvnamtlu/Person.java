package nvnamtlu;

import java.util.Scanner;

public class Person {
	private String name;
	private String sex;
	private String address;
	private String birthOfDate;
	
	public Person() {
		
	}
	
	public Person(String name, String sex, String address, String birthOfDate) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthOfDate = birthOfDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBirthOfDate() {
		return birthOfDate;
	}
	
	public void setBirthOfDate(String birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	
	
	@Override
	public String toString() {
		return "Name: "+this.name+"\nSex: "+this.sex+"\nAddress: "+this.address+"\nBirth of date: "+this.birthOfDate;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-->Input information");
		System.out.print("Input name: ");
		this.name = sc.nextLine();
		System.out.print("Input sex: ");
		this.sex = sc.nextLine();
		System.out.print("Input address: ");
		this.address = sc.nextLine();
		System.out.print("Input birth of date: ");
		this.birthOfDate = sc.nextLine();
	}
	
	public void showInfo() {
		System.out.println("-->Show information: ");
		System.out.print("Name: "+this.name+"\nSex: "+this.sex+"\nAddress: "+this.address+"\nBirth of date: "+this.birthOfDate);
	}
}
