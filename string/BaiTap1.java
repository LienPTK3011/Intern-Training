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
		
		String str1 = list.get(0);
		String str2 = list.get(1);
		String str3 = list.get(2);
		String str4 = list.get(3);
		System.out.println("các từ sau khi được nối: " + str1+" "+str2+" "+str3+" "+str4);
	}
	
	// bafi bỏ phần tên đệm của họ tên người dùng Nguyen Van A
	public static void bai3() {
		 String str = "Nguyen Van A";
	     System.out.println("str đã loại bỏ tên đệm: " + str.split(" ")[0] +" "+ str.split(" ")[2]);
	     
	}
	
	// bài 2 lấy chữ cái đầu tiên của tên
	public static void bai2() {
		String str = "Nguyen Van A";
	    String[] str1 = str.split(" ");
	    
	    System.out.println("chữ cái đầu tiên của str: " + str1[0].charAt(0) +""+ str1[1].charAt(0) +""+ str1[2].charAt(0));
	}

}
