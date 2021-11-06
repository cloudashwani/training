package ducat.training;

public class University {
	
	final int ADMIN_FEE_MINI =100;
	int a;
	
	void update()
	{
		//adminFeeMini = 10000;
	}

	public University() {
		a=200;
		System.out.println("University.University()");
	}

	public University(final String name, String age) {
		System.out.println("University.University()...");
	}
	
	final void add() {
		/*
		 * final int a=10; final int b=20;
		 */
		System.out.println("University.add()");
	}
}
