package by.epam.chebatul.task4.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

	private String stantion;
	private int trainNum;
	private Date time;
	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");

	public Train(String stantion, int trainNum, Date time) {
		super();
		this.stantion = stantion;
		this.trainNum = trainNum;
		this.time = time;
	}

	public String getStantion() {
		return stantion;
	}

	public void setStantion(String stantion) {
		this.stantion = stantion;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stantion == null) ? 0 : stantion.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + trainNum;
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
		Train other = (Train) obj;
		if (stantion == null) {
			if (other.stantion != null)
				return false;
		} else if (!stantion.equals(other.stantion))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (trainNum != other.trainNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [Stantion=" + stantion + ", TrainNum=" + trainNum + ", Time=" + df.format(time) + "]";
	}
	
}
