package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Employee;
import model.IoEmployee;

public class Controller {
static ArrayList<Employee> listemp = new ArrayList<Employee>();
	
	public static void readfileEmp() {
		listemp = IoEmployee.readFile("E:\\Java\\Training\\Intern-Training\\src\\main\\mvc\\model\\employee.txt");
		System.out.println("==>Read file employee.txt success");
	}
	
	public static void savefileEmp() {
		if (IoEmployee.saveFile(listemp, "E:\\Java\\Training\\Intern-Training\\src\\main\\mvc\\model\\employee.txt")) {
			System.out.println("==>Save file employee.txt success");
		}
	}
		
	public static void addEmp() {
		System.out.print("Enter name: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Enter department: ");
		String department = new Scanner(System.in).nextLine();
		System.out.print("Enter skill: ");
		String skill = new Scanner(System.in).nextLine();

		Employee emp = new Employee();
		if (listemp.size() == 0) {
			emp.setId(1);
		} else {
			emp.setId((listemp.get(listemp.size() - 1).getId()) + 1);
		}

		emp.setName(name);
		emp.setDepartment(department);
		emp.setSkill(skill);

		if (listemp.add(emp)) {
			System.out.println("==>Add new employee into listemp success");
		}
	}
	
	public static void showEmp() {
		System.out.println("List employee:");
		for (Employee emp : listemp) {
			System.out.println(emp);
		}
	}
	
	public static void EditEmp() {
		System.out.print("Enter id of employee you want to edit: ");
		int id = new Scanner(System.in).nextInt();
		int temp = 0;

		for (int i = 0; i < listemp.size(); i++) {
			if (listemp.get(i).getId() == id) {
				temp = 1;
				listemp.remove(i);
				System.out.print("Enter name: ");
				String name = new Scanner(System.in).nextLine();
				System.out.print("Enter department: ");
				String department = new Scanner(System.in).nextLine();
				System.out.print("Enter skill: ");
				String skill = new Scanner(System.in).nextLine();

				Employee emp = new Employee(id, name, department, skill);
				listemp.add(i, emp);
				System.out.println("==>Edit employee with id = " + emp.id + " success");
				break;

			}
		}
		if (temp == 0) {
			System.err.println("This id does not exist!");
		}
	}
	
	public static void deleteEmp() {
		System.out.print("Enter id of employee want to delete: ");
		int id = new Scanner(System.in).nextInt();
		
		int temp = 0;
		for (int i = 0; i < listemp.size(); i++) {
			if (listemp.get(i).getId() == id) {
				temp = 1;
				listemp.remove(i);
				System.out.println("==>Delete employee with id = " + id + " success");
				break;

			}
		}
		if (temp == 0) {
			System.err.println("This id does not exist!");
		}		
	}
	
	public static void StatisticsByDepartment(String department) {
		int temp = 0;
		for(Employee emp : listemp) {
			if(emp.getDepartment().equalsIgnoreCase(department)) {
				temp = 1;
				System.out.println(emp);
			}
		}
		
		if(temp == 0) {
			for(Employee emp : listemp) {
				System.out.println(emp);
			}
		}
	}
	
	public static void StatisticsBySkill(String skill) {
		int temp = 0;
		for(Employee emp : listemp) {
			if(emp.getSkill().equalsIgnoreCase(skill)) {
				temp = 1;
				System.out.println(emp);
			}
		}
		
		if(temp == 0) {
			for(Employee emp : listemp) {
				System.out.println(emp);
			}
		}
	}
}
