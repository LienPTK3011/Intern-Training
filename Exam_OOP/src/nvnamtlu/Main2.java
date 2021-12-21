package nvnamtlu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 extends Student{	
	static Student sv = new Student();
	
	public static void menu() {
		System.out.println("<-- Danh sách chứa năng -->");
		System.out.println("1.Xem danh sách sinh viên");
		System.out.println("2.Thêm sinh viên");
		System.out.println("3.Sửa thông tin sinh viên");
		System.out.println("4.Xóa sinh viên");
		System.out.println("5.Tìm kiếm sinh viên");
		System.out.println("6.Sắp xếp tăng dần theo điểm");
		System.out.println("7.Sắp xếp giảm dần theo điểm");
		System.out.println("8.Thoát");
		System.out.println("Bạn muốn làm gì?");
		int n = new Scanner(System.in).nextInt();
		switch(n){
		case 1:
			sv.xemSV();
			break;
		case 2:
			sv.themSV();
			break;
		case 3:
			sv.suaSV();
			break;
		case 4:
			sv.xoaSV();
			break;
		case 5:
			sv.timSV();
			break;
		case 6:
			sv.sapXepTang();
			break;
		case 7: 
			sv.sapXepGiam();
			break;
		case 8:
			System.err.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
