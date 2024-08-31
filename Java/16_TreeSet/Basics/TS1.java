package Basics;

import java.util.TreeSet;

public class TS1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(101);
		ts1.add(109);
		ts1.add(166);
		ts1.add(981);
		ts1.add(651);
		ts1.add(381);
		ts1.add(661);
		ts1.add(351);
		ts1.add(351);
		ts1.add(351);
		ts1.add(251);
		System.out.println(ts1);//Natural Order Sorting without Duplicates
	}

}
