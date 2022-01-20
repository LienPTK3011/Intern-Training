/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Asus
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
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
