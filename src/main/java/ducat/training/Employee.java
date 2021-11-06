package ducat.training;

public class Employee {
	
	 static String name;
	 int age=100;
	 int count;
	
	public Employee() {
		this("ash",22);
		System.out.println("Employee.Employee()-default");
		
	}

	public Employee(String name1, int age1, int count1) {
		name = name1;
		age = age1;
		count = count1;
		System.out.println("Employee.Employee()=3 arg");
	}
	
	public Employee(String name1, int age1) {
		this(name1,age1,200);
		name = name1;
		age = age1;
		System.out.println("Employee.Employee()=2 arg");
	}
	
	
	static void add(){
		name ="welcome";
	}
	
	void sub() {
		this.name ="welcome";
		this.add();
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", count=" + count + "]";
	}
	
	/*
	 * @Override public String toString() {
	 * 
	 * return "[name="+this.name+", age= "+this.age+"]"; }
	 */
	
	@Override
	public boolean equals(Object obj) {
		Employee e =(Employee)obj;
		 
	return (this.age == e.age && this.name == e.name);
	}

}
