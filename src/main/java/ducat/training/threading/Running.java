package ducat.training.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class Running {
	public static void main(String[] args) {
		MyShared s = new MyShared();
		for (int i = 0; i < 5000; i++) {
			new MyThread(s);
		}
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count="+s.count);
	}
}

class MyShared {
	volatile long count=0;
	//AtomicInteger count =  new AtomicInteger();
}

class MyThread extends Thread {
	MyShared s;
	MyThread(MyShared s){
		this.s =s ;
		start();
	}
	public void run() {
		System.out.println("..."+s.count++);
	}
}




