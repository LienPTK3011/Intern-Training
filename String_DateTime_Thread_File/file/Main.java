package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("==> câu b: đọc flie ");
		readFile();
		System.out.println(" ");
		System.out.println("==> câu c: đọc Object Student ");
		readObject();
		
		
	}

	// đọc file và in ra màn hình
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
	
	// đọc thông tin Student và in ra màn hình
	public static void readObject() {
		Student student = new Student("Vu Dinh Phu", 10f, "phu@gmail.com");
		try {
			// in dữ liệu vào file student.txt
			FileOutputStream file = new FileOutputStream("D:\\eclipse-workspace\\THUCTAPBUOI1\\src\\file\\student.txt");
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(student);
			object.close();
			file.close();
			
			
			// đọc dữ liệu từ student.txt ra 
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
