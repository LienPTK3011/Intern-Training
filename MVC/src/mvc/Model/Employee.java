/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Employee {
	public String id;
	public String name;
	public String department;
	public String skill;

    public Employee() {
        
    }

    public Employee(String id, String name, String department, String skill) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skill = skill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
    public void input(){
        System.out.print("ID: ");
	id = new Scanner(System.in).nextLine();
	System.out.print("Name: ");
	name = new Scanner(System.in).nextLine();
	System.out.print("Department: ");
	department = new Scanner(System.in).nextLine();
	System.out.print("Skill: ");
	skill = new Scanner(System.in).nextLine();
    }
    
    public void dislayout(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", skill=" + skill + '}';
    }
}
