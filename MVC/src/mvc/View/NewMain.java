/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mvc.Controller.Controller;
import mvc.Model.Employee;

/**
 *
 * @author Asus
 */
public class NewMain {
    static Scanner sc = new Scanner(System.in);
    
    public static void menu() {
        int n=0;
        do{
		System.out.println("Employee management program");
		System.out.println("1.Add employee");
		System.out.println("2.Edit employee");
		System.out.println("3.Delete employee");
		System.out.println("4.Statistics of employees by skill");
		System.out.println("5.Statistics of employees by department");
                System.out.println("6.Show employee");
                System.out.println("7.Save employee");
		System.out.println("8.Read employee");
		System.out.println("9.End program");
		System.out.println("What do you want?");
		n = Integer.parseInt(sc.nextLine());
		switch(n) {
		case 1:
			Controller.addEmp();
			break;
		case 2:
			Controller.editEmp();
			break;
		case 3: 
			Controller.deleteEmp();
			break;
		case 4:
                        Controller.searchEmpSkill();
			break;
		case 5:
                        Controller.searchEmpDep();
			break;       
                case 6: 
			Controller.showEmp();
			break;
                case 7:
			Controller.saveEmp();;
			break;
                case 8:
			Controller.readEmp();
			break;
		case 9:
			break;
                default:
                    System.out.println("Agian:");
                        break;
                    
                    }
            } while(n!=9);
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
}
