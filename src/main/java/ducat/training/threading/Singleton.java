package ducat.training.threading;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	static ReentrantLock lock = new ReentrantLock();
	private static Singleton s;
	
	public static Singleton getInstance() {
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.lock();
				if(s == null) {
					synchronized(Singleton.class) {
						if(s == null) {
							s = new Singleton();;
						}
					}
						
				}
			lock.unlock();
			return s;
	}
	
	private Singleton() {
	}
}
