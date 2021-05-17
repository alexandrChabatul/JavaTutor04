package by.epam.chebatul.task10.logic;

import java.util.Date;
import java.util.List;

import by.epam.chebatul.task10.entity.Airline;
import by.epam.chebatul.task10.view.AirlineView;

public class AirlineLogic {

	public void findBydestination(List<Airline> airlines, String dest) {
		boolean isFind = false;
		AirlineView view = new AirlineView();

		for (Airline a : airlines) {
			if (a.getDestination().toLowerCase().equals(dest.toLowerCase())) {
				view.print(a);
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

	public void findByDayOfWeek(List<Airline> airlines, String day) {
		boolean isFind = false;
		AirlineView view = new AirlineView();

		for (Airline a : airlines) {
			for (String tmp : a.getDays()) {
				if (tmp.toLowerCase().equals(day.toLowerCase())) {
					view.print(a);
					isFind = true;
				}
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

	public void findByDayOfWeekAndTime(List<Airline> airlines, String day, Date time) {
		boolean isFind = false;
		AirlineView view = new AirlineView();

		for (Airline a : airlines) {
			for (String tmp : a.getDays()) {
				if (tmp.toLowerCase().equals(day.toLowerCase())) {
					if (time.compareTo(a.getTime()) >= 0) {
						view.print(a);
						isFind = true;
					}
				}
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

}
