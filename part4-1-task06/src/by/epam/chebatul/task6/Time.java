package by.epam.chebatul.task6;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		super();
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int second) {
		super();
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public void setMinute(int minute) {
		if (minute > 59 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public void setSecond(int second) {
		if (second > 59 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void changeHour(int change) {
		hour = (hour + change) % 24;
	}

	public void changeMinute(int change) {
		int temp = (minute + change) / 60;
		minute = (minute + change) % 60;
		changeHour(temp);
	}

	public void changeSecond(int change) {
		int temp = (second + change) / 60;
		second = (second + change) % 60;
		changeMinute(temp);
	}

	public void changeAllTime(int changeHour, int changeMinute, int changeSecond) {
		changeSecond(changeSecond);
		changeMinute(changeMinute);
		changeHour(changeHour);
	}

	public String getTime() {
		StringBuffer buffer = new StringBuffer();
		
		if (hour < 10) {
			buffer.append("0" + hour);
		} else {
			buffer.append("" + hour);
		}
		if (minute < 10) {
			buffer.append(":0" + minute);
		} else {
			buffer.append(":" + minute);
		}
		if (second < 10) {
			buffer.append(":0" + second);
		} else {
			buffer.append(":" + second);
		}
		return buffer.toString();
	}

}