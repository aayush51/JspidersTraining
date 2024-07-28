package ObjectClass;

public class BagDriver {
	
	public static void main(String[] args)
	{
		Bag b1 = new Bag("Wild Craft","Black",3.0,1000.0);
		System.out.println(b1);
		System.out.println(b1.toString());
//		System.out.println(b1.giveReference());
		System.out.println("----------------------------------------------------------");
		
//		Bag b2 = new Bag("VIP","Grey",3.5,1200.0);
		Bag b2 = new Bag("Wild Craft","Black",3.0,1000.0);
		System.out.println(b2);
		System.out.println(b2.toString());
//		System.out.println(b2.giveReference());
		System.out.println("----------------------------------------------------------");
		
		System.out.println(b1==b2);
		
		
	}

}
