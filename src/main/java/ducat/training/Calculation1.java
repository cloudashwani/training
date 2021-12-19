package ducat.training;

public class Calculation1 extends Calculation {
	public Calculation1() {
	System.out.println("Calculation1.Calculation1()");
	}
	int a=200;
	 void add(int a, int b) {
		System.out.println("Add=" + (a+b));
	}
@Deprecated
	void add(int a, int b,int c, int d) {
		System.out.println("Add=" + (a+b+c+d));
	}
}
