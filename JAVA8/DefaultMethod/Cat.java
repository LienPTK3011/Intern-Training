package DefaultMethod;

public class Cat implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Animal.super.run();
		System.out.println("cat");
	}

}
