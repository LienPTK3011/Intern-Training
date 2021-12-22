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
public class Student extends Person implements Comparable<Student> {
    public String studentID;
    public int averagepoint;
    public String email;
    
     public Student(){
    }
    
     public Student(String studentID, int averagepoint,String email) {
        this.studentID = studentID;
        this.averagepoint = averagepoint;
        this.email = email;
     }

    /**
     *
     * @param o
     * @return
     */
    public int compare(Student o) {
        return this.getaveragepoint().compare(o.getaveragepoint());
    
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
     public int getaveragepoint() {
        return averagepoint;
    }
 
    public void setaveragepoint(int averagepoint) {
        this.averagepoint = averagepoint;
    }
    
    
    @Override 
    public void enter()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        setstudentID(sc1.nextLine());
        
         
        System.out.println("Enter Average Point: ");
        setaveragepoint(sc1.nextInt());
        
        String nextLine1 = sc1.nextLine();
        System.out.println("Enter Email: ");
        setemail(sc1.nextLine());
        
    }
    
     
    @Override 
    public void display()
    {
        System.out.printf("%25s %25s %25s\n",studentID, averagepoint, email);
    }

    @Override
    public int compareTo(Student o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
