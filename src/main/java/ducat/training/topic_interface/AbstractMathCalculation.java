package ducat.training.topic_interface;

public abstract class AbstractMathCalculation {

	int a=10;
	AbstractMathCalculation(){
		System.out.println("AbstractMathCalculation.AbstractMathCalculation()");
	}
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract int mul(int a, int b);
	
	public void display() {
		System.out.println("AbstractMathCalculation.display()");
	}
}
