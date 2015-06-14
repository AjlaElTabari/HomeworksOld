package ba.BITCamp.ajla.vjezbe.s04d05;

public class Song {
	public Artist artist;
	public String name;
	public int yearOfPublishing;
	public String genre;
	
	/**
	 * @param artist
	 * @param name
	 * @param yearOfPublishing
	 * @param genre
	 */
	public Song(Artist artist, String name, int yearOfPublishing, String genre) {
		super();
		this.artist = artist;
		this.name = name;
		this.yearOfPublishing = yearOfPublishing;
		this.genre = genre;
	}
	
	public String toString() {
		return name;
		}
}
