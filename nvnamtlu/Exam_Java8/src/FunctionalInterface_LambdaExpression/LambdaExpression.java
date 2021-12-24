package FunctionalInterface_LambdaExpression;

public class LambdaExpression {
	//Sử dụng Lambda Expression override “detail”
	Movie movieObject = () -> {
		System.out.println("Create movie object with Lambda expression");
	};
	
	public static void main(String[] args) {
		 LambdaExpression ld = new LambdaExpression();
		 ld.movieObject.detail();
	}
}
