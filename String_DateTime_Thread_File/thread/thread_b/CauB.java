package thread_b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CauB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newSingleThreadExecutor();
		 
        for (int i = 1; i <= 30; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
 
        executor.shutdown();
 
	}
	
}