package by.epam.chebatul.task10.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import by.epam.chebatul.task10.entity.Airline;
import by.epam.chebatul.task10.entity.Airport;
import by.epam.chebatul.task10.logic.AirlineLogic;
import by.epam.chebatul.task10.view.AirlineView;



public class Main {
	
	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");
	
	public static void main(String[] args) throws ParseException {
        Airport a = new Airport();
		
	    Airline b = new Airline("Minsk", "428", "boeing", df.parse("16:48"), new String[] {"monday"});
		a.addAirline(b);
		Airline c = new Airline("Moskow", "582", "airbus", df.parse("11:48"), new String[] {"sunday"});
		a.addAirline(c);
		Airline d = new Airline("Warshawa", "102", "boeing", df.parse("21:48"), new String[] {"sunday"});
		a.addAirline(d);
		
		
		AirlineLogic logic = new AirlineLogic();
		AirlineView view  = new AirlineView();
		System.out.println("START TEST - START POSITION");
		view.print(a.getAirlines());
		System.out.println();
		
		System.out.println("FIND BY DESTINATION");
		logic.findBydestination(a.getAirlines(), "MINSK");
		logic.findBydestination(a.getAirlines(), "MINsdsSK");
		System.out.println();
		
		System.out.println("FIND BY DAY");
		logic.findByDayOfWeek(a.getAirlines(), "monday");
		logic.findByDayOfWeek(a.getAirlines(), "wednesday");
		System.out.println();
		
		System.out.println("FIND BY DAY AND MAXTIME");
		logic.findByDayOfWeekAndTime(a.getAirlines(), "sunday", df.parse("20:00"));
		System.out.println();
		logic.findByDayOfWeekAndTime(a.getAirlines(), "sunday", df.parse("22:00"));
		
	}

}
