package ducat.training.threading;

public class Running {
	public static void main(String[] args) {
		CustomThread t1 = new CustomThread("Thread1");
		t1.start();
		
		CustomThread t2 = new CustomThread("Thread2");
		t2.start();
		for (int i = 0; i < 5; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(i+currentThread.getName());
		}
	}
}
