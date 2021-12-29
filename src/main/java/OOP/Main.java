/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       ArrayList<Student> listStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose action: ");
        int choose = 0;
        
        do { 
            choose = Integer.parseInt(sc.nextLine());  
            switch(choose){
                
                case 1:
                  insertStudent(listStudent);
                    break;
                case 2:
                   displayStudent(listStudent);
                    break;
                case 3:
                  editStudent(listStudent);
                    break;
                case 4:
                   deleteStudent(listStudent);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
               
            }   
        } while (choose != 5);
    
        }
    //Thêm thông tin SV 
    private static void insertStudent(ArrayList<Student> listStudent) {
        Student student = new Student();
        student.inputInformation();
        listStudent.add(student);         
    }
    
    
    //Hiển thị
    private static void displayStudent(ArrayList<Student> listStudent) {
       
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).showInformation();
       
        }
    }
    //Sửa
    private static void editStudent(ArrayList<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua Thong Tin Sinh Vien: ");
        System.out.println("Nhap MSV can sua");
        String sua = sc.nextLine();
        for (int i = 0; i <listStudent.size(); i++) {
            if(listStudent.get(i).getStudentID().equals(sua)){
             
                listStudent.get(i).showInformation();
                listStudent.remove(i);
                Student st = new Student();
                st.inputInformation();
                listStudent.add(st);
            }
        }
    }
    
    //Xóa
    private static void deleteStudent(ArrayList<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xoa Thong Tin Sinh Vien: ");
        System.out.println("Nhap MSV can xoa");
        String xoa = sc.nextLine();
        for (int j = 0; j <listStudent.size(); j++) {
            if(listStudent.get(j).getStudentID().equals(xoa)){
             
                listStudent.get(j).showInformation();
                listStudent.remove(j);             
            }         
        }
    }    
}

