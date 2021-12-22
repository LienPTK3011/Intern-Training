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
public class Person {
    public String name;
    public String sex;
    public int age;
    public String adress;  
    
    public Person(){
    }
    
     public Person(String name, String sex, int age, String adress) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.adress = adress;
  }  
     public void setName(String newName) {
    this.name = newName;
                
                
    }
    public String getName() 
    {
        return name;
    }
    
      public void setsex(String sex) {
        this.sex = sex;
    }
    public String getsex() 
    {
        return sex;
    }
    
     
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
     public void setAdress(String newAdress) {
        this.adress = newAdress;
    }
    public String getAdress() 
    {
        return adress;
    }
    
    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        setName(sc.nextLine());
        
        System.out.println("Enter Sex: ");
        setsex(sc.nextLine());
        
        System.out.println("Enter Age: ");
        setAge(sc.nextInt());
        
        String nextLine1 = sc.nextLine();
        System.out.println("Enter Adress: ");
        setAdress(sc.nextLine());
    }
    public void display() {
        System.out.printf("%25s %25s %25s %25s  \n",name, sex, age, adress);
    }

    

   
}
    

