/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.Functional_Interface_Lambda_Expression_Method_References;

/**
 *
 * @author Dang
 */
public class MethodReferences {

	public static void main(String[] args) {
		Movie action = System.out::println;
		action.detail("Action movie is the best");
	}

} 

