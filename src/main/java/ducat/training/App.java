package ducat.training;

public class App {

	public final static void main(String[] args) {
		
		Application app = new Application(10);
		String applicationFeature1 = app.getApplicationFeature1();
		String applicationName = app.getApplicationName();
		
		System.out.println(applicationFeature1);
		System.out.println(applicationName);
	}
}