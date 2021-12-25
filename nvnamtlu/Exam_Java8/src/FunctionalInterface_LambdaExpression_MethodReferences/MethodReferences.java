package FunctionalInterface_LambdaExpression_MethodReferences;


public class MethodReferences {

	public static void main(String[] args) {
		Movie action = System.out::println;
		action.detail("Action movie is the best");
	}

}
