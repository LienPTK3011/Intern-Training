package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.Controller;
import mvc.model.Personnel;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Personnel> listPersonnel = new ArrayList<>();
		View view = new View();
		Controller controller = new Controller(view);
		
		Scanner sca = new Scanner(System.in);

		int choose = 0;
		
		do {
			System.out.println("function 1: view information personnel");
			System.out.println("function 2: insert information personnel");
			System.out.println("function 3: update information personnel");
			System.out.println("function 4: delete information personnel");
			System.out.println("function 5: ");
			System.out.println("function 6: ");
			System.out.println("choose function");
			choose = Integer.parseInt(sca.nextLine());
			switch (choose) {
			case 1: 
				view.outputInformation(listPersonnel);
				break;
			case 2: 
				controller.insertPersonnel(listPersonnel);
				break;
			case 3: 
				controller.updatePersonnel(listPersonnel);
				break;
			case 4: 
				controller.deletePersonnel(listPersonnel);
				break;
			case 5: 
				
				break;
			case 6: 
				
				break;
			case 7: 
				
				break;
		
			default:
				System.out.println("choose again");
				break;
			}
			
		} while (choose !=7);
	}

}
