package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Controller;
import model.Employee;

public class View {
	
	public static void menu() {
		System.out.println("Welcometo Employee Management Program");
		System.out.println("1.Read data");
		System.out.println("2.Save data");
		System.out.println("3.Show list employee");
		System.out.println("4.Add new employee");
		System.out.println("5.Edit employee");
		System.out.println("6.Delete employee");
		System.out.println("7.Statistics of employees by department");
		System.out.println("8.Statistics of employees by skill");
		System.out.println("9.End program");
		System.out.println("Please choose action");
		
		int n = new Scanner(System.in).nextInt();
		switch(n) {
		case 1:
			Controller.readfileEmp();
			break;
		case 2:
			Controller.savefileEmp();;
			break;
		case 3: 
			Controller.showEmp();
			break;
		case 4:
			Controller.addEmp();
			break;
		case 5:
			Controller.EditEmp();
			break;
		case 6: 
			Controller.deleteEmp();
			break;
		case 7:
			System.out.print("Enter department: ");
			String department = new Scanner(System.in).nextLine();
			Controller.StatisticsByDepartment(department);
			break;
		case 8:
			System.out.print("Enter skill: ");
			String skill = new Scanner(System.in).nextLine();
			Controller.StatisticsBySkill(skill);
			break;
		case 9:
			System.err.println("Arigathanksgozaimuch!");
			System.exit(0);
			break;
		}
	}

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
