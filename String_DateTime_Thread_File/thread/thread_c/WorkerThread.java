package thread_c;

import java.util.Scanner;

public class WorkerThread implements Runnable{
	
	private String task;
	 
    public WorkerThread(String s) {
        this.task = s;
    }
 
    public void run() {
        System.out.println(" Beep = " + task);
        try {
            Thread.sleep(100);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
}
