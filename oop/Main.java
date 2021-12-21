/**
 * 
 */
package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> listStudent = new ArrayList<>();
		Scanner sca = new Scanner(System.in);
		int chon = 0;  // biến chọn các chức năng
		
		do {
			Menu();
			// bắt ngoại lệ cho nhập số trong menu
			try {
				chon = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("bạn phải nhập số");
			}
				
			
			switch (chon) {
				case 1: 
					nhapthongtinStudent(listStudent);
					break;
				case 2: 
					hienthithongtinStudent(listStudent);
					break;
				case 3: 
					tangdanDiem(listStudent);
					break;
				case 4: 
					giamdanDiem(listStudent);
					break;
				case 5: 
					kiemtraHocBong(listStudent);
					break;
				case 6: 
					// chức năng thêm sinh viên
					c c = new c();
					c.them(listStudent);
					break;
				case 7: 
					// chức năng hiển thị sinh viên
					c c1 = new c();
					c1.xem(listStudent);
					break;
				case 8: 
					// chức năng sửa sinh viên
					c c2 = new c();
					c2.sua(listStudent);
					break;
				case 9: 
					// chức năng xóa sinh viên
					c c3 = new c();
					c3.xoa(listStudent);
					break;
				case 10: 
					System.out.println("Thoát menu");
					break;
				default:
					System.out.println("Vui lòng chọn lại chức năng");
					break;
				
			}
		} while (chon !=10);
	}

	//  kiểm tra học bổng
	static void kiemtraHocBong(ArrayList<Student> listStudent) {
		System.out.println("Nhập mã sinh viên cần kiểm tra");
		Scanner sca = new Scanner(System.in);
		String timkiem = sca.nextLine();  // khởi tạo biến chứa mã sinh viên nhập vào cần tìm
		int dem = 0;		// khởi tạo biến đếm 
		
		for (Student student : listStudent) {
			if(student.getMaSV().equals(timkiem)) {
				student.hienthiThongTinPerson();
				if(student.getDiemTB()>8.0) {
					System.out.println("==> Bạn đc học bổng");
				}else {
					System.out.println("==> Cần cố gắng hơn");
				}
				dem++;
				break;
			}
		}
		if(dem==0) {
			System.out.println("không có sinh viên nào có MaSV trùng khớp! ");
		}
	}

	// chức năng sắp xếp điểm trung bình theo thứ tự giảm dần
	static void giamdanDiem(ArrayList<Student> listStudent) {
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			Collections.sort(listStudent, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					if(s1.getDiemTB() > s2.getDiemTB()) {
						return -1;
					}
					return 1;
				}	
			});
			System.out.println("Danh sách sinh viên theo thứ tự điểm giảm dần là");
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).hienthiThongTinPerson();
			}
		}
		
	}

	// chức năng sắp xếp điểm trung bình theo thứ tự tăng dần
	static void tangdanDiem(ArrayList<Student> listStudent) {
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			Collections.sort(listStudent, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					if(s1.getDiemTB() > s2.getDiemTB()) {
						return 1;
					}
					return -1;
				}	
			});
			System.out.println("Danh sách sinh viên theo thứ tự điểm tăng dần là");
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).hienthiThongTinPerson();
			}
		}
		
	}

	// chức năng hiển thị thông tin sinh viên
	static void hienthithongtinStudent(ArrayList<Student> listStudent) {
		if(listStudent.isEmpty()) {
			System.out.println("chưa có sinh viên nào. Vui lòng thêm sinh viên");
		}else {
			for (int i = 0; i < listStudent.size(); i++) {
				listStudent.get(i).hienthiThongTinPerson();
			}
		}
		
	}

	// hàm nhập thông tin sinh viên
	static void nhapthongtinStudent(ArrayList<Student> listStudent) {
		System.out.println("Nhập thông tin cho Student");
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên cần thêm");
		int soluong = 0;	// khởi tạo biến số lượng sinh viên cần thêm
		
		// kiểm tra số nhập vào
		do {
			try {
				soluong = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				System.err.println("Bạn phải nhập số");
			}
		} while (soluong <0 || soluong > 5);
		
		
		for (int i = 0; i < soluong; i++) {
			Student Student = new Student();
			Student.nhapThongTinPerson();
			listStudent.add(Student);
		}
	}

	// menu
	static void Menu() {
		System.out.println("***********************************************************************");
		System.out.println("Chức năng 1: Nhập thông tin cho Student");
		System.out.println("Chức năng 2: Hiển thị thông tin cho Student");
		System.out.println("Chức năng 3: Sắp xếp điểm theo thứ tự tăng dần");
		System.out.println("Chức năng 4: Sắp xếp điểm theo thứ tự giảm dần");
		System.out.println("Chức năng 5: Kiểm tra học bổng");
		System.out.println("Chức năng 6: thêm");
		System.out.println("Chức năng 7: xem");
		System.out.println("Chức năng 8: sửa");
		System.out.println("Chức năng 9: xóa");
		System.out.println("Chức năng 10: Thoát menu");
		System.out.println("***********************************************************************");
	}
}
