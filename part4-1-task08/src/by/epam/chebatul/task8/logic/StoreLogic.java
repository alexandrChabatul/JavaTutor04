package by.epam.chebatul.task8.logic;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.chebatul.task8.entity.Customer;
import by.epam.chebatul.task8.view.CustomerView;

public class StoreLogic {

	public List<Customer> sortCustomers(List<Customer> temp) {
		Collections.sort(temp, new CompareByName());
		return temp;
	}

	public void findCustomerByCredicCard(List<Customer> customers, BigInteger minvalue, BigInteger maxvalue) {
		CustomerView view = new CustomerView();
		boolean result = false;
		for (Customer c : customers) {
			if (c.getCardNum().compareTo(minvalue) >= 0 && c.getCardNum().compareTo(maxvalue) <= 0) {
				view.print(c);
				result = true;
			}
		}
		if (!result) {
			System.out.println("Not found.");
		}
	}

	static class CompareByName implements Comparator<Customer> {
		public int compare(Customer c1, Customer c2) {
			if (c1.getLastName().toLowerCase().compareTo(c2.getLastName().toLowerCase()) == 0) {
				if (c1.getFirstName().toLowerCase().compareTo(c2.getFirstName().toLowerCase()) == 0) {
					return (c1.getSecondName().toLowerCase().compareTo(c2.getSecondName().toLowerCase()));
				} else {
					return c1.getFirstName().toLowerCase().compareTo(c2.getFirstName().toLowerCase());
				}
			} else {
				return c1.getLastName().toLowerCase().compareTo(c2.getLastName().toLowerCase());
			}
		}
	}

}