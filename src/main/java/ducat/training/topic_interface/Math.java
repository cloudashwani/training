package ducat.training.topic_interface;

public interface Math {
	
	int div(int a, int b);
	int add(int a, int b);
	
	default  void test1() {
		System.out.println("Math.test1()");
	}
}
