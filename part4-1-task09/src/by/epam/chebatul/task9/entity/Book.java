package by.epam.chebatul.task9.entity;

public class Book {
	
	private String author;
	private String publisher;
	private short year;
	private short numOfPage;
	private double price;
	private String cover;
	
	
	public Book(String author, String publisher, short year, short numOfPage, double price, String cover) {
		super();
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.numOfPage = numOfPage;
		this.price = price;
		this.cover = cover;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		if (year>2021) {
			year = 2021;
		}
		this.year = year;
	}
	public short getNumOfPage() {
		return numOfPage;
	}
	public void setNumOfPage(short numOfPage) {
		this.numOfPage = numOfPage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + numOfPage;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (numOfPage != other.numOfPage)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book: author=" + author + ", publisher=" + publisher + ", year=" + year + ", numOfPage=" + numOfPage
				+ ", price=" + price + ", cover=" + cover;
	}
	
}
