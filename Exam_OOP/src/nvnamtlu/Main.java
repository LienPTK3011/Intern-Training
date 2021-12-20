package nvnamtlu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Student st = new Student();
	
	public static void menu() {
		st.inputInfo();
		while(true) {
			System.out.println("<-- Danh sách chứa năng -->");
			System.out.println("1.Hiển thị thông tin sinh viên");
			System.out.println("2.Xét học bổng");
			System.out.println("3.Thoát");
			System.out.println("-->Bạn muốn làm gì ?");
			int n = new Scanner(System.in).nextInt();
			if(n==1) {
				st.showInfo();
			}
			else if(n==2) {
				if(st.getGPA()>8) {
					System.out.println("Chúc mừng "+st.getName()+" đã đạt h�?c bổng");
				}else {
					System.out.println(st.getName()+" cần cố gắng hơn nữa nhé");
				}
			} else{
				System.err.println("Bạn đã thoát chương trình!");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		menu();
	}

}
