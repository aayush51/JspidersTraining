package Basics;

import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(1);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(70);
		hs.add(70);
		hs.add(0);
		hs.add(0);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(101);
		hs.add(101);
		System.out.println(hs);  // Without Duplicates , Order of Insertion not maintained
		System.out.println(hs.toString());
		
	}
}