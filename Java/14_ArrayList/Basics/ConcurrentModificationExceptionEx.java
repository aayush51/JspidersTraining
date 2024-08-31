package Basics;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionEx {
	
	public static void main(String[] args) {
		
		List<Integer> al= new ArrayList<Integer>();
		
		al.add(10);
		al.add(22);
		al.add(36);
		al.add(57);
		al.add(81);
		
		int removeNum = 36;
		
		for (Integer i : al) {
			if((int)i==removeNum) {
				al.remove(i);
			}
			System.out.println(i);
		}
	}
	
}
