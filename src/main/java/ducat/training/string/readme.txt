Immutable -> once the object is create , you cann't modify the members state

Employee e = new Employee("name",23,23000);
e.getName();
e.getSalary();
e.name = "guest";  - not possible
e.setName("guest"); - not possible

- two object cannot be equals using == operator
to check the equality , always override the equls method of object class
@Override
	public boolean equals(Object obj) {
		EmployeeImmutable temp = (EmployeeImmutable) obj;
		return this.name.equals(temp.name);
	}

- String pool  memory management - 
