package string;

import java.util.ArrayList;
import java.util.List;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bai1();
		System.out.println("-------------");
		bai2();
		System.out.println("-------------");
		bai3();
	}
	
	// bài 1 nối chuỗi
	public static void bai1() {
		List<String> list = new ArrayList<String>();
		list.add("hôm");
		list.add("nay");
		list.add("thứ");
		list.add("tư");
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			str +=  list.get(i) + " ";
		}
		
		System.out.println("các từ sau khi được nối: "+str);
	}
	
	// loại bỏ phần tên đệm của họ tên người dùng Nguyen Van A
	public static void bai3() {
		 String str = "Nguyen fsfds dfdh C";
	
		 
	     System.out.println("str đã loại bỏ tên đệm: " + str.split(" ")[0]+" "+ str.charAt(str.length()-1));
	    
	     
	}
	
	// bài 2 lấy chữ cái đầu tiên của tên
	public static void bai2() {
		String str = "Nguyen Van A Bbb ca";
	    String[] str1 = str.split(" ");
	    String str2 = "";
	    for (int i = 0; i < str1.length; i++) {
	    	str2 += str1[i].charAt(0);
		}
	    System.out.println("chữ cái đầu tiên của str: "+str2);
	}

}
