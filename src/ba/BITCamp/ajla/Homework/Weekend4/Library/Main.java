package ba.BITCamp.ajla.Homework.Weekend4.Library;

public class Main {

	public static void main(String[] args) {

		// Books for one author
		Book book1 = new Book("The Lovely Bones", 2002, "Novel", true);
		Book book2 = new Book("Lucky", 2002, "Memoir", false);
		Book book3 = new Book("The Almost Moon", 2007, "Novel", false);

		Book[] books1 = new Book[] { book1, book2, book3 };

		Author author1 = new Author("Alice Sebold ", 1963, books1);

		// Books for another author
		Book book5 = new Book("Foundation", 1951, "Science Fiction", true);
		Book book6 = new Book("Foundation and Empire", 1952, "Science Fiction",
				true);
		Book book7 = new Book("Second Foundation", 1953, "Science Fiction",
				true);

		Book[] books2 = new Book[] { book5, book6, book7 };

		Author author2 = new Author("Isaac Asimov", 1890, books2);

		// Array of authors
		Author[] authors = new Author[] { author1, author2 };

		// Testing
		System.out.println("Chosen author has " + countBestSellingBooks(author2) + " bestsellers.");
		System.out.println("Chosen author published " + getNumberOfWrittenBooks(author2, 1950, 1952) + " books in choosen period.");
		System.out.println("The most successful author is " + getAuthorWithMostBestsellers(authors));

	}

	/**
	 * Counts bestseller books from the chosen author
	 * @param a Author
	 * @return int number, that represents number of bestsellers from forwarded author
	 */
	public static int countBestSellingBooks(Author a) {
		int counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].isBestseller) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Gets number of published books in chosen period for chosen author
	 * @param a Author
	 * @param year1 from
	 * @param year2 to, both included
	 * @return number of published books in chosen period for chosen author
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].yearOfPublishing >= year1
					&& a.books[i].yearOfPublishing <= year2) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Gets most successful author from provided array of authors
	 * @param authors Author
	 * @return Author author that has most bestsellers 
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors) {
		Author theMostSuccessfulAuthor = authors[0];
		int tempCounter = 0;
		for (int i = 0; i < authors.length; i++) {
			if (countBestSellingBooks(authors[i]) > tempCounter) {
				tempCounter = countBestSellingBooks(authors[i]);
				theMostSuccessfulAuthor = authors[i];
			}
		}
		return theMostSuccessfulAuthor;
	}

}
