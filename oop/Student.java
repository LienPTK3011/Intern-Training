package oop;

import java.util.Scanner;

public class Student extends Person{
	private String MaSV;
	private Float DiemTB;
	private String Email;
	public Student(String maSV, Float diemTB, String email) {
		super();
		MaSV = maSV;
		DiemTB = diemTB;
		Email = email;
	}
	public Student() {
		super();
	}
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public Float getDiemTB() {
		return DiemTB;
	}
	public void setDiemTB(Float diemTB) {
		DiemTB = diemTB;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public void nhapThongTinPerson() {
		// TODO Auto-generated method stub
		super.nhapThongTinPerson();
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập Mã Sinh viên");
		MaSV = sca.nextLine();
		System.out.println("Nhập điểm trung bình");
		do {
			try {
				DiemTB = Float.parseFloat(sca.nextLine());
			} catch (Exception e) {
				System.err.println("nhập điểm trong khoảng 0.0 -> 10.0");
			}
		} while (DiemTB == null || DiemTB<0.0 || DiemTB > 10.0);
		
		
		System.out.println("Nhập email");
		Email = sca.nextLine();
		System.out.println("---------------");
	}
	
	@Override
	public void hienthiThongTinPerson() {
		// TODO Auto-generated method stub
		super.hienthiThongTinPerson();
		System.out.printf(", MaSV: %s, DiemTB: %f, Email: %s\n", MaSV, DiemTB, Email);
	}
	
}
