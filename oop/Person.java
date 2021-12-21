package oop;

import java.util.Scanner;

public class Person {
	// các thuộc tính đều đã đc để là private
	private String Ten;
	private String GioiTinh;
	private String DiaChi;
	private String NgaySinh;
	public Person() {
		super();
	}
	public Person(String ten, String gioiTinh, String diaChi, String ngaySinh) {
		super();
		Ten = ten;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
		NgaySinh = ngaySinh;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	
	//  nhập thông tin Person
	public void nhapThongTinPerson() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập tên");
		Ten = sca.nextLine();
		System.out.println("Nhập giới tính");
		GioiTinh = sca.nextLine();
		System.out.println("Nhập địa chỉ");
		DiaChi = sca.nextLine();
		System.out.println("Nhập ngày sinh");
		NgaySinh = sca.nextLine();
	}
	
	// hiển thị thông tin Person
	public void hienthiThongTinPerson() {
		System.out.printf("\nTen: %s, GioiTinh: %s, DiaChi: %s, NgaySinh: %s", Ten, GioiTinh, DiaChi, NgaySinh);
	}
}
