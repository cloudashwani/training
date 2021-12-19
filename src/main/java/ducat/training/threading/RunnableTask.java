package ducat.training.threading;

public class RunnableTask implements Runnable {
	Shared s ;
	public RunnableTask(Shared s) {
		this.s=s;
	}

	public void run() {
		s.print();
	}
}