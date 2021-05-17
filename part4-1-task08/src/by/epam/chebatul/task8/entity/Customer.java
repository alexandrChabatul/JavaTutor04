package by.epam.chebatul.task8.entity;

import java.math.BigInteger;

public class Customer {

	private String firstName;
	private String secondName;
	private String lastName;
	private String address;
	private BigInteger cardNum;
	private int bankAccount;

	public Customer(String firstName, String secondName, String lastName, String address, BigInteger cardNum,
			int bankAccount) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.cardNum = cardNum;
		this.bankAccount = bankAccount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getCardNum() {
		return cardNum;
	}

	public void setCardNum(BigInteger cardNum) {
		this.cardNum = cardNum;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccount;
		result = prime * result + ((cardNum == null) ? 0 : cardNum.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		if (cardNum == null) {
			if (other.cardNum != null)
				return false;
		} else if (!cardNum.equals(other.cardNum))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	public String toString() {
		return "Customer: " + lastName + " " + firstName + " " + secondName + ", " + address + ", " + cardNum + ", "
				+ bankAccount + ".";

	}

}
