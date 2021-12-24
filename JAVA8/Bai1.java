package java8;

interface Animal {
	//  tạo 2 abstract method eat và breath
	public void eat();
	public void breath();
	
	default void run() {
		System.out.println("lớp động vật");
	}
}

class Dog implements Animal {

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
	}
}

class Cat implements Animal{

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
	}
}

class Fish implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Bai1 {


}

