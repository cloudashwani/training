package ducat.training.threading;

import java.util.concurrent.TimeUnit;

public class Producer extends Thread {
	Shared s;
	Producer(Shared s){
		this.s =s;
	}
	@Override
	public void run() {
		while(true) {
			s.produce();
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
