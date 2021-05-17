package by.epam.chebatul.task8.main;

import java.math.BigInteger;

import by.epam.chebatul.task8.entity.Customer;
import by.epam.chebatul.task8.entity.Store;
import by.epam.chebatul.task8.logic.StoreLogic;
import by.epam.chebatul.task8.view.CustomerView;

public class Main {

	public static void main(String[] args) {

		Customer c1 = new Customer("Alex", "Dmirtievich", "Molka", "minsk", new BigInteger("2134564321345"), 1234567);
		Customer c2 = new Customer("Igor", "Olegovich", "Lok", "grodno", new BigInteger("2134599321345"), 1234567);
		Customer c3 = new Customer("Andrey", "Dmirtievich", "Molka", "vitebsk", new BigInteger("4134564321345"),
				1234567);
		Customer c4 = new Customer("Lesha", "Dmirtievich", "Horosh", "brest", new BigInteger("9134564321345"), 1234567);
		Customer c5 = new Customer("Alex", "Dmirtievich", "Kola", "mogilev", new BigInteger("1134564321345"), 1234567);

		Store store = new Store();
		store.addCustomer(c1);
		store.addCustomer(c2);
		store.addCustomer(c3);
		store.addCustomer(c4);
		store.addCustomer(c5);

		StoreLogic logic = new StoreLogic();
		CustomerView view = new CustomerView();
		System.out.println("PRINT TEST");
		view.printCustomersByAlphabet(store.getCustomers());
		System.out.println();

		System.out.println("SEARCH TEST");
		logic.findCustomerByCredicCard(store.getCustomers(), new BigInteger("2134599321345"),
				new BigInteger("9134564321345"));

	}

}
