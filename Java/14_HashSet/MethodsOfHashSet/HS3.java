package MethodsOfHashSet;

import java.util.HashSet;

public class HS3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(1);
		hs.add(1);
		hs.add(1);
		hs.add(1);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(16);
		hs.add(17);
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(101);
		hs.add(123);
		hs.add(156);
		hs.add(176);
		hs.add(190);
		System.out.println(hs);
		System.out.println("hs.clone() - "+hs.clone());
		System.out.println("hs.contains(100) - "+hs.contains(100));
		System.out.println("hs.equals(hs.clone()) - "+hs.equals(hs.clone()));
		System.out.println("hs.hashCode() - "+hs.hashCode());
		System.out.println("hs.isEmpty() - "+hs.isEmpty());
		System.out.println("hs.remove(101) - "+hs.remove(101));
		System.out.println("hs - "+hs);
		System.out.println("hs.size() - "+hs.size());
		System.out.println("hs.toString() - "+hs.toString());
		System.out.println("hs.getClass() - "+hs.getClass());
		System.out.println("hs.toArray() - "+hs.toArray());
		System.out.println("hs.clear() - ");
		hs.clear();
		System.out.println("hs - "+hs);
		
	}

}
