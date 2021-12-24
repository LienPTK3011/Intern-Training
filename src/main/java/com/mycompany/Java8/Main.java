/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8;

/**
 *
 * @author Dang
 */
public class Main {
    public static void main(String[] args)
    {
        //Ex1
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.Run();
        animal2.Run();
        
        //Ex2 + 3 
        //Prejava8 without lambda expression
        Movie movie1 = new Action() {
	@Override
        public String Details(String msg) {
            return msg;
			}
		};
		System.out.println(movie1.Details("Action Movie"));
                
        
        //Sincejava8 with lambda expression
        Movie movie2 = msg -> msg;
        System.out.println(movie2.Details("Horror Movie"));
        
        //Ex 5 
        
        
        
                
        
       
    }
}
