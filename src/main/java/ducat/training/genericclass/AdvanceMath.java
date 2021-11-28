package ducat.training.genericclass;

public class AdvanceMath {

	public static<T extends Number> void add(T a, T b) {
		int intValue = a.intValue();
		int intValue2 = b.intValue();
		System.out.println(intValue + intValue2);
	}
}
