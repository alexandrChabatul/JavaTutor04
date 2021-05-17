package by.epam.chebatul.task3;

import java.util.Arrays;

public class Student {

	private String fullName;
	private String nameOfGroup;
	private int[] rating;

	public Student() {

	}

	public Student(String fullName, String nameOfGroup, int[] rating) {
		super();
		this.fullName = fullName;
		this.nameOfGroup = nameOfGroup;
		this.rating = rating;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNameOfGroup() {
		return nameOfGroup;
	}

	public void setNameOfGroup(String nameOfGroup) {
		this.nameOfGroup = nameOfGroup;
	}

	public int[] getRating() {
		return rating;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((nameOfGroup == null) ? 0 : nameOfGroup.hashCode());
		result = prime * result + Arrays.hashCode(rating);
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
		Student other = (Student) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (nameOfGroup == null) {
			if (other.nameOfGroup != null)
				return false;
		} else if (!nameOfGroup.equals(other.nameOfGroup))
			return false;
		if (!Arrays.equals(rating, other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return fullName + " / " + nameOfGroup + " / " + Arrays.toString(rating);
	}

}
