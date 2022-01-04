package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Employee;
import model.IOEmployeeFile;

public class Control {
	static ArrayList<Employee> listEmps = new ArrayList<Employee>();
	
	// method to read file employees.txt
	public static void readFileEmps() {
		listEmps = IOEmployeeFile.readFile("G:\\data_mvc\\employees.txt");
		System.out.println("-->Read file employees.txt into listEmps successfully");
	}

	// method to save listEmps into employees.txt
	public static void saveFileEmps() {
		if (IOEmployeeFile.saveFile(listEmps, "G:\\data_mvc\\employees.txt")) {
			System.out.println("-->Save listEmps into file employees.txt successfully");
		}
	}
	
	// method to add new employee into listEmps
	public static void addNewEmp() {
		System.out.print("Enter name: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Enter department: ");
		String department = new Scanner(System.in).nextLine();
		System.out.print("Enter skill: ");
		String skill = new Scanner(System.in).nextLine();

		Employee emp = new Employee();
		if (listEmps.size() == 0) {
			emp.setId(1);
		} else {
			emp.setId((listEmps.get(listEmps.size() - 1).getId()) + 1);
		}

		emp.setName(name);
		emp.setDepartment(department);
		emp.setSkill(skill);

		if (listEmps.add(emp)) {
			System.out.println("-->Add new employee into listEmps success");
		}
	}
	
	// method to show all employee of listEmps
	public static void showEmps() {
		System.out.println("List employee:");
		for (Employee emp : listEmps) {
			System.out.println(emp);
		}
	}
	
	//method to edit information for employee
	public static void EditEmpInfo() {
		System.out.print("Enter id of employee want to edit information: ");
		int id = new Scanner(System.in).nextInt();
		int temp = 0;

		for (int i = 0; i < listEmps.size(); i++) {
			if (listEmps.get(i).getId() == id) {
				temp = 1;
				listEmps.remove(i);
				System.out.print("Enter name: ");
				String name = new Scanner(System.in).nextLine();
				System.out.print("Enter department: ");
				String department = new Scanner(System.in).nextLine();
				System.out.print("Enter skill: ");
				String skill = new Scanner(System.in).nextLine();

				Employee emp = new Employee(id, name, department, skill);
				listEmps.add(i, emp);
				System.out.println("-->Edit information for employee [with id = " + emp.id + "] successfully");
				break;

			}
		}
		if (temp == 0) {
			System.err.println("This id does not exist!");
		}
	}
	
	//method to delete employee
	public static void deleteEmp() {
		System.out.print("Enter id of employee want to delete: ");
		int id = new Scanner(System.in).nextInt();
		
		int temp = 0;
		for (int i = 0; i < listEmps.size(); i++) {
			if (listEmps.get(i).getId() == id) {
				temp = 1;
				listEmps.remove(i);
				System.out.println("-->Delete employee [with id = " + id + "] successfully");
				break;

			}
		}
		if (temp == 0) {
			System.err.println("This id does not exist!");
		}		
	}
	
	//method to statistics of employees by department
	public static void StatisticsByDepartment(String department) {
		int temp = 0;
		for(Employee emp : listEmps) {
			if(emp.getDepartment().equalsIgnoreCase(department)) {
				temp = 1;
				System.out.println(emp);
			}
		}
		
		if(temp == 0) {
			for(Employee emp : listEmps) {
				System.out.println(emp);
			}
		}
	}
	
	//method to statistics of employees by skill
	public static void StatisticsBySkill(String skill) {
		int temp = 0;
		for(Employee emp : listEmps) {
			if(emp.getSkill().equalsIgnoreCase(skill)) {
				temp = 1;
				System.out.println(emp);
			}
		}
		
		if(temp == 0) {
			for(Employee emp : listEmps) {
				System.out.println(emp);
			}
		}
	}
}
