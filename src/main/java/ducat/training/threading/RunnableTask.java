package ducat.training.threading;

public class RunnableTask implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+"-"+i);
		}
	}
}