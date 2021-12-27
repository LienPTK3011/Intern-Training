/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OOP;

import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Person {

    private String name;
    private String sex;
    private int age;
    private String adress;

    public Person() {
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

    public String getName() {
        return name;
    }

    public void setsex(String sex) {
        this.sex = sex;
    }

    public String getsex() {
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

    public String getAdress() {
        return adress;
    }
//   public void enter(Scanner sc) {
////	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter name: ");
//	this.name = sc.nextLine();
//	System.out.println("Enter sex: ");
//	this.sex = sc.nextLine();
//	System.out.println("Enter address: ");
//	this.adress = sc.nextLine();
//	System.out.println("Enter Age: ");
//	this.age = sc.nextInt();
//	}

    public void display() {
        System.out.println("Name: " + this.name + "\nSex: " + this.sex + "\nAddress: " + this.adress + "\nAge: " + this.age);
    }

}
