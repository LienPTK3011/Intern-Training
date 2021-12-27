package FI_LE_MR_sinceJava8;

public class Main {

	public static void main(String[] args) {
		
		// bài 3: sử dụng lambda expression
		Movie mv1 = (s)-> System.out.println(s);
		mv1.detail("detail_lambda expression");
		
		// bài 5: sử dụng method reference
		Movie mv2 = System.out::println;
		mv2.detail("detail_method reference");
	}

}
