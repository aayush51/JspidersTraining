package Basics;

import java.util.ArrayList;

public class ArrayList1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(12);
		al.add(36598);
		al.add(true);
		al.add("hello");
		al.add(123.3698);
		
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		for (Object o : al) {
			System.out.println(o.toString());
		}
		
		int[] ar = {1,5,6,9,8,7,56,22,65,988};
		for (int i : ar) {
			System.out.print(i + " ");
		}
	}

}
