/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.Functional_Interface_Lambda_Expression_Method_References;

/**
 *
 * @author Dang
 */
	
public class LambdaExpression {
	
	public static void main(String[] args) { 
		Movie mv = mvType -> {
                    System.out.println(mvType+" is the best");
                    return null;
                };
		mv.detail("Action movie");
	}
}
