/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.Functional_Interface_Lambda_Expression_Method_References;

/**
 *
 * @author Dang
 */
public class Action implements Movie{
	
	String action = "Here is action movie";
	@Override
	public void detail(String action) {
		System.out.println(action);
	}

}