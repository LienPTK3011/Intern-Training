package FunctionalInterface_LambdaExpression_MethodReferences;

public class Action implements Movie{
	
	String action = "Here is action movie";
	@Override
	public void detail(String action) {
		System.out.println(action);
	}

}
