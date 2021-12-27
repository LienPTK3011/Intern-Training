package file;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	private String MaSV;
	private Float DiemTB;
	private String Email;
	public Student(String maSV, Float diemTB, String email) {
		
		MaSV = maSV;
		DiemTB = diemTB;
		Email = email;
	}
	public Student() {
		
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
	public String toString() {
		return "Student [MaSV=" + MaSV + ", DiemTB=" + DiemTB + ", Email=" + Email + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	public void input() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên");
		MaSV = sca.nextLine();
		System.out.println("Nhập điểm sinh viên");
		DiemTB = Float.parseFloat(sca.nextLine());
		System.out.println("Nhập email sinh viên");
		Email = sca.nextLine();
		
	}
	public String getFileLine() {
		return MaSV + "," + DiemTB + "," + Email + "\n";
		
	}
	
	public void parse(String line) {
		
		try {
			String[] p = line.split(",");
			MaSV = p[0];
			DiemTB = Float.parseFloat(p[1]);
			Email = p[2];
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
