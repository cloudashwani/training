package ducat.training.threading;

public class RunnableTaskRunning {
	public static void main(String[] args) {
		Shared s = new Shared();
		Producer producer = new Producer(s);
		producer.setName("P1  ");
		Consumer consumer = new Consumer(s);
		consumer.setName("C1  ");
		Producer producer2 = new Producer(s);
		producer2.setName("PP1  ");
		Consumer consumer2 = new Consumer(s);
		consumer2.setName("CC1  ");
		producer.start();
		consumer.start();
		producer2.start();
		consumer2.start();
		producer.yield();
		System.out.println("RunnableTaskRunning.main()");
	}
}
