package ProgramsOnArrayLIst;

public class Song {
	
	String name;
	String artistName;
	int releaseYear;
	String language;
	String albumName;
	double duration;
	
	public Song(String name, String artistName, int releaseYear, String language, String albumName, double duration) {
		super();
		this.name = name;
		this.artistName = artistName;
		this.releaseYear = releaseYear;
		this.language = language;
		this.albumName = albumName;
		this.duration = duration;
	}
	
	public String toString() {
		return "Name: " + name + " , Artist: "+ artistName + " , Release Year: " + releaseYear + " , Language : "+ language + " , Album Name: "+ albumName + " , Duration: "+ duration;
	}

}
