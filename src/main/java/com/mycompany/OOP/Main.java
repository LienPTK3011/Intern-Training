/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {//Ex1+Ex2a,b
       
        Person person1 = new Person();
        enter(person1);
        person1.display();

        Student student1 = new Student();
    
        enter(student1);
        student1.display(); 

    }

    static void enter(Person person1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        person1.setName(sc.nextLine());
        System.out.println("Enter sex: ");
        person1.setsex(sc.nextLine());
        System.out.println("Enter address: ");
        person1.setAdress(sc.nextLine());
        System.out.println("Enter Age: ");
        person1.setAge(sc.nextInt());
        sc.nextLine();
    }
    static void enter(Student student1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        student1.setid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter StudentID: ");
        student1.setstudentID(sc.nextLine());
        System.out.println("Enter Averagepoint: ");
        student1.setaveragepoint(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Email: ");
        student1.setemail(sc.nextLine());
        
    }
}
