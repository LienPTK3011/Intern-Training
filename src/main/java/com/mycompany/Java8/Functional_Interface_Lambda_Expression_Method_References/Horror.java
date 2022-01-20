/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.Functional_Interface_Lambda_Expression_Method_References;

/**
 *
 * @author Dang
 */
public class Horror implements Movie{

	String horror = "Here is horror movie";
	@Override
	public void detail(String horror) {
		System.out.println(horror);
	}

}