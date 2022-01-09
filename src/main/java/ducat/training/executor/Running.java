package ducat.training.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Running {
	public static void main(String[] args) {
		// ExecutorService pool = Executors.newFixedThreadPool(5);
		// ExecutorService pool = Executors.newCachedThreadPool();
//		for (int i = 0; i < 10; i++) {
//			pool.submit(new Task());
//		}

//		ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
//		pool.schedule(new Task("Thread1"), 2,2, TimeUnit.SECONDS);
//		pool.scheduleAtFixedRate(new Task("Thread2"), 1,1, TimeUnit.SECONDS);

//		ExecutorService pool = Executors.newSingleThreadExecutor();
//		pool.submit(new Task("Thread1"));
//		pool.submit(new Task("Thread2"));
//		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		Future<Integer> submit1 = pool.submit(new TaskCallable("Thread1"));
		Future<Integer> submit2 = pool.submit(new TaskCallable("Thread2"));
		Future<Integer> submit3 = pool.submit(new TaskCallable("Thread3"));

		for (int i = 0; i < 10; i++) {
			System.out.println("welcome");
		}

		try {
			System.out.println(submit1.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

class Task implements Runnable {
	String name;

	Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " = " + i);
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class TaskCallable implements Callable<Integer> {
	String name;

	TaskCallable(String name) {
		this.name = name;
	}

	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " = " + i);
			sum = sum + i;
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sum;
	}

}