package ducat.training.topic_interface;

public interface MathCommon extends Math, MathCalculation {

	int mod(int a, int b);
	
	static void test() {
		
	}
	
	@Override
	default void test1() {
		MathCalculation.super.test1();
	}

}
