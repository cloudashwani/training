package ducat.training.topic_trycatch;

public class Running {
	public static void main(String[] args) {
//		int age =10;
//		if(age < 18) {
//			throw new AgeException("age is less than 18");
//		}
//		System.out.println(age);
//		
//		
//		checkUnCheckedException(10);
//		
//		try {
//			check(10_000);
//		} catch (SalaryException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		e = e1;
		System.out.println("end");
		Runtime.getRuntime().gc();
		
	}


	static class AgeException extends RuntimeException{
		AgeException(String str){
			super(str);
		}
	}
	
	static class SalaryException extends Exception{
		SalaryException(String str){
			super(str);
		}
	}
	
	static void check(int salary) throws SalaryException {
		if(salary < 11000) {
			throw new SalaryException("salary is less than 11000");
		}
	}
	
	static void checkUnCheckedException(int age) throws AgeException {
		if(age < 18) {
			throw new AgeException("age is less than 18");
		}
	}

}


class parent{
	void check() throws Exception{
		
	}
}
class child extends parent{
	public void check() throws NullPointerException{
		
	}
}