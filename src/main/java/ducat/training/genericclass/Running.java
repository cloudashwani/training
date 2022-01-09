package ducat.training.genericclass;

public class Running {
	public static void main(String... args) {
		int sum[] = {10,20,30,40,50};
		System.out.println(Test1.add("sum of values", 10,20,30,40,50));
		int a=10;
		float f =10.98f;
		System.out.printf("A= %d B=%f",a,f);
//		Test.add(2, 3);
//		System.out.println(Test.sum(2,3));
//		System.out.println(Test.sum(2.3,4.3));
//		
//		Test<Integer> t = new Test();
//		t.a=100;
//		t.b=200;
//		t.adding();
//		
//		Test<Float> t1 = new Test();
//		t1.a=100.3f;
//		t1.b=200.3f;
//		t1.adding();
	}
}
class Test1 {
	public static int add(String msg, int... arr) {
		System.out.println(msg);
		int sum =0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	

}
class Test<P>{
	P a;
	P b;
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(float a, float b) {
		System.out.println(a+b);
	}
	
	public static <T extends Number> Integer sum(T a, T b) {
		return new Integer(a.intValue() + b.intValue());
	}
	
	public void adding() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
}

