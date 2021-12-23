package thread_a;

public class CauA extends Thread{

	public static void main(String[] args) {
		// câu a
		CauA t1 = new CauA();
		t1.start();
		
	}
	
	// in ra tiếng Beep sau 5 giây
	public void run() {
		System.out.println("in ra tiếng Beet sau 5s ");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" Beep");
		
	}
		
	

}
