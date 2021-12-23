package file;

import java.io.Serializable;

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
	
	
}
