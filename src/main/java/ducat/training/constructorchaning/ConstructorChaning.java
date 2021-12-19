package ducat.training.constructorchaning;

public class ConstructorChaning {
	public static void main(String[] args) {
		parent c =new child();
		c.add();
		
	}
}
class parent{
	final void add() {
		System.out.println("add");
	}
	void sub() {}
	
}
class child extends parent{
	final int max;
	
	child(){
		max=100;
	}
	child(int t){
		max=200;
	}
	
	
	void sub() {}
	void mul() {}
}

class System1{
	int age;
	String name;
	String s = new String();
	class Test1 extends parent{
		String name;
	}
	Test1 t = new Test1();
	
	parent p = new parent() {
		void sub() {
			add();
		}
	};
	parent p1 = new parent() {
		void sub() {
			add();
		}
	};
	
	
	void check() {
		int a=10;
		class Test2 extends parent {
			String name;
		}
		Test2 t = new Test2();
	}
	
	void check2() {
		int a=10;
		class Test2 extends parent {
			String name;
		}
		Test2 t = new Test2();
	}    
}