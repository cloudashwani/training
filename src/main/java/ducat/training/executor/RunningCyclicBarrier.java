package ducat.training.executor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunningCyclicBarrier {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		CyclicBarrier cyc = new CyclicBarrier(5);
		for(int i=0;i<5;i++) {
			pool.submit(new MyTask1(cyc));
		}
		System.out.println("all task submitted");
		System.out.println("process init complete");
		//pool.shutdown();
	}
}

class MyTask1 implements Runnable {
	
	private CyclicBarrier cyclic;

	public MyTask1(CyclicBarrier latch) {
		this.cyclic = cyclic;
	}

	@Override
	public void run() {
	
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + i );
			try {
				
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				cyclic.await();
				System.out.println(Thread.currentThread().getName() +"waiting" +  cyclic.getNumberWaiting());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +"end"+i);
		}
	}
}
