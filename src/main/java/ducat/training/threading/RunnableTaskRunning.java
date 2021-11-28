package ducat.training.threading;

public class RunnableTaskRunning {
	public static void main(String[] args) {
		RunnableTask rt = new RunnableTask();
		Thread t1 = new Thread(rt);
		t1.setName("thread1");
		t1.start();
		
		Thread t2 = new Thread(rt);
		t2.setName("thread2");
		t2.start();
		
		for (int i = 0; i < 5; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i+currentThread.getName());
		}
		
	}
}
