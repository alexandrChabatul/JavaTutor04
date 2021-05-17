package by.epam.chebatul.task4.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.chebatul.task4.entity.Train;

public class TrainLogic {
	
	public List<Train> sortByNumber(List<Train> trains) {
		List<Train> sortedList = new ArrayList<>();
		sortedList.addAll(trains);
		Collections.sort(sortedList, new NumberComparator());
		return sortedList;
	}
	
	public List<Train> sortByStation(List<Train> trains) {
		List<Train> sortedList = new ArrayList<>();
		sortedList.addAll(trains);
		Collections.sort(sortedList, new StationComparator().thenComparing(new TimeComparator()));
		return sortedList;
	}
	
	public Train findByNumber(List<Train> trains, int trainNum) {
		Train tempTrain = null;
		for (Train train : trains) {
			if (trainNum == train.getTrainNum()) {
				return train;
			}
		}
		return tempTrain;
	}
	
	static class NumberComparator implements Comparator<Train> {
		@Override
		public int compare(Train o1, Train o2) {
			return o1.getTrainNum() - o2.getTrainNum();
		}
	}
	
	static class StationComparator implements Comparator<Train> {
		@Override
		public int compare(Train o1, Train o2) {
			return o1.getStantion().compareTo(o2.getStantion());
		}
	}
	
	static class TimeComparator implements Comparator<Train> {
		@Override
		public int compare(Train o1, Train o2) {
			return o1.getTime().compareTo(o2.getTime());
		}
	}

}



