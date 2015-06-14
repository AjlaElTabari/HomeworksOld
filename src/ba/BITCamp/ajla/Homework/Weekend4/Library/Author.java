package ba.BITCamp.ajla.Homework.Weekend4.Library;

public class Author {
	public String fullName;
	public int yearOfBirth;
	public Book[] books;
	
	/**
	 * @param fullName
	 * @param yearOfBirth
	 * @param books
	 */
	public Author(String fullName, int yearOfBirth, Book[] books) {
		super();
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}

	public String toString() {
		String s = fullName + " (born " + yearOfBirth + ")." ;
		return s;
	}
}
