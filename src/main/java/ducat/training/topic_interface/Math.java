package ducat.training.topic_interface;

@FunctionalInterface
public interface Math {
	
	int div(int a, int b);
	
	default  void test1() {
		System.out.println("Math.test1()");
	}
	
	static void staticMethod() {
		System.out.println("Math.staticMethod()");
	}
}
