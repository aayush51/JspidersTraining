package Basics;

import java.util.ArrayList;

public class ArrayList6 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grape");
		fruits.add("Chikoo");
		fruits.add("Kiwi");
		fruits.add("Tomato");
		fruits.add("Spinach");
		fruits.add("Chilli");
		fruits.add("Onion");
		fruits.add("Potato");
		fruits.add("Ginger");
		fruits.add("Garlic");
		System.out.println(fruits);
		
		for (Object object : fruits) {
			String s = (String) object;
			char first = s.charAt(0);
			char last = s.charAt(s.length() - 1);
			if (first=='O'||first=='o'||last=='O'||last=='o') {
				System.out.println(s);
			}
			
		}
		
	}

}
