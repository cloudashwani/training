package ducat.training.topic_interface;

public class MathCalculationAdvance2 implements MathCommon{

	@Override
	public int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	@Override
	public int mul(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}
	
	@Override
	public int sub(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
	
	@Override
	public int div(int a, int b) {
		return a/b;
	}
	
	@Override
	public int mod(int a, int b) {
		return a%b;
	}
}
