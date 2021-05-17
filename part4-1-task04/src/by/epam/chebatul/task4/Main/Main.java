package by.epam.chebatul.task4.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import by.epam.chebatul.task4.entity.Depo;
import by.epam.chebatul.task4.entity.Train;
import by.epam.chebatul.task4.logic.TrainLogic;
import by.epam.chebatul.task4.view.TrainView;

public class Main {
	
	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");

	public static void main(String[] args) throws ParseException {
		
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		
		depo.addTrain(new Train("Minsk", 654, df.parse("01:50")));
		depo.addTrain(new Train("Grodno", 254, df.parse("11:52")));
		depo.addTrain(new Train("Minsk", 628, df.parse("03:50")));
		depo.addTrain(new Train("Vitebsk", 358, df.parse("12:58")));
		depo.addTrain(new Train("Mogilev", 256, df.parse("23:50")));
		
		Train search = logic.findByNumber(depo.getTrains(), 254);
		view.printAfterSearch(search, "Поезд найден -");
		
		System.out.println();
		System.out.println("После сортировки по номеру:");
		view.print(logic.sortByNumber(depo.getTrains()));
		
		System.out.println();
		System.out.println("После сортировки по станции:");
		view.print(logic.sortByStation(depo.getTrains()));

	}

}
