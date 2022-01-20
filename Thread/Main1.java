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
public class Main1 extends Thread {

	public static void main(String[] args) {
		Main1 Thread3a = new Main1();
		Thread3a.start();
	}
	
	//Tạo 1 thread mà sẽ print ra tiếng “Beep” sau 5 giây.
	@Override
	public void run() {
		System.out.println("waiting in 5 seconds ...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Beep");
	}

}
