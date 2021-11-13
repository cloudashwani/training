package ducat.training.topic_interface;

public interface MathCalculation {
	static final int aa=10;
	int add(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	
	default  void test1() {
		System.out.println("MathCalculation.test1()");
	}
	
	static void staticMethod() {
		System.out.println("Math.staticMethod()");
	}

}
