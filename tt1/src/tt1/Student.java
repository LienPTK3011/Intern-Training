/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Student extends Person implements Comparable<Student>  {
    private int id;
    private double avg;
    private String email;

   

    public Student(int id, double avg, String email, String sex, String name, String date, String address) {
        super(sex, name, date, address);
        this.id = id;
        this.avg = avg;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 @Override
    public String toString() {
        return "Student{" + "id=" + id + ", avg=" + avg + ", email=" + email + '}';
    }
    
    // Ham nhap thong tin
    @Override
    public void input() {
       System.out.print("Ma sinh vien");
       this.setId(new Scanner(System.in).nextInt());
       System.out.print("Email");
       this.setEmail(new Scanner(System.in).nextLine());
       System.out.print("Diem trung binh");
       this.setAvg(new Scanner(System.in).nextDouble());
    }
    @Override
    public void show() {
		System.out.print("Ma sinh vien: "+this.id+"\nEmail: "+this.email+"\nDiem trung binh: "+this.avg);
	}

    @Override
    public int compareTo(Student o) {
        int k = this.getName().compareTo(o.getName());
        if (k<0) {
            return -1;
        }
        else if (k>0) {
            return 1;
        } else {
            return 0;
        }
    }

    
}
