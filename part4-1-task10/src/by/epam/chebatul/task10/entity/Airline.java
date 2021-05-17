package by.epam.chebatul.task10.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Airline {

	private String destination;
	private String flightNumber;
	private String airplaneType;
	private Date time;
	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");
	private String[] days;

	public Airline(String destination, String flightNumber, String airplaneType, Date time, String[] days)
			throws ParseException {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.time = time;
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + Arrays.hashCode(days);
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (!Arrays.equals(days, other.days))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", time=" + df.format(time) + ", days=" + Arrays.toString(days) + "]";
	}

}
