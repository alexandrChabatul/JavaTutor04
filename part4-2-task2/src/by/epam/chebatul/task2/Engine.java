package by.epam.chebatul.task2;

public class Engine {

	private final String model;
	private boolean status;
	
	public Engine(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void startEngine() {
		status = true;		
	}
	
	public void stopEngine() {
		status = false;		
	}
	
}
