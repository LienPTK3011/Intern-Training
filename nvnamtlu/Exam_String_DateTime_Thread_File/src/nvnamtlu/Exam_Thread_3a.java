package nvnamtlu;

public class Exam_Thread_3a extends Thread {

	public static void main(String[] args) {
		Exam_Thread_3a exam_Thread_3a = new Exam_Thread_3a();
		exam_Thread_3a.start();
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
