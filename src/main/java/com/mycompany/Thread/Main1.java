/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Thread;

/**
 *
 * @author Dang
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
