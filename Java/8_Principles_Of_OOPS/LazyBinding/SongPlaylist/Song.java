package LazyBinding.SongPlaylist;

public class Song {
	String SongName;
	String Artist;
	int Duration;
	int ReleaseYear;

	public Song() {

	}

	Song(String name, String artist, int duration, int year) {
		SongName = name;
		Artist = artist;
		Duration = duration;
		ReleaseYear = year;
	}

	public void showSong() {
		System.out.println("Song Name: " + SongName);
		System.out.println("Artist: " + Artist);
		System.out.println("Duration: " + Duration);
		System.out.println("Release Year: " + ReleaseYear);
	}

}
