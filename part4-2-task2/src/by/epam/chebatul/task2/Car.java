package by.epam.chebatul.task2;

public class Car {

	private String modelOfCar;
	private Wheel[] wh = new Wheel[4];
	private Engine en;
	private double fuel_level = 0;
	private static final double MAX_LEVEL = 50;

	public Car(String modelOfCar, String modelOfEngine) {
		this.modelOfCar = modelOfCar;
		en = new Engine(modelOfEngine);
		for (int i = 0; i < 4; i++) {
			wh[i] = new Wheel();
		}
	}

	public String getModelOfCar() {
		return modelOfCar;
	}

	public void fillTheCar(double qounOfFuel) {
		if (fuel_level + qounOfFuel <= MAX_LEVEL) {
			fuel_level += qounOfFuel;
			System.out.println("Залили " + qounOfFuel + " литров.");
		} else {
			fuel_level = 50;
			System.out.println("Залили полный бак.");
		}
	}

	public boolean checkWheels() {
		boolean checkResult = false;
		for (Wheel w : wh) {
			if (w.isBreaking() == true) {
				checkResult = true;
			}
		}
		return checkResult;
	}

	public void replaceBrokenWheel() {
		for (int i = 0; i < wh.length; i++) {
			if (wh[i].isBreaking() == true) {
				wh[i] = new Wheel();
			}
		}
		System.out.println("Заменили колесо.");
	}

	public void startRide() {
		if (fuel_level > 1) {
			if (checkWheels() == false) {
				en.startEngine();
				for (Wheel w : wh) {
					w.startRide();
				}
				fuel_level -= 1;
				System.out.println("Поехали!");
			} else {
				System.out.println("Не поехала, пробито колесо.");
			}
		} else {
			System.out.println("Не поехала, нет топлива.");
		}
	}

	public void stopRide() {
		en.stopEngine();
		for (Wheel w : wh) {
			w.stopRide();
		}
	}

	public void wheelBreake() {
		wh[0].breakingWheel();
	}

}