package by.epam.chebatul.task2;

public class Wheel {

	private boolean breake = false;  //�����
	private boolean isTurn = false;
	
	public void breakingWheel() {
		breake = true;
	}
	
	public boolean isBreaking() {
		return breake;
	}
	
	public void startRide() {
		isTurn = true;
	}
	
	public void stopRide() {
		isTurn = false;
	}
	
	public boolean getIsTurn () {
		return isTurn;
	}

}
