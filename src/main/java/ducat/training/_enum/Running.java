package ducat.training._enum;

public class Running {
	public static void main(String[] args) {
		String s = new String("");
		Color r = Color.BLUE;
		System.out.println(r.getName());
		System.out.println(r.ordinal());
		System.out.println(Color.RED.getName());
		Color[] values = Color.values();
		for (Color color : values) {
			System.out.println(color.getName());
		}
	}
}
enum Color{
	RED("red"),
	GREEN("green"),
	BLUE("blue"),
	BLACK("black");
	
	String name;
	Color(String name){
		this.name= name;
	}
	public String getName() {
		return name;
	}
}