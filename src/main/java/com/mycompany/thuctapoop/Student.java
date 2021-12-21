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
public class Student extends Person {
    public String studentID;
    private float averagepoint;
    public String email;
    
     public Student(){
    }
    
     public Student(String studentID, float averagepoint,String email) {
        this.studentID = studentID;
        this.averagepoint = averagepoint;
        this.email = email;
     }
      public void setstudentID(String studentID) {
        this.adress = studentID;
    }
    public String getstudentID() 
    {
        return studentID;
    }
     public void setemail(String email) {
        this.email = email;
    }
    public String getemail() 
    {
        return email;
    }
     public float getaveragepoint() {
        return averagepoint;
    }
 
    public void setaveragepoint(float averagepoint) {
        this.averagepoint = averagepoint;
    }
    
    
    @Override 
    public void enter()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Name: ");
        setName(sc1.nextLine());
        
        System.out.println("Enter Sex: ");
        setsex(sc1.nextLine());
        
        System.out.println("Enter Age: ");
        setage(sc1.nextInt());
        
        String nextLine = sc1.nextLine();
        System.out.println("Enter Adress: ");
        setAdress(sc1.nextLine());
        
         
        System.out.println("Enter Student ID: ");
        setstudentID(sc1.nextLine());
        
         
        System.out.println("Enter Average Point: ");
        setaveragepoint(sc1.nextFloat());
        
        String nextLine1 = sc1.nextLine();
        System.out.println("Enter Email: ");
        setemail(sc1.nextLine());
        
    }
     
    @Override 
    public void display()
    {
        System.out.printf("%20s %10s %20s %20s %10s %20s  \n",name, sex, age, adress, studentID, averagepoint, email);
    }
//   public void check(String Student ID)
//   {
//       this.studentID = studentID;
//       
//   }
}
