package ducat.training;

public class Running {
	static int a;
	static int b;
	public static void main(String[] args) {
		Employee1 obj = new Employee1("guest","22");
		obj.getDetails();	
		Employee1 obj1 = new Employee1("guest","22");
		obj1.getDetails();

//		Employee1 obj = new Employee1();
//		System.out.println(obj.getDetails());
//		obj.name ="guest22";
//		obj.age=22;
//		obj.salary=22000;
//		obj.companyName="Ducat Training";
//		System.out.println(obj.getDetails());
//		Employee1 obj1 =new Employee1();
//		obj1.name ="guest21";
//		obj1.age=21;
//		obj1.salary=21000;
//		//System.out.printf("name=%s age=%d salary=%d",obj1.name, obj1.age, obj1.salary);
//		System.out.println(obj1.getDetails());
//		
//		Employee1 obj2 = new Employee1();
//		System.out.println(Employee1.count);
//		System.out.println(Employee1.add(2, 3));
		
	}
	
}
class System1{
	static PrintStream out = new PrintStream();
}
class PrintStream {
	public void println(String s) {}
}