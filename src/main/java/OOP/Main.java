/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
                c c0 = new c();
		c0.them(listStudent);
                    break;
                case 2:
                c c1 = new c();
		c1.xem(listStudent);
                    break;
                case 3:
                c c2 = new c();
		c2.sua(listStudent);
                    break;
                case 4:
                c c3 = new c();
		c3.xoa(listStudent);
                    break;
                case 5: 
                    asc(listStudent);
		    break;
		case 6: 
                    desc(listStudent);
                    break;
		case 7: 
                    checkschoolarship(listStudent);
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
               
            }   
        } while (choose != 8);
    
        }
    //Thêm thông tin SV 1
    static void desc(ArrayList<Student> listStudent) {
		if(listStudent.isEmpty()) {
			System.out.println("Chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			Collections.sort(listStudent, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					if(s1.getAveragepoint()> s2.getAveragepoint()) {
						return -1;
					}
					return 1;
				}	
			});
			System.out.println("Danh sách sinh viên theo thứ tự điểm giảm dần là");
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).showInformation();
			}
		}
	}
    
 static void asc(ArrayList<Student> listStudent) {
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			Collections.sort(listStudent, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					if(s1.getAveragepoint() > s2.getAveragepoint()) {
						return 1;
					}
					return -1;
				}	
			});
			System.out.println("Danh sách sinh viên theo thứ tự điểm tăng dần là");
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).showInformation();
			}
		}
		
	}
 
 static void checkschoolarship(ArrayList<Student> listStudent) {
		System.out.println("Nhập mã sinh viên cần kiểm tra");
		Scanner sca = new Scanner(System.in);
		String timkiem = sca.nextLine();  
		int dem = 0;		
		
		for (Student student : listStudent) {
			if(student.getStudentID().equals(timkiem)) {
				student.showInformation();
				if(student.getAveragepoint()>8.0) {
					System.out.println("Bạn đc học bổng");
				}else {
					System.out.println(" Cần cố gắng hơn");
				}
				dem++;
				break;
			}
		}
		if(dem==0) {
			System.out.println("không có sinh viên nào có MaSV trùng khớp! ");
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

