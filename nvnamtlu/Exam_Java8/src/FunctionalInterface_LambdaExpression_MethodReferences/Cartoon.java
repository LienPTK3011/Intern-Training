package FunctionalInterface_LambdaExpression_MethodReferences;

public class Cartoon implements Movie{

	String cartoon = "Here is cartoon movie";
	@Override
	public void detail(String cartoon) {
		System.out.println(cartoon);
	}

}
