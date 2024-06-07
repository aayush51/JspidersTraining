package LazyBinding.SongPlaylist;

public class Playlist {
	String PlaylistName;
	String Creator;
	int Duration;
	int NoOfSongs;

	Song s1;

	public Playlist() {

	}

	Playlist(String name, String creator, int duration, int noOfSongs) {
		PlaylistName = name;
		Creator = creator;
		Duration = duration;
		NoOfSongs = noOfSongs;
	}

	public void insertSong(String name, String artist, int duration, int year) {
		s1 = new Song(name, artist, duration, year);

		System.out.println("Song inserted successfully");

		NoOfSongs++;
	}

	public void showPlaylist() {
		System.out.println("Playlist Name: " + PlaylistName);
		System.out.println("Creator: " + Creator);
		System.out.println("Duration: " + Duration);
		System.out.println("No of Songs: " + NoOfSongs);
	}

}
