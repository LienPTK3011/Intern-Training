package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("==> câu a: append nội dung của 2 file thành 1 file");
		appendFile();
		System.out.println(" ");
		System.out.println("-----------------------------");
		
		
		System.out.println("==> câu b: đọc file ");
		readFile();
		System.out.println(" ");
		System.out.println("----------------------------");
		
		
		System.out.println("==> câu c: đọc Object Student ");
		readObject();
		System.out.println(" ");
		System.out.println("----------------------------");
		
		
		System.out.println("==> câu d: thêm, sửa ,xóa thông tin Student ");
		manageStudent();
		
		
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
	            c=inputStreamReader.read();
	            if(c>2) {
	            	break;
	            }
	        }
	        
	        inputStreamReader.close();
	        inputStream.close();
	        
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
        
	}
	
	
	// câu c: đọc thông tin Student và in ra màn hình
	public static void readObject() {
		Student student = new Student("Vu Dinh Phu", 10f, "phu@gmail.com");
		try {
			// in dữ liệu vào file student.txt
			FileOutputStream file = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student.txt");
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(student);
			object.close();
			file.close();
			
			
			// đọc dữ liệu từ student.txt hiển thị ra màn hình
			FileInputStream file1 = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student.txt");
			ObjectInputStream object1 = new ObjectInputStream(file1);
			Student s1 = (Student) object1.readObject();
			System.out.println(s1);
			object1.close();
			file1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// câu d:  thêm mới, Chỉnh sửa, xóa thông tin Student sau đó lưu vào file.
	private static void manageStudent() {
		System.out.println("Thêm mới thông tin sinh viên");
		Scanner sca = new Scanner(System.in);
		System.out.println("Nhập họ tên sinh viên");
		String name = sca.nextLine();
		Float averagePoint = null;
		System.out.println("Nhập điểm sinh viên");
		try {
			averagePoint = Float.parseFloat(sca.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Nhập email");
		String mail = sca.nextLine();
		
		Student student = new Student(name, averagePoint, mail);
		try {
			// in dữ liệu vào file student.txt
			FileOutputStream file = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student.txt");
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(student);
			object.close();
			file.close();
			
			
			// đọc dữ liệu từ student.txt hiển thị ra màn hình
			FileInputStream file1 = new FileInputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student.txt");
			ObjectInputStream object1 = new ObjectInputStream(file1);
			Student s1 = (Student) object1.readObject();
			System.out.println(s1);
			object1.close();
			file1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
