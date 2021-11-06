package ducat.training;

public abstract class BaseApplication {
	
	public abstract String getApplicationName();
	
	public String getApplicationFeature1(){
		return getApplicationName() + "feature1";
	}
}
