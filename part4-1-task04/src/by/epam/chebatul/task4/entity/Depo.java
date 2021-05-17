package by.epam.chebatul.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {
	
	private List<Train> trains = new ArrayList<>();
	
	public Depo() {
	}

	public Depo(List<Train> trains) {
		super();
		this.trains = trains;
	}
	
	public void addTrain(Train train) {
		trains.add(train);
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
