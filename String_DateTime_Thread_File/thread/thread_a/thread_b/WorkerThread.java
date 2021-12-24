package thread_b;

public class WorkerThread implements Runnable{
	private String task;
	 
    public WorkerThread(String s) {
        this.task = s;
    }
 
    @Override
    public void run() {
        System.out.println(" Beep = " + task);
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
