package ducat.training.string;

public class Running {
	public static void main(String[] args) {
		EmployeeImmutable obj = new EmployeeImmutable("emp",22,22000);
		EmployeeImmutable obj1 = new EmployeeImmutable("emp1",22,22000);
		System.out.println(obj.equals(obj1));
		
		String s =new String("this is ducat");
		System.out.println(s);
		String s1 = s.replace("is","IS");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.charAt(0));
		System.out.println(s.concat(" india"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("is1"));
		System.out.println(s.lastIndexOf("is"));
		
		String ss1 =new String("this");
		String ss2 =new String("this");
		
		System.out.println(ss1.equals(ss2));
	}
}
