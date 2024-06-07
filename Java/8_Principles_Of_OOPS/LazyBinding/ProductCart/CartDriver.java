package LazyBinding.ProductCart;

public class CartDriver {
	
	public static void main(String[] args) {

		Cart c1 = new Cart("John", "Customer1", 0, 0);
		
		c1.showCart();
		
		System.out.println("--------------------------------");

		c1.insertProduct("Product1", "Brand1", 100, 2);
		
		c1.p1.showProduct();
		
		System.out.println("--------------------------------");
		
		c1.insertProduct("Product2", "Brand2", 200, 3);
		
		c1.p1.showProduct();
		
		System.out.println("--------------------------------");

		c1.showCart();
	}

}
