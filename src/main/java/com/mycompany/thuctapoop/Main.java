/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuctapoop;

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
    public static void main(String[] args)
    {//Bai 1
        Person person = new Person();
       
        person.enter();
        System.out.printf("%25s %25s %25s %25s \n","Name","Sex","Age","Adress");
        person.display();
        
        Student student= new Student();
        Scanner sc1 = new Scanner(System.in);
        student.enter();
        System.out.printf("%20s %10s %20s %20s %10s %20s  \n","Name", "Sex", "Age", "Adress", "StudentID", "Averagepoint", "Email");
        student.display();
        
       
    }
    
}
