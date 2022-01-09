package ducat.training.string;

public class Running {
	public static void main(String[] args) {
		EmployeeImmutable obj = new EmployeeImmutable("emp",22,22000);
		EmployeeImmutable obj1 = new EmployeeImmutable("emp",22,22000);
		System.out.println(obj== obj1);
		System.out.println(obj.equals(obj1));
		
		String s =new String("this, is, ducat");
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
		System.out.println("====================");
		String ss1 =new String("abc");
		String ss2 =new String("abc");
		System.out.println(ss1 == ss2); // false
		System.out.println(ss1.equals(ss2)); // true
		
		String sss1 ="abc";
		String sss2 ="abc";
		System.out.println(sss1 == sss2); // true
		System.out.println(sss1.equals(sss2)); // true
		
		System.out.println(ss1.intern() == ss2.intern()); // true
		System.out.println(ss1.intern() == sss1); // true
		
		String[] split = s.split(",");
		for (String string : split) {
			System.out.println(string);
		}
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}
		
	}
}
