package mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.model.Personnel;
import mvc.view.View;

public class Controller {
	private View view;
	
	public Controller(View view) {
		this.view = view;
	}
	
	// insert information personnel
	public void insertPersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Insert information personnel");
		Scanner sca = new Scanner(System.in);
		Personnel personnel = view.inputInformation();
		listPersonnel.add(personnel);
	}
	
	// update information personnel
	public void updatePersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Update information personnel");
		Scanner sca = new Scanner(System.in);
		String codePerson = sca.nextLine();
		for (Personnel personnel : listPersonnel) {
			if(personnel.getCodePersonnel().equals(codePerson)) {
				System.out.println("Enter new information Personnel");
				listPersonnel.remove(personnel);
				personnel = view.inputInformation();
				listPersonnel.add(personnel);
				break;
				
			}
		}
		
	}
	
	// delete information personnel
	public void deletePersonnel(ArrayList<Personnel> listPersonnel) {
		System.out.println("Delete information personnel");
		Scanner sca = new Scanner(System.in);
		String codePerson = sca.nextLine();
		for (Personnel personnel : listPersonnel) {
			if(personnel.getCodePersonnel().equals(codePerson)) {
				listPersonnel.remove(personnel);
				break;
				
			}
		}
	}
}
