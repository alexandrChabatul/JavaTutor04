package by.epam.chebatul.task6;

public class TimeTester {

	public static void main(String[] args) {
		
		Time one = new Time();
		System.out.println(one.getTime());
		one.changeAllTime(10, 20, 50);
		System.out.println(one.getTime());
		one.changeSecond(5000);
		System.out.println(one.getTime());
		one.changeMinute(5000);
		System.out.println(one.getTime());
		
		Time two = new Time(25, 56, 128);
		System.out.println(two.getTime());
		

	}

}