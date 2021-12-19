package ducat.training.threading;

import java.util.concurrent.TimeUnit;

public class Consumer extends Thread {
	Shared s;
	Consumer(Shared s){
		this.s =s;
	}
	@Override
	public void run() {
		while(true) {
			s.consume();
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
