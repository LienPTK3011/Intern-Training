package nvnamtlu;
import java.util.Scanner;

public class Exam_String {
	
	//a.Tạo phương thức trong đó chấp nhận 1 list các từ 
	//và trả ra một String là các từ đó được nối với nhau bởi dấu cách.
	public static void noiChuoi(String []listWord) {
		String str = "";
		for(int i=0; i<listWord.length-1; i++) {
			str+=listWord[i]+" ";
		}
		str+=listWord[listWord.length-1];
		System.out.println(str);
	}

	//b.Tạo phương thức mà nhận vào tên đầy đủ dưới dạng 1 String duy nhất 
	//và trả ra là 1 String bao gồm tên viết tắt (ví dụ: Nguyễn Văn A -> NVA).
	public static void TenVietTat(String name) {
		String[] listWord = name.split(" ");
		String newName = "";
		for(int i=0; i<listWord.length; i++) {
			newName+=listWord[i].substring(0, 1);
		}
		System.out.println(newName);
	}
	
	//c. Tạo phương thức mà nhận vào tên đầy đủ giống như (b) 
	//và trả ra String đã được loại bỏ toàn bộ tên đệm (ví dụ: Nguyễn Văn A -> Nguyễn A)
	public static void hoTen(String name) {
		String[] listWord = name.split(" ");
		String hoTen = listWord[0] + " " + listWord[listWord.length-1];
		System.out.println(hoTen);
	}
	
	public static void main(String[] args) {
		String [] listWord = {"Nguyễn", "Văn", "Nam", "TTS", "Thuy", "Loi"};
		noiChuoi(listWord);
		
		String name = "Nguyễn Văn Nam";
		TenVietTat(name);
		hoTen(name);
	}

}
