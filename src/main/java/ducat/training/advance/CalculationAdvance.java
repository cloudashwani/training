package ducat.training.advance;

import ducat.training.Test;
import ducat.training.Test1;

public class CalculationAdvance extends Test{
	public void test() {
		Test1 t1 = new Test1();
		t1.checkProtected();
		t1.checkPublic();
		//t1.checkPrivate();
		t1.checkDefault();
		
	}
}
