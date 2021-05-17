package by.epam.chebatul.task7.helper;

public class TriangleException extends Exception {
	
	/**
	 * TriangleException first version.
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public TriangleException(String message) {
		this.message = message;
		System.out.println(message);
	}

	public String toString() {
		return "TriangleException [message=" + message + "]";
	}
	
	

}
