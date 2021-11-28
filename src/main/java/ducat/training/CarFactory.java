package ducat.training;

public class CarFactory {
	private String model;
	private int limit;
	private CarFactory(String model, int limit){
		this.model =  model;
		this.limit = limit;
	}
	public static CarFactory CarModel1 = new CarFactory("model1",12);
	public static CarFactory CarModel2 = new CarFactory("model2",12);
	public static CarFactory CarModel3 = new CarFactory("model3",12);
	public static CarFactory CarModel4 = new CarFactory("model4",12);
	
	public String getDetails() {
		return this.model + " - " + this.limit;
	}
}
