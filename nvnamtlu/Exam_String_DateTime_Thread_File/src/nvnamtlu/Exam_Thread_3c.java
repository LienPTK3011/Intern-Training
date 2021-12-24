package nvnamtlu;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam_Thread_3c {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		do {			
			es.execute(new PrintBeepC()); 
		}
		while(!(new Scanner(System.in).nextLine()).equalsIgnoreCase("Stop"));
		System.err.println("Stop now!");
		es.shutdown();
	}
}

class PrintBeepC implements Runnable {

	public PrintBeepC() {
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
