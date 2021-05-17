package by.epam.chebatul.task9.view;

import java.util.List;

import by.epam.chebatul.task9.entity.Book;

public class BookView {
	
	public void print (Book book) {
		System.out.println(book.toString());
	}
	
	public void print (List<Book> bookList) {
		for (Book b : bookList) {
			System.out.println(b.toString());
		}
	}

}
