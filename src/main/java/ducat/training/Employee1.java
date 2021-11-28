package ducat.training;

public class Employee1 {
	
	String name;
	String age;
	static String companyName;
	
	static
	{
		System.out.println("Employee1. static init() top");
	}
	
	
	{
		name="guest";
		age ="18";
		System.out.println("Employee1. init() - top");
	}
	
	Employee1(String name,String age){
		this.name=name;
		this.age=age;
		System.out.println("Employee1.Employee1()- constructor");
	}
	 
	void getDetails()
	{
		System.out.println(name+age+companyName);
	}
	
	static
	{
		companyName ="Ducat";
		System.out.println("Employee1. static init() - bottom");
	}
	
	{
		name="guest";
		age ="18";
		System.out.println("Employee1. init()-  bottom");
	}
	
}
