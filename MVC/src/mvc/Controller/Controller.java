/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mvc.Model.Employee;
import mvc.Model.IOEmployee;

/**
 *
 * @author Asus
 */
public class Controller {
        static ArrayList<Employee> listEmp = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	// method to read file employees.txt
	public static void readEmp() {
            listEmp = IOEmployee.readFile("C:\\Users\\Asus\\Documents\\NetBeansProjects\\MVC\\src\\data\\emp.txt");
	}
	// method to save listEmps into employees.txt
	public static void saveEmp() {
            if (IOEmployee.saveFile(listEmp, "C:\\Users\\Asus\\Documents\\NetBeansProjects\\MVC\\src\\data\\emp.txt")) {
            }
	}
	// method to add new employee into listEmps
	public static void addEmp() {
            System.out.println("Nhap so nhan vien can them");
            int n = Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                Employee emp = new Employee();
                emp.input();
                listEmp.add(emp);
            }
	}
	
	// method to show all employee of listEmps
	public static void showEmp() {
		System.out.println("List Employee:");
		for (Employee emp : listEmp) {
                    emp.dislayout();
		}
	}
	
	//method to edit information for employee
	public static void editEmp() {
		System.out.print("Id of employee Edit: ");
		String id = new Scanner(System.in).nextLine();
		for(Employee emp : listEmp){
                    if(emp.getId() == id){
                        emp.input();
                        break;
                    }
                }
	}	
	//method to delete employee
	public static void deleteEmp() {
		System.out.print("Id of employee delete: ");
		String id = new Scanner(System.in).nextLine();
		for(Employee emp : listEmp){
                    if(emp.getId() == id){
                        System.out.println("Delete succesfully !!!");
                        listEmp.remove(emp);
                        break;
                    }
		}		
	}
        //
        public static void searchEmpSkill(){
            System.out.println("Skill of employee search: ");
            String skillsr = new Scanner(System.in).nextLine();
            boolean isFind = false;
            for (Employee emp : listEmp){
                if(emp.getSkill().equalsIgnoreCase(skillsr)){
                    emp.dislayout();
                    isFind = true;
                    break;
                }
            }
            if(!isFind){
                System.out.println("No found !!! ");
            }
        }
        public static void searchEmpDep(){
            System.out.println("Department of employee search: ");
            String depsr = new Scanner(System.in).nextLine();
            boolean isFind = false;
            for (Employee emp : listEmp){
                if(emp.getDepartment().equalsIgnoreCase(depsr)){
                    emp.dislayout();
                    isFind = true;
                    break;
                }
            }
            if(!isFind){
                System.out.println("No found !!! ");
            }
        }
        
}
