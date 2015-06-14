package ba.BITCamp.ajla.vjezbe.s04d05;

public class Album {
	public String title;
	public Artist artist;
	public Song[] songs;
	public String genre;
	
	/**
	 * @param title
	 * @param artist
	 * @param songs
	 * @param genre
	 */
	public Album(String title, Artist artist, Song[] songs, String genre) {
		super();
		this.title = title;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}
	
	public String toString() {
		return title;
		}
}
