package ducat.training.topic_interface;

public class DefaitMethodOverride implements Math, MathCalculation {

	@Override
	public int add(int a, int b) {
		super.toString();
		test1();
		Math.staticMethod();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		MathCalculation.super.test1();
	}

}
