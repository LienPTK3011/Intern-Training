/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuctapoop;

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
    public static void main(String[] args)
    {//Ex1+Ex2a,b
        Person person1 = new Person();
   
        person1.enter();
        Student student1= new Student();
        Scanner sc1 = new Scanner(System.in);
        
        student1.enter();
        System.out.printf("%25s %25s %25s %25s  \n","Name","Sex","Age","Adress");
        person1.display();
        System.out.printf("%25s %25s %25s \n","StudentID", "Averagepoint", "Email");
        student1.display();
        
        
        
          Person person2 = new Person();
   
        person2.enter();
        Student student2= new Student();
        Scanner sc2 = new Scanner(System.in);
        
        student2.enter();
        System.out.printf("%25s %25s %25s %25s  \n","Name","Sex","Age","Adress");
        person2.display();
        System.out.printf("%25s %25s %25s \n","StudentID", "Averagepoint", "Email");
        student2.display();
              
    
      List<Student> students = new ArrayList<>();
      student1.getaveragepoint();
      student2.getaveragepoint();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        students.forEach(e -> System.out.println(e));

        
       
    }

    
    
}
