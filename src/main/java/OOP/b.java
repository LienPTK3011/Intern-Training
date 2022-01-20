/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class b implements a{

    @Override
    public void sua(ArrayList<Student> listStudent) {
		
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			System.out.println("Sửa thông tin cho sinh viên theo MaSV");
			Scanner sca = new Scanner(System.in);
			System.out.println("Nhập MaSV cần sửa");
			String sua = sca.nextLine();
			
			
			for (int i = 0; i < listStudent.size(); i++) {
				if(listStudent.get(i).getStudentID().equals(sua)) {
					listStudent.get(i).showInformation();
					listStudent.remove(i);
					Student Student = new Student();
					Student.inputInformation();
					listStudent.add(Student);
					break;
				}
			}
			
		}
		
	}

    @Override
    public void xoa(ArrayList<Student> listStudent) {
		
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			System.out.println("Xóa thông tin cho sinh viên theo MaSV");
			Scanner sca = new Scanner(System.in);
			System.out.println("Nhập MaSV cần xóa");
			String xoa = sca.nextLine();
			
			
			for (int i = 0; i < listStudent.size(); i++) {
				if(listStudent.get(i).getStudentID().equals(xoa)) {
					listStudent.get(i).showInformation();
					listStudent.remove(i);
					System.out.println("xóa thành công sinh viên có MaSV="+xoa);
				}
			}
		}
		
	}

    @Override
   public void xem(ArrayList<Student> listStudent) {
		
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).showInformation();
			}
		}
	}
    @Override
    public void them(ArrayList<Student> listStudent) {
		
		System.out.println("Thông tin Student:");
		Scanner sca = new Scanner(System.in);
		System.out.println("Số lượng student");
		int soluong = 0; 
		do {
			try {
				soluong = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("Bạn phải nhập số");
			}
		} while (soluong <0 || soluong > 5);
		
		
		for (int i = 0; i < soluong; i++) {
			Student Student = new Student();
			Student.inputInformation();
			listStudent.add(Student);
		}
	}
    
}
