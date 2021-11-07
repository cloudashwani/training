package ducat.training.topic_interface;

public class Main {
	
	public static void main(String[] args) {
		MathCalculation obj = new MathCalculationAdvance();
		int add  = obj.add(2, 3);
		int sub  = obj.sub(2, 3);
		int mul  = obj.mul(2, 3);
		
		System.out.println("=============");
		MathCalculation obj2 = new MathCalculationAdvance2();
		add  = obj2.add(2, 3);
		sub  = obj2.sub(2, 3);
		mul  = obj2.mul(2, 3);
		
//		MathCalculation obj3 = null;
//		obj3.add(2, 3);
//		obj3.sub(2, 3);
//		obj3.mul(2, 3);
		
		
	}

}
