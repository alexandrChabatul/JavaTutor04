package by.epam.chebatul.task5;

public class CounterTester {

	public static void main(String[] args) {
		
		Counter one = new Counter();
		System.out.println("Значение счетчика по умолчаюнию - " + one.getCurrentValue());
		one.counterDown();
		one.printCurrentCount();
		one.counterUp();
		one.counterUp();
		one.printCurrentCount();
		System.out.println();
		
		Counter two = new Counter(10, 20, 19);
		two.printCurrentCount();
		two.counterUp();
		two.printCurrentCount();
		two.counterUp();
		two.printCurrentCount();
		System.out.println();
		
		Counter three = new Counter(10, 20, 11);
		three.printCurrentCount();
		three.counterDown();
		three.printCurrentCount();
		three.counterDown();
		three.printCurrentCount();

	}

}
