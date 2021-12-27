/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dang
 */
public class Main2 extends Student implements Interface1
{
public static List<Student> studentList = new ArrayList<>();
//Không Override được

@Override
public String studentADD(String name, String sex, int age, String adress,int id,String studentID ,int averagepoint,String email) {
		 
        Student s = new Student(name,sex,age,adress,id,studentID,averagepoint,email);
         s.enter();
        studentList.add(s);
        return s.getstudentID();
}
        @Override
	public boolean studentEDIT() { 
		 for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getid() == id){
                Student s = new Student(id,name,sex,age,adress,studentID,averagepoint,email);
                studentList.set(i,s);
                return true;
            }
        }
        return false;
        }
        @Override
	public boolean studentDELETE(){
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getid() == id){
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
        @Override
	public void studentSHOW(){
        if(studentList.size()==0){
            System.out.println("!");
            
        }
        for (Student s : studentList){
            System.out.println(s);
        }
    }
        @Override
        public List<Student> studentFIND(String Name){
       List<Student> list = new ArrayList<>();
       for (int i=0;i<studentList.size();i++){
           if(studentList.get(i).getName().equalsIgnoreCase(name)){
           list.add(studentList.get(i));
            }
       }
        return list;
    }
         public void sort(){
        Collections.sort(studentList);
    }

   
}
