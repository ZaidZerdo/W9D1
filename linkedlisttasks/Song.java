package linkedlisttasks;

public class Song {
	public static final int ROCK = 1;
	public static final int POP = 2;
	public static final int COUNTRY = 3;
	
	private String songName;
	private String artistName;
	private int year;
	private int genre;
	
	public Song(String songName, String artistName, int year, int genre) {
		super();
		this.songName = songName;
		this.artistName = artistName;
		this.year = year;
		this.genre = genre;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (genre != other.genre)
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return artistName + " - " + songName;
	}
	
}
