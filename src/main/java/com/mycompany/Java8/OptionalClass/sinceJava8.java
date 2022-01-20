/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Java8.OptionalClass;

/**
 *
 * @author Dang
 */
import java.util.Optional;

public class sinceJava8 {

	public static void main(String[] args) {
		Optional<People> peOptional = Optional.ofNullable(null);
		peOptional.ifPresentOrElse(p -> System.out.println(p.getName())
								   , () -> System.out.println("list is null!"));
	}

}