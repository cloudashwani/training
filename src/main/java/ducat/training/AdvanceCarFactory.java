package ducat.training;

public enum AdvanceCarFactory  {
	CARMODEL1("model1",12),
	CARMODEL2("model2",12),
	CARMODEL3("model3",12),
	CARMODEL4("model4",12);
	
	private String model;
	private int limit;
	private AdvanceCarFactory(String model, int limit){
		this.model =  model;
		this.limit = limit;
	}
	
	public String getDetails() {
		return this.model + " - " + this.limit;
	}
}
