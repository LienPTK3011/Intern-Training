package nvnamtlu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam_Thread_3b {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		for(int i=0; i<30; i++) {
			es.execute(new PrintBeepB());
		}
		es.shutdown(); 
	}
}

class PrintBeepB implements Runnable {

	public PrintBeepB() {
		super();
	}

	@Override
	public void run() {
		try {
			System.out.println("waiting in 5 seconds ...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Beep");
	}
	
}
