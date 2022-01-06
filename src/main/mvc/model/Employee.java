package model;

import java.util.Scanner;

public class Employee {
	public int id;
	public String name;
	public String department;
	public String skill;

    public Employee() {
        
    }

    public Employee(int id, String name, String department, String skill) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
 
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", skill=" + skill + '}';
    }
}
