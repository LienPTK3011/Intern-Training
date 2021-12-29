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
public class Person {
    
    private String name;
    private String sex;
    private int age;
    private String adress;

    public Person(String name, String sex, int age, String adress) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.adress = adress;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sex=" + sex + ", age=" + age + ", adress=" + adress + '}';
    }
    public void inputInformation()
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	name = sc.nextLine();
	System.out.println("Enter sex: ");
	sex = sc.nextLine();
        System.out.println("Enter Age: ");
	age = Integer.parseInt(sc.nextLine());
	System.out.println("Enter address: ");
	adress = sc.nextLine();
    }
    public void showInformation()
    {
        System.out.println(toString());
    }
}

