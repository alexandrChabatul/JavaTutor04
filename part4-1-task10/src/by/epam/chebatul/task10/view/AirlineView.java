package by.epam.chebatul.task10.view;

import java.util.List;
import by.epam.chebatul.task10.entity.Airline;

public class AirlineView {
	
	public void print(Airline airline) {
		System.out.println(airline.toString());
	}
	
	public void print (List<Airline> airlines) {
		for (Airline a : airlines) {
			System.out.println(a.toString());
		}
	}

}
