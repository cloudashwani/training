package ducat.training;

public class App {

	public final static void main(String[] args) {
//		UniversityAdv e = new UniversityAdv();
//		System.out.println(e.toString());
//		System.out.println(e);
		
		Employee emp = new Employee();
		System.out.println("======");
		System.out.println(emp);
		
		Employee emp1 = new Employee();
		emp1.age=44;
		emp1.name="Jawed";
		System.out.println("======");
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		emp2.age=44;
		emp2.name="Jawed";
		System.out.println("======");
		System.out.println(emp2);
		
		System.out.println("===compare===");
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		Application obj = new Application(12);
		obj.setAge(15);
	}
}