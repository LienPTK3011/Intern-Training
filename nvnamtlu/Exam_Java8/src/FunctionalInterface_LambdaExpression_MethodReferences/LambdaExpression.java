package FunctionalInterface_LambdaExpression_MethodReferences;

public class LambdaExpression {
	
	public static void main(String[] args) { 
		Movie mv = mvType -> System.out.println(mvType+" is the best");
		mv.detail("Action movie");
	}
}
