package Basics;

import java.util.ArrayList;

public class ArrayList3 {
	
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
		System.out.println(fruits);
		
		ArrayList veggies = new ArrayList();
		veggies.add("Tomato");
		veggies.add("Spinach");
		veggies.add("Chilli");
		veggies.add("Onion");
		veggies.add("Potato");
		veggies.add("Ginger");
		veggies.add("Garlic");
		System.out.println(veggies);
		
		ArrayList c = new ArrayList();
		c.addAll(fruits);
		c.addAll(veggies);
		
		System.out.println(c);

	}

}
