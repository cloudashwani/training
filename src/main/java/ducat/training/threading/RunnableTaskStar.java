package ducat.training.threading;

public class RunnableTaskStar implements Runnable {
	Shared s ;
	public RunnableTaskStar(Shared s) {
		this.s=s;
	}

	public void run() {
		s.printStar();
	}
}