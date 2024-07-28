package MethodChaining;

public class Fruit {
	    
        String name;
        int price;
        String color;
        String taste;
        
		Fruit() {
			System.out.println("from no arg constructor");
		}
		
		Fruit(String name, int price, String color, String taste) {
			this.name = name;
			this.price = price;
			this.color = color;
			this.taste = taste;
		}
		
		public Fruit showName() {
			System.out.println("Name: " + name);
            return this;
        }
		
		public Fruit showPrice() {
			System.out.println("Price: " + price);
            return this;
        }
		
		public Fruit showColor() {
			System.out.println("Color: " + color);
            return this;
        }
		
		public Fruit showTaste() {
			System.out.println("Taste: " + taste);
			return this;
		}
}
