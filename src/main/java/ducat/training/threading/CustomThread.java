package ducat.training.threading;

public class CustomThread extends Thread{
	CustomThread(String name){
		setName(name);
	}
	public void run() {
		for (int i = 0; i < 2; i++) {
			
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+"-"+currentThread.getState()+"-" +i);
		}
	}
}
