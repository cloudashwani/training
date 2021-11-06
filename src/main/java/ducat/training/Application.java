package ducat.training;

public class Application extends BaseApplication {
	int age;
	
	Application(int a){
		age = a;
	}
	
	void setAge(int a){
		age =a;
	}
	
	@Override
	public String getApplicationName() {
		return "DucatApplication";
	}
}
