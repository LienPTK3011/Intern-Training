/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.OptionalClass;

/**
 *
 * @author Dang
 */
import java.util.List;

class People {
	String name;
	
	List<People> peopList = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class preJava8 {
	public static void main(String[] args) {
		People p = new People();
		if(p.peopList!=null) {			
			System.out.println(p.peopList.get(0).getName());
		}else {
			System.out.println("list is null!");
		}
	}
}