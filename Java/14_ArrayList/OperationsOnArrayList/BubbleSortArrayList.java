package OperationsOnArrayList;

import java.util.ArrayList;

public class BubbleSortArrayList {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(51);
		al.add(19);
		al.add(43);
		al.add(54);
		al.add(15);
		al.add(61);
		al.add(77);
		al.add(81);
		
		System.out.println(al);
		
		for (int i = 0; i < al.size(); i++) {
			for (int j = i+1; j < al.size(); j++) {
				if((int) al.get(i) > (int) al.get(j)) {
					Object temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		
		System.out.println(al);
		
	}

}
