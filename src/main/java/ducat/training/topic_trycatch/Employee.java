package ducat.training.topic_trycatch;

public class Employee {

	Employee(){
		System.out.println("emp - constructor");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("emp - destructor");
	}

}
