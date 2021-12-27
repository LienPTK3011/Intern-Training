package OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class Main {
	    
	public static void main(String[] args) {
		Student student = new Student();

		// preJava8
		if(student.list == null) {
			System.out.println("list rỗng");
		}else {
			System.out.println("tên sinh viên là: " + student.list.get(0).getName());
		}
			
		// sinceJava8
		Optional<Student> op = Optional.of(student);
		op.ifPresent(s ->System.out.println("Tên sinh viên là: "+ s.getName()));
		
	}
	 
}

class Student {
    private String name;

    List<Student> list = null;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

  
}