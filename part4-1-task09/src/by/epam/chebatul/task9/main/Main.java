package by.epam.chebatul.task9.main;

import by.epam.chebatul.task9.entity.Book;
import by.epam.chebatul.task9.entity.BookStore;
import by.epam.chebatul.task9.logic.BookLogic;
import by.epam.chebatul.task9.view.BookView;

public class Main {

	public static void main(String[] args) {
		
		Book a1 = new Book("Kupala", "BelKniga", (short) 1985, (short) 852, 16, "hard");
		Book a2 = new Book("Kolas", "Rosfond", (short) 2020, (short) 852, 16, "hard");
		Book a3 = new Book("Karatkevich", "BelKniga", (short) 2015, (short) 852, 16, "hard");
		Book a4 = new Book("Kupala", "Grodno", (short) 2010, (short) 852, 16, "hard");
		Book a5 = new Book("Bikov", "BelKniga", (short) 2011, (short) 852, 16, "hard");
		
		BookStore store = new BookStore();
		store.addBook(a1);
		store.addBook(a2);
		store.addBook(a3);
		store.addBook(a4);
		store.addBook(a5);
		
		BookLogic logic = new BookLogic();
		BookView view  = new BookView();
		
		System.out.println("START POSITION");
		view.print(store.getBooks());
		System.out.println();
		
		System.out.println("TEST SEARCH BY AUTHOR");
		logic.findBookByAuthor(store.getBooks(), "kupala");
		System.out.println();
		
		System.out.println("TEST SEARCH BY PUBLISHER");
		logic.findBookByPublisher(store.getBooks(), "belkniga");
		System.out.println();
		
		System.out.println("TEST SEARCH BY YEAR");
		logic.findBooksAfterDate(store.getBooks(), (short)2010);
		System.out.println("END OF TESTS");

	}

}
