package MethodsOfHashSet;

import java.util.HashSet;

public class HS4 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet hs1 = new HashSet();
		hs1.add(101);
		hs1.add(101);
		hs1.add(102);
		hs1.add("Hello");
		hs1.add("Hello");
		hs1.add("Hello");
		hs1.add(true);
		hs1.add(true);
		hs1.add(true);
		hs1.add(true);
		hs1.add(2.5);
		hs1.add(0.00001);
		
		System.out.println(hs1);
		
		
		
	}

}
