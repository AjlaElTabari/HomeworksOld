package ba.BITCamp.ajla.Homework.Weekend4.Library;

public class Book {
	public String title;
	public int yearOfPublishing;
	public String genre;
	public boolean isBestseller;
		
	/**
	 * @param title
	 * @param yearOfPublishing
	 * @param genre
	 * @param isBestseller
	 */
	public Book(String title, int yearOfPublishing, String genre,
			Boolean isBestseller) {
		super();
		this.title = title;
		this.yearOfPublishing = yearOfPublishing;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
	
	public String toString() {
		String s = "Title: " + title + "\n";
		s += "Published: " + yearOfPublishing + "\n";
		s += "Genre: " + genre + "\n";
		s += (isBestseller) ? "is bestseller" : "isn't bestesller";
		return s;
	}
}
