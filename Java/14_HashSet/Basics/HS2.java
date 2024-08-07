package Basics;

import java.util.ArrayList;
import java.util.HashSet;

public class HS2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Raju");
		names.add("Bhoju");
		names.add("Moju");
		names.add("Moju");
		names.add("Moju");
		names.add("Moju");
		names.add("Kaju");
		names.add("Kaju");
		names.add("Kish Mish");
		names.add("Kish Mish");
		names.add("Kish Mish");
		names.add("Kish Mish");
		names.add("Acrot");
		names.add("Anjeer");
		System.out.println(names);
		
//		ArrayList To HashSet
		HashSet<String> hs = new HashSet<>(names);
		System.out.println("ArrayList To HashSet");
		System.out.println(hs);
		
//		HashSet To ArrayList
		ArrayList<String> AL1 = new ArrayList<>(hs);
		System.out.println("HashSet To ArrayList");
		System.out.println(AL1);
		
	}

}
