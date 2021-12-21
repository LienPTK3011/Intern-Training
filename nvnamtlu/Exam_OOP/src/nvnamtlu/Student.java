package nvnamtlu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Student extends Person implements IStudent{
	static HashMap<Integer, Student> dssv = new HashMap<Integer, Student>();
	private int id;
	private double GPA;
	private String email;
	
	public Student() {
		
	}
	
	public Student(String name, String sex, String address, String birthOfDate, int id, double GPA, String email) {
		super(name, sex, address, birthOfDate);
		this.id = id;
		this.GPA = GPA;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nId: "+this.id+"\nGPA: "+this.GPA+"\nEmail: "+this.email;
	}
	
	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input id: ");
		this.id = sc.nextInt();
		System.out.print("Input GPA: ");
		this.GPA = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input Email: ");
		this.email = sc.nextLine();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("\nId: "+this.id+"\nGPA: "+this.GPA+"\nEmail: "+this.email);
	}

	@Override
	public void themSV() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name: ");
		String ten = sc.nextLine();
		System.out.print("Input sex: ");
		String gt = sc.nextLine();
		System.out.print("Input address: ");
		String diaChi = sc.nextLine();
		System.out.print("Input birth of date: ");
		String ngaySinh= sc.nextLine();
		System.out.print("Input id: ");
		int ma = sc.nextInt();
		System.out.print("Input GPA: ");
		double diem = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input Email: ");
		String email = sc.nextLine();
		Student st = new Student(ten, gt, diaChi, ngaySinh, ma, diem, email);
		if(dssv.containsKey(st.getId())==false) {
			dssv.put(st.getId(), st);
		}
	}

	@Override
	public void suaSV() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã muốn sửa: ");
		int ma = sc.nextInt(); 
		if(dssv.containsKey(ma)) {
			System.out.print("Input name: ");
			String ten = sc.nextLine();
			sc.nextLine();
			System.out.print("Input sex: ");
			String gt = sc.nextLine();
			System.out.print("Input address: ");
			String diaChi = sc.nextLine();
			System.out.print("Input birth of date: ");
			String ngaySinh= sc.nextLine();
			System.out.print("Input GPA: ");
			double diem = sc.nextDouble();
			sc.nextLine();
			System.out.print("Input Email: ");
			String email = sc.nextLine();
			
			Student sv = new Student(gt, diaChi, ngaySinh, ten, ma, diem, email);
			dssv.put(ma,sv);
		}else {
			System.err.println("Mã SV "+ma+" không tồn tại!");
		}
	}

	@Override
	public void xoaSV() {
		System.out.print("Nhập mã sinh viên cần xóa:");
		int ma = new Scanner(System.in).nextInt();
		if(dssv.containsKey(ma)) {
			dssv.remove(ma);
			System.out.println("Xoá SV có mã "+ma+" thành công");
		}else {
			System.err.println("Mã SV "+ma+" không tồn tại!");
		}
	}

	@Override
	public void xemSV() {
		System.out.println("Danh sách sinh viên: ");
		for(Map.Entry<Integer, Student> sv : dssv.entrySet()) {
			System.out.println("--------------------------");
			System.out.println(sv.getValue());
		}
	}

	@Override
	public void timSV() {
		System.out.print("Nhập mã sv cần tìm: ");
		int ma = new Scanner(System.in).nextInt();
		for(Map.Entry<Integer, Student> sv : dssv.entrySet()) {
			if(sv.getValue().getId() == ma) {
				System.out.println(sv.getValue());
			}
		}
	}
	
	List<Map.Entry<Integer, Student>> listSV = new ArrayList<>(dssv.entrySet());

	@Override
	public void sapXepTang() {
		
		Collections.sort(listSV, new Comparator<Map.Entry<Integer, Student>>() {
			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				if(o1.getValue().GPA < o2.getValue().getGPA()) {
					return -1;
				} else {
					if(o1.getValue().GPA == o2.getValue().getGPA()) {
						return 0;
					} else {
						return 1;
					}
				}
			}
		});
		System.out.println("Danh sách sinh viên theo điểm số tăng dần: ");
		for(Map.Entry<Integer, Student> sv : dssv.entrySet()) {
			System.out.println("--------------------------");
			System.out.println(sv.getValue());
		}
	}

	@Override	
	public void sapXepGiam() {
		Collections.sort(listSV, new Comparator<Map.Entry<Integer, Student>>() {
			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				if(o1.getValue().getGPA() < o2.getValue().getGPA()) {
					return 1;
				} else {
					if(o1.getValue().getGPA() == o2.getValue().getGPA()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
		
		System.out.println("Danh sách sinh viên theo điểm số giảm dần: ");
		for(Map.Entry<Integer, Student> sv : dssv.entrySet()) {
			System.out.println("--------------------------");
			System.out.println(sv.getValue());
		}
	}
	
}
