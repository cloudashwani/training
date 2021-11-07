package ducat.training.topic_interface;

public class MathCalculationAdvance extends AbstractMathCalculation implements MathCalculation{

	MathCalculationAdvance(){
		System.out.println("MathCalculationAdvance.MathCalculationAdvance()");
	}
	@Override
	public int add(int a, int b) {
		this.a++;
		return a+b;
	}
	
	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
	@Override
	public int sub(int a, int b) {
		return a-b;
	}
}
