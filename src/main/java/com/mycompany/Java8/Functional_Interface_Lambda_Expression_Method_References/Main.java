/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.Functional_Interface_Lambda_Expression_Method_References;

/**
 *
 * @author Dang
 */
public class Main {

	public static void main(String[] args) {
		
		//lambda expression
		Movie mv1 = (s)-> System.out.println(s);
		mv1.detail("detail_lambda expression");
		
		//method reference
		Movie mv2 = System.out::println;
		mv2.detail("detail_method reference");
	}

}