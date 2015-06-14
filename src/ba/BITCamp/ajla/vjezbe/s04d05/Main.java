package ba.BITCamp.ajla.vjezbe.s04d05;

public class Main {

	public static void main(String[] args) {
		
		// Artists
		Artist artist1 = new Artist("Guano Apes", true, "Alternative rock");
		Artist artist2 = new Artist("Adele", false, "Soul");
		Artist artist3 = new Artist("Iron Mainden", true, "Heavy Metal");
		Artist artist4 = new Artist("EKV", true, "Alternative rock");
		Artist artist5 = new Artist("Galija", true, "Progressive rock");
		
		// Songs
		Song song1 = new Song(artist1, "Plastic Mouth", 2002, "Funk metal");
		Song song2 = new Song(artist1, "Pretty in Scarlet", 2002, "Funk metal");
		Song song3 = new Song(artist1, "Storm", 2002, "Funk metal");
		Song song4 = new Song(artist1, "Kiss the Dawn", 2002, "Funk metal");

		Song song5 = new Song(artist2, "Rolling in the Deep", 2010, "Soul");
		Song song6 = new Song(artist2, "I'll Be Waiting", 2010, "Soul");
		Song song7 = new Song(artist2, "One and Olny", 2010, "Soul");
		
		Song song8 = new Song(artist3, "The Number of the Beast" , 1991, "Heavy Metal");
		Song song9 = new Song(artist3, "Fear of the Dark", 1991, "Heavy Metal");
		Song song10 = new Song(artist3, "I Can't See My Feelings", 1995, "Heavy Metal");
		
		Song song11 = new Song(artist4, "Aut" , 1984, "Alternative rock");
		Song song12 = new Song(artist4, "I Have Always Loved You", 1985, "Alternative rock");
		Song song13 = new Song(artist4, "Pored mene", 1987, "Alternative rock");		
		Song song14 = new Song(artist4, "Ona i on, i on i ja" , 1989, "Alternative rock");
		Song song15 = new Song(artist4, "Neko nas posmatra", 1993, "Alternative rock");
		
		Song song16 = new Song(artist5, "Da li si spavala", 1988, "Progressive rock");
		Song song17 = new Song(artist5, "Trube", 1991, "Progressive rock");		
		Song song18 = new Song(artist5, "Kotor" , 1997, "Progressive rock");
		Song song19 = new Song(artist5, "Dodirni me", 1999, "Progressive rock");
		
		// Song arrays for albums
		
		Song[] a1 = {song1, song2, song3, song4};
		Song[] a2 = {song5, song6, song7};
		Song[] a3 = {song8, song9};
		Song[] a4 = {song10};
		Song[] a5 = {song11, song12, song15};
		Song[] a6 = {song13, song14};
		Song[] a7 = {song17, song18};
		Song[] a8 = {song16, song19};
		
		// Albums
		Album album1 = new Album ("Walking on a thin line", artist1, a1, "Funk metal");
		Album album2 = new Album ("21", artist2, a2, "Soul");
		Album album3 = new Album ("The Number of the Beast", artist3, a3, "Heavy Metal");
		Album album4 = new Album ("Fear of the Dark", artist3, a4, "Heavy Metal");
		Album album5 = new Album ("Neko nas posmatka", artist4, a5, "Alternative rock");
		Album album6 = new Album ("EKV Revisited", artist4, a6, "Alternative rock");
		Album album7 = new Album ("Daleko je sunce", artist5, a7, "Progressive rock");
		Album album8 = new Album ("Ipak verujem u sebe", artist5, a8, "Progressive rock");
		
		// List of albums
		Album[] albums = {album1, album2, album3, album4, album5};
		
		// Testing
		System.out.println(isSameAuthor(song1, song11));
		System.out.println(isFromSoloAuthor(song1));
		System.out.println(olderSong(song1, song14));
		System.out.println(countGenreNumber(album6, "Alternative rock"));
		printAlbumInformation(albums, song4);

	}

	/**
	 * Checks if two songs have same author
	 * @param song1 Song 
	 * @param song2 Song 
	 * @return true if songs have same author
	 */
	public static boolean isSameAuthor(Song song1, Song song2) {
		return (song1.artist.name.equals(song2.artist.name)) ? true : false;
	}
	
	/**
	 * Checks if artist of provided song is solo artist or band 
	 * @param song Song
	 * @return true if an artist is solo
	 */
	public static boolean isFromSoloAuthor(Song song) {
		return (song.artist.isBand) ? false : true;
	}
	
	/**
	 * Checks which of two provided songs is older
	 * @param s1 Song
	 * @param s2 Song
	 * @return older song 
	 */
	public static Song olderSong(Song s1, Song s2) {
		return (s1.yearOfPublishing < s2.yearOfPublishing) ? s1 : s2;
	}
	
	/**
	 * Iterate through the album, counting songs that belong to the provided genre
	 * @param a Album
	 * @param genre String that represents desired genre
	 * @return count of songs with provided genre
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;
		for(Song song : a.songs) {
			counter += (song.genre.equals(genre)) ? 1 : 0;
		}
		return counter;
	}
	
	/**
	 * Prints the name of the album to which provided song belongs
	 * @param albums Array of Albums
	 * @param song Song
	 */
	public static void printAlbumInformation(Album[] albums, Song song) {
		for (int i = 0; i < albums.length; i++) {
			for (int j = 0; j < albums[i].songs.length; j++) {
				if(albums[i].songs[j].equals(song)) {
					System.out.println(albums[i].title);
					break;
				}
			}
		}
	}
	
	/*public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int[] numberOfSongsPerAlbum = new int[a.length];
		for (int i = 0; i < c.songs.length; i++) {
			
		}
	}*/
}
