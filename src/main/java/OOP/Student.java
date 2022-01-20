/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;


import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Student extends Person {
    
    private String studentID;
    private float averagepoint;
    private String email;

    public Student(String studentID, float averagepoint, String email, String name, String sex, int age, String adress) {
        super(name, sex, age, adress);
        this.studentID = studentID;
        this.averagepoint = averagepoint;
        this.email = email;
    }

    public Student() {
    }

    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float getAveragepoint() {
        return averagepoint;
    }

    public void setAveragepoint(float averagepoint) {
        this.averagepoint = averagepoint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter studentID ");
        studentID = sc.nextLine();
        System.out.println("Enter AVG ");
        averagepoint =Float.parseFloat(sc.nextLine());
        System.out.println("Enter Email ");
        email = sc.nextLine();
    }   
    
    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println(" StudentID "+ studentID +" AVG "+ averagepoint+ " email "+email+"\n");
    }
     

 
    
}
