package by.epam.chebatul.task5;

public class Counter {

	private int minValue;
	private int maxValue;
	private int currentValue;

	public Counter() {
		minValue = 0;
		maxValue = 50;
		currentValue = 25;
	}

	public Counter(int minValue, int maxValue, int currentValue) {
		super();
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.currentValue = currentValue;
	}

	public void counterUp() {
		if (currentValue >= maxValue) {
			System.out.println("Достигнут верхний лимит.");
		} else {
			currentValue++;
		}
	}

	public void counterDown() {
		if (currentValue <= minValue) {
			System.out.println("Достигнут нижний лимит.");
		} else {
			currentValue--;
		}
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void printCurrentCount() {
		System.out.println("Текущее значение счетчика - " + currentValue);
	}

}
