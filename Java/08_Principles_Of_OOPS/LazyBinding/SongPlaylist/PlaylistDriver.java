package LazyBinding.SongPlaylist;

public class PlaylistDriver {
	
	public static void main(String[] args) {
		Playlist p = new Playlist("My Playlist", "Aayush", 1500, 5);
		p.showPlaylist();

		System.out.println("--------------------------------");

		p.insertSong("Shape of You", "Ed Sheeran", 500, 2017);

		System.out.println("--------------------------------");

		p.s1.showSong();

		System.out.println("--------------------------------");

		p.showPlaylist();
		
		
	}

}
