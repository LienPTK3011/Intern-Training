package DefaultMethod;

public interface Animal {
	void eat();
	void breath();
	
	default void run() {
		System.out.println("Animal is running");
	}
}
