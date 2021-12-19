package ducat.training.big;

import java.math.BigInteger;

public class BigDecimalExample {
	public static void main(String[] args) {
		BigInteger bd1 = new BigInteger("1231231231223123123123123");
		BigInteger bd2 = new BigInteger("1231231231223123123123123");
		BigInteger add = bd1.add(bd2);
		System.out.println(add);
		
	}
}
