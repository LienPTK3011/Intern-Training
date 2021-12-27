/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OOP;

import static com.mycompany.OOP.Main2.studentList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Student extends Person implements Comparable<Student> {

    private String studentID;
    private int averagepoint;
    private String email;
    private int id;

    public Student() {
    }

    public Student(int id, String studentID, int averagepoint, String email) {
        this.id = id;
        this.studentID = studentID;
        this.averagepoint = averagepoint;
        this.email = email;
    }

    public void setstudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getstudentID() {
        return studentID;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public int getaveragepoint() {
        return averagepoint;
    }

    public void setaveragepoint(int averagepoint) {
        this.averagepoint = averagepoint;
    }

    public int getid() {
        return averagepoint;
    }

    public void setid(int id) {
        this.id = id;
    }

//    public void enter() {
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter id: ");
//        this.id = sc1.nextInt();
//
//        System.out.print("Enter StudentID: ");
//        this.studentID = sc1.nextLine();
//
//        System.out.print("Enter Averagepoint: ");
//        this.averagepoint = sc1.nextInt();
//
//        System.out.print("Input Email: ");
//        this.email = sc1.nextLine();
//    }

    @Override
    public void display() {
        System.out.println("\nId: "+this.id+"\nStudentId: " + this.studentID + "\nAveragepoint: " + this.averagepoint + "\nEmail: " + this.email);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }


}
