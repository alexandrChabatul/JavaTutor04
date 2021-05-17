package by.epam.chebatul.task2;

public class CarTester {

	public static void main(String[] args) {
		
		Car ford = new Car("Ford", "x20xe");
		
		System.out.println(ford.getModelOfCar());
		ford.fillTheCar(0.5);
		ford.startRide();
		ford.fillTheCar(5);
		ford.stopRide();
		ford.wheelBreake();
		ford.startRide();
		System.out.println(ford.checkWheels());
		ford.replaceBrokenWheel();
		System.out.println(ford.checkWheels());
		ford.startRide();

	}

}
