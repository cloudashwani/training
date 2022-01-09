package ducat.training.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunningCountDownLatch {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		CountDownLatch latch = new CountDownLatch(5);
		for(int i=0;i<5;i++) {
			pool.submit(new MyTask(latch));
		}
		System.out.println("all task submitted");
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("process init complete");
		pool.shutdown();
	}
}

class MyTask implements Runnable {
	
	private CountDownLatch latch;

	public MyTask(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
	
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + i + "=" +latch.getCount());
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			latch.countDown();
			System.out.println(Thread.currentThread().getName() +"end"+i);
		}
	}
}
