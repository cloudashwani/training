package ducat.training.string;

public class EmployeeImmutable {
	private String name;
	private int age;
	private int salary;
	
	public EmployeeImmutable(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	 
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		EmployeeImmutable temp = (EmployeeImmutable) obj;
		return this.name.equals(temp.name);
	}
}
