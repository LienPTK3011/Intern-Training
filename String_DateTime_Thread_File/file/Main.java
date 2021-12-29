package file;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static void Menu() {
		
		System.out.println("Chức năng 1: thêm thông tin Student ");
		System.out.println("Chức năng 2: hiển thị thông tin Student ");
		System.out.println("Chức năng 3: sửa thông tin Student ");
		System.out.println("Chức năng 4: xóa thông tin Student ");
		System.out.println("Chức năng 5: lưu vào file ");
		System.out.println("Chức năng 6: đọc file ");
		System.out.println("Chức năng 7: thoát ");
		System.out.println("=> Chọn chức năng ");
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println("==> câu a: append nội dung của 2 file thành 1 file");
		appendFile();
		System.out.println(" ");
		System.out.println("-----------------------------");
		
		
		System.out.println("==> câu b: đọc file ");
		readFile();
		System.out.println(" ");
		System.out.println("----------------------------");
		
		
		
		System.out.println("==> câu c,d: thêm, hiển thị, sửa ,xóa thông tin Student sau đó lưu file và đọc file ");
		ArrayList<Student> listStudent = new ArrayList<>();
		
		Scanner sca = new Scanner(System.in);
		int chose = 0;
		do {
			Menu();
			
			try {
				chose = Integer.parseInt(sca.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Phải nhập số");
			}
			
			switch (chose) {
			case 1: 
				System.out.println(" thêm thông tin Student ");
				insertStudent(listStudent);
				break;
			case 2: 		
				System.out.println(" hiển thị thông tin Student ");
				viewStudent(listStudent);
				break;
			case 3: 		
				System.out.println(" sửa  thông tin Student ");
				updateStudent(listStudent);
				break;
			case 4:
				System.out.println(" xóa thông tin Student ");
				deleteStudent(listStudent);
				break;
			case 5:
				System.out.println("lưu vào file ");
				saveFileObject(listStudent);
				break;
			case 6:
				System.out.println("đọc file ");
				readFileObject(listStudent);
				break;
			case 7:
				System.out.println("thoát");
				break;
			default:
				System.out.println("chọn lại");
				break;
			}
		} while (chose !=7);

	}



	//câu a:  append nội dung của 2 file thành 1 file
	public static void appendFile() throws IOException {
		try {
			FileInputStream file1 = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\text1.txt");
			FileInputStream file2 = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\text2.txt");
			byte[] buffer1 = new byte[1024];
			byte[] buffer2 = new byte[1024];
			
			int length1;
			int length2;
			length1 = file1.read(buffer1, 0, 1024);
			length2 = file2.read(buffer2, 0, 1024);
			
			String str1 = new String(buffer1, 0, length1);
			String str2 = new String(buffer2, 0, length2);
			
			System.out.println("***read file text1.txt: ***\n"+str1);
			System.out.println("***read file text2.txt: ***\n"+str2);
			
			file1.close();
			file2.close();
			
			FileOutputStream fileAll =  new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\textAll.txt");
			String str = str1+str2;
			fileAll.write(str.getBytes());
			fileAll.close();
			
			FileInputStream readfileAll = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\textAll.txt");
			int c = readfileAll.read();
			System.out.println("***read file textAll.txt:***");
			while (c != -1) {
				System.out.print((char) c);
				c = readfileAll.read();
			}
			readfileAll.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	// câu b: đọc file text.txt và in ra màn hình
	public static void readFile() {
		try {
			File file = new File("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\text.txt");
			
			InputStream inputStream =  new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
			int c;
	        while ((c= inputStreamReader.read()) != -1){	
	            System.out.print((char) c);
	            
	        }
	        
	        inputStreamReader.close();
	        inputStream.close();
	        
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
        
	}

	// câu d:  thêm mới  thông tin Student 
	public static void insertStudent(ArrayList<Student> listStudent) {
		System.out.println("Thêm thông tin sinh viên");
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập số sinh viên cần thêm");
		int a = 0;
		try {
			 a = Integer.parseInt(sca.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (int i = 0; i < a; i++) {
			Student student = new Student();
			student.input();
			listStudent.add(student);
		}
	}
	
	// hiển thị thong tin
	public static void viewStudent(ArrayList<Student> listStudent)  {
		for (Student student : listStudent) {
			student.display();
		}
	}
	
	
	// xóa thông tin
	public static void deleteStudent(ArrayList<Student> listStudent)  {
		Scanner sca = new Scanner(System.in);
		System.out.println("nhập mã sinh viên cần xóa");
		String msv = sca.nextLine();
		
		for (Student student : listStudent) {
			if(student.getMaSV().equals(msv)) {
				listStudent.remove(student);
				break;
			}	
		}

	}
	
	// sửa thông tin
	public static void updateStudent(ArrayList<Student> listStudent)  {	
		Scanner sca = new Scanner(System.in);
		System.out.println("nhập mã sinh viên cần sửa");
		String msv = sca.nextLine();
		
		for (Student student : listStudent) {
			if(student.getMaSV().equals(msv)) {
				student.input();
				break;
			}	
		}

	}
	
	// câu c: đọc thông tin Student
	private static void readFileObject(ArrayList<Student> listStudent) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student1.txt");
			InputStreamReader read = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(read);
			
			String line = null;
			while((line = buf.readLine()) != null) {
				Student student = new Student();
				student.parse(line);  // parse()
				listStudent.add(student);
				
			}
			buf.close();
			read.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	private static void saveFileObject(ArrayList<Student> listStudent) {
		System.out.println("Lưu file");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student1.txt");
			for (Student student : listStudent) {
				String line = student.getFileLine(); /// getFileLine()
				byte[] b = line.getBytes("utf8");
				fos.write(b);
			}
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
