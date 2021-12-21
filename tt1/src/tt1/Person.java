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
public class Person {
    // Thuoc tinh
    private  String sex;
    private String name;
    private String date;
    private String address;

   

   

    public Person(String sex, String name, String date, String address) {
        this.sex = sex;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Person() {

    }

    // Ham khoi tao co doi so
   

    // Cac ham getter va setter cho cac thuoc tinh

     public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 @Override
    public String toString() {
        return "Person{" + "sex=" + sex + ", name=" + name + ", date=" + date + ", address=" + address + '}';
    }
    public void input() {
       System.out.print("Ho ten");
       this.setName(new Scanner(System.in).nextLine());
       System.out.print("Gioi tinh");
       this.setSex(new Scanner(System.in).nextLine());
       System.out.print("Ngay sinh");
       this.setDate(new Scanner(System.in).nextLine());
       System.out.print("Dia chi");
       this.setAddress(new Scanner(System.in).nextLine());
       
    }
    public void show() {
		System.out.print("Ho ten: "+this.name+"\nGioi tinh: "+this.sex+"\nNgay sinh: "+this.date+"\nDia chi: "+this.address);
	}
}

    

