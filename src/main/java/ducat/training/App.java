package ducat.training;

public class App {

	public final static void main(String[] args) {
		CarFactory model1  = CarFactory.CarModel1;
		System.out.println(model1.getDetails());
		AdvanceCarFactory carmodel1 = AdvanceCarFactory.CARMODEL3;
		System.out.println(carmodel1.getDetails());
		System.out.println(carmodel1.name());
		System.out.println(carmodel1.ordinal());
		
		AdvanceCarFactory m = Enum.valueOf(AdvanceCarFactory.class, "CARMODEL3");
		System.out.println(m);
		
		Calculation1 cal = new Calculation1();
		cal.add(1,2,3,4);
		
	}
}

