package ducat.training.genericclass;

public class Employee<B,T> {

	B age;
	T address;
	

	public Employee(B name, T address) {
		this.age = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
