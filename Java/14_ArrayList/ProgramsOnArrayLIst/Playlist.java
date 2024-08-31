package ProgramsOnArrayLIst;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Object> PlayList = new ArrayList<>();
		
		PlayList.add(new Song("Ve Kamleya", "Arijit Singh" , 2024, "Hindi" , "Rocky Aur Rani Kii Prem Kahani", 4.06));
		PlayList.add(new Song("nadaaniyaan","Akshath", 2024 , "Hindi","nadaaniyaan",2.51 ));
		PlayList.add(new Song("Khairiyat","Arijit Singh",2019,"Hindi","Chhichhore",4.40));
		PlayList.add(new Song("Demons","Imagine Dragons",2012,"English","Night Visions",2.57));
		PlayList.add(new Song("Apna Bana Le", "Sachin-Jigar",2022,"Hindi","Bhediya",4.21));
		PlayList.add(new Song("Love Dose","Yo Yo Honey Singh",2014,"Hindi","Desi Kalakaar",3.44));
		PlayList.add(new Song("Blue Eyes","Yo Yo Honey Singh",2013,"Hindi","Blue Eyes",3.40));
		PlayList.add(new Song("Yaar Naa Miley","Yo Yo Honey Singh",2018,"Hindi","Kick",4.03));
		PlayList.add(new Song("Animals","Maroon 5",2015,"English","Kick",3.51));
		PlayList.add(new Song("Tum Se","Sachin-Jigar",2024,"Hindi","Teri Baaton Mein Aisa Uljha Jiya",4.24));
		PlayList.add(new Song("Akhiyaan Gulaab","Mitraz",2024,"Hindi","Teri Baaton Mein Aisa Uljha Jiya",2.51));
		PlayList.add(new Song("Naina","Diljit Dosanjh",2024,"Hindi","Crew",3.00));
		PlayList.add(new Song("Choo Lo","The Local Train",2015,"Hindi","Aalas Ka Pedh",3.53));
		PlayList.add(new Song("Maan Meri Jaan","King",2022,"Hindi","Champagne Talk",3.14));
		PlayList.add(new Song("The Promise","Siddharth Mahadevan",2016,"Marathi","Baghtos Kay Mujara Kaar",4.11));
		PlayList.add(new Song("Kaavaalaa","Anirudh Ravichander",2023,"Tamil","Jailer",3.10));
		PlayList.add(new Song("Vaathi Coming","Anirudh Ravichander",2020,"Tamil","Master",4.16));
		PlayList.add(new Song("Arabic Kuthu","Anirudh Ravichander",2022,"Tamil","Beast",4.41));
		
		
//		for(Object o : PlayList) {
//			Song s = (Song) o;
//			System.out.println(s.toString());
//		}
		
//		for(Object o : PlayList) {
//			Song s = (Song) o;
//			Integer yr = 2022;
//			if(((Integer)s.releaseYear).equals(yr)) {
//				System.out.println(s.toString());
//			}
//		}
		
		System.out.println("By which you want to search/sort : ");
		String searchBy = sc.nextLine();
		
		System.out.println("Enter "+searchBy+" : ");
		String searchName = sc.nextLine();
		
		for(Object o : PlayList) {
			Song s = (Song)o;
			if(searchBy.equalsIgnoreCase("name") || searchBy.equalsIgnoreCase("artist") || 
					searchBy.equalsIgnoreCase("singer") || searchBy.equalsIgnoreCase("language") || 
					searchBy.equalsIgnoreCase("album") || searchBy.equalsIgnoreCase("movie")) {
				
				if ((s.albumName).equalsIgnoreCase(searchName) ||
						(s.artistName).equalsIgnoreCase(searchName) ||
						(s.language).equalsIgnoreCase(searchName) ||
						(s.name).equalsIgnoreCase(searchName)) {
					System.out.println(s.toString());
				}
			}
			else if(searchBy.equalsIgnoreCase("year")) {
				int num1 = Integer.parseInt(searchName);
				if((int)(s.releaseYear)==num1) {
					System.out.println(s.toString());
				}	
			}
			else if(searchBy.equalsIgnoreCase("duration")) {
				double dur = Double.parseDouble(searchName);
				if((double)(s.duration)==dur) {
					System.out.println(s.toString());
				}
			}
			else {
				System.out.println("Invalid Input !");
			}
		}
		
		sc.close();
	}

}
