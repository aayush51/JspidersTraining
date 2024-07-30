package Basics;

import java.util.ArrayList;

public class ArrayList5 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		
//		Confusion in remove method with different parameters
		
//		al.remove(2);   // remove element at index 2 
						// remove with index as parameter
		
		al.remove((Integer)2);  // remove element with value 2 
								// remove with Object as parameter
		
		System.out.println(al);
		
	}

}
