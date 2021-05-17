package by.epam.chebatul.task8.view;

import java.util.ArrayList;
import java.util.List;

import by.epam.chebatul.task8.entity.Customer;
import by.epam.chebatul.task8.logic.StoreLogic;

public class CustomerView {

	public void print(Customer customer) {
		System.out.println(customer.toString());
	}

	public void print(List<Customer> customers) {
		for (Customer c : customers) {
			System.out.println(c.toString());
		}
	}

	public void printCustomersByAlphabet(List<Customer> customers) {
		List<Customer> temp = new ArrayList<>();
		StoreLogic logic = new StoreLogic();
		temp.addAll(customers);
		temp = logic.sortCustomers(temp);
		for (Customer c : temp) {
			System.out.println(c.toString());
		}
	}

}