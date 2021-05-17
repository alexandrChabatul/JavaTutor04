package by.epam.chebatul.task9.logic;

import java.util.List;
import by.epam.chebatul.task9.entity.Book;
import by.epam.chebatul.task9.view.BookView;

public class BookLogic {
	
	public void findBookByAuthor(List<Book> books, String author) {
		System.out.println(author + " : ");
		BookView view = new BookView();
		boolean isFind = false;
		
		for (Book b : books) {
			if (b.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				view.print(b);
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

	public void findBookByPublisher(List<Book> books, String publisher) {
		System.out.println(publisher + " : ");
		BookView view = new BookView();
		boolean isFind = false;
		
		for (Book b : books) {
			if (publisher.toLowerCase().equals(b.getPublisher().toLowerCase())) {
				view.print(b);
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

	public void findBooksAfterDate(List<Book> books, short year) {
		System.out.println("Before " + year + ":");
		boolean isFind = false;
		BookView view = new BookView();
		
		for (Book b : books) {
			if (b.getYear() <= year) {
				view.print(b);
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("Not found.");
		}
	}

}
