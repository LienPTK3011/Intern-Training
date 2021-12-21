/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Menumain {
    public static List<Student> studentList = new ArrayList<>();
    public int insert(int id, String name, String sex, String date, String address, String email, double avg){
        Student s = new Student(id,name,sex,date,address,email,avg);
        s.input();
        studentList.add(s);
        return s.getId();
    }
    public boolean update(int id, String name, String sex, String date, String address, String email, double avg){
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId() == id){
                Student s = new Student(id,name,sex,date,address,email,avg);
                studentList.set(i,s);
                return true;
            }
        }
        return false;
    }
     public boolean delete(int id){
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId() == id){
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
    public List<Student> findByName(String Name){
       List<Student> list = new ArrayList<>();
       for (int i=0;i<studentList.size();i++){
           if(studentList.get(i).getName().equalsIgnoreCase(Name)){
           list.add(studentList.get(i));
            }
       }
        return list;
    }
            
    public void sort(){
        Collections.sort(studentList);
    }
    
    public void travel(){
        if(studentList.size()==0){
            System.out.println("Danh sach rong !");
            
        }
        for (Student s : studentList){
            System.out.println(s);
        }
    }

    void insert(Student sAdd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void update(Student sUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
