package by.epam.chebatul.task1;

public class Test1 {
	
	
	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void printNum1() {
		System.out.println(num1);
	}
	
	public void printNum2() {
		System.out.println(num2);
	}
	
	public int sumOfNums() {
		return num1+num2;
	}
	
	public int findMaxOfNums() {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
