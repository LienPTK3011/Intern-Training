/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static HashMap<Integer, Student> csdl = new HashMap<Integer, Student>();

	public static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Lưu File");
		System.out.println("6.Đọc File");
		System.out.println("7.Thoát");
		System.out.println("Bạn muốn làm gì?");
		int n = new Scanner(System.in).nextInt();
		switch(n){
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			luuFile();
			break;
		case 6: 
			docFile();
			break;
		case 7:
			System.err.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}
	
	private static void docFile() {
		csdl = Fileio.readFile("csdl_contact.dat");
	}

	private static void luuFile() {
		Fileio.saveFile(csdl, "C:\Users\Asus\Documents\NetBeansProjects\MVC\src\data\csdl_contact.dat");
	}


	private static void xoa() {
		System.out.print("Nhập mã cần xóa: ");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			csdl.remove(ma);
			System.out.println("Xóa mã "+ma+" thành công");
		}else {
			System.err.println("Mã "+ma+" Không tồn tại!");
		}
	}

	private static void sua() {
		System.out.println("Nhập mã muốn sửa:");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			System.out.println("Nhập tên:");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("Nhập điểm:");
			Double diem = new Scanner(System.in).nextDouble();
			
			Student c = new Student(ma, ten, diem);
			csdl.put(ma, c);
		} else {
			System.err.println("Mã "+ma+" không tồn tại!");
		}
	}

	private static void xuat() {
		System.out.println("Danh sách sinh viên:");
		for(Map.Entry<Integer, Student> item : csdl.entrySet()) {
			System.out.println(item.getValue());
		}
	}

	private static void them() {
		System.out.println("Nhập mã:");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên:");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhập điểm:");
		Double diem = new Scanner(System.in).nextDouble();
		
		Student c = new Student(ma, ten, diem);
		if(csdl.containsKey(c.getId()) == false) {
			csdl.put(c.getId(), c);
		}
	}

	public static void main(String[] args) {
		while(true){			
			menu();
		}
	}

}