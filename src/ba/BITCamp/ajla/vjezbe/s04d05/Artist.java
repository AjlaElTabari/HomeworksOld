package ba.BITCamp.ajla.vjezbe.s04d05;

public class Artist {
	public String name;
	public boolean isBand;
	public String genre;
	/**
	 * @param name
	 * @param isBand
	 * @param genre
	 */
	public Artist(String name, boolean isBand, String genre) {
		super();
		this.name = name;
		this.isBand = isBand;
		this.genre = genre;
	}
	
	public String toString() {
		return name;
		}
}
