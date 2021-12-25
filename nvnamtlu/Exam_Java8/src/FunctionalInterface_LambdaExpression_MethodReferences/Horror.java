package FunctionalInterface_LambdaExpression_MethodReferences;

public class Horror implements Movie{

	String horror = "Here is horror movie";
	@Override
	public void detail(String horror) {
		System.out.println(horror);
	}

}
