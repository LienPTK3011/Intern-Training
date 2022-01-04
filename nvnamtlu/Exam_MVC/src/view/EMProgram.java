package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Control;
import model.Employee;

public class EMProgram {
	
	//method to create menu to manage employee list
	public static void menu() {
		System.out.println("*********Employee management program*********");
		System.out.println("1.Read file employee");
		System.out.println("2.Sava file employee");
		System.out.println("3.Show list employee");
		System.out.println("4.Add new employee");
		System.out.println("5.Edit information for employee");
		System.out.println("6.Delete employee");
		System.out.println("7.Statistics of employees by department");
		System.out.println("8.Statistics of employees by skill");
		System.out.println("9.End program");
		System.out.println("What do you want?");
		
		int n = new Scanner(System.in).nextInt();
		switch(n) {
		case 1:
			Control.readFileEmps();
			break;
		case 2:
			Control.saveFileEmps();;
			break;
		case 3: 
			Control.showEmps();
			break;
		case 4:
			Control.addNewEmp();
			break;
		case 5:
			Control.EditEmpInfo();
			break;
		case 6: 
			Control.deleteEmp();
			break;
		case 7:
			System.out.print("Enter department: ");
			String department = new Scanner(System.in).nextLine();
			Control.StatisticsByDepartment(department);
			break;
		case 8:
			System.out.print("Enter skill: ");
			String skill = new Scanner(System.in).nextLine();
			Control.StatisticsBySkill(skill);
			break;
		case 9:
			System.err.println("Good bye!");
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
