package ducat.training.threading;

public class Shared {
	
	int count =0;
	boolean setValue=false;
	
	public synchronized void produce() {
		Thread currentThread = Thread.currentThread();
		if(setValue) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(currentThread.getName() + count);
		setValue=true;
		notify();
	}
	
	public synchronized void consume() {
		Thread currentThread = Thread.currentThread();
		if(!setValue) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(currentThread.getName() + count);
		setValue=false;
		notifyAll();
	}
}
