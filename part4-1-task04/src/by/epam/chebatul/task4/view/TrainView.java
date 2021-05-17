package by.epam.chebatul.task4.view;

import java.util.List;
import by.epam.chebatul.task4.entity.Train;

public class TrainView {
	
	public void printAfterSearch(Train train, String message) {
		if (train != null) {
			System.out.println(message + " " + train.toString());
		} else {
			System.out.println("Not found.");
		}
		
	}
	
	public void print(List<Train> trains) {
		for (Train train : trains) {
			System.out.println(train.toString());
		}
	}

}
