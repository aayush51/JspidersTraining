package EcommerceProject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ecommerce_Driver {

	public static void main(String[] args) 
	{
		Welcome obj = new Welcome();
		obj.welcome();
	}
}

class UserDetails
{
	String userName;
	String password;
	String address;
	long phoneNumber;

	public UserDetails(String userName, String password, String address, long phoneNumber) 
	{
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString()
	{
		return userName + ", " + "Address: " + address + ", PhoneNumber: " + phoneNumber + ".";
	}
}


class Welcome
{
	UserDetails userObject;

	HomePage homePage = new HomePage();

	Scanner sc = new Scanner(System.in);

	static
	{
		System.out.println("*** WELCOME ***");
		System.out.println();
	}

	public void welcome()
	{
		for( ; ; )
		{
			System.out.println(" 1. Create a new Account ");
			System.out.println(" 2. Existing User ");
			System.out.println(" 3. Exit ");

			System.out.print(" Option: ");
			int option = sc.nextInt();

			switch(option)
			{
			case 1 : 
				createAccount();
				break;

			case 2 : 
				loginUser();
				break;

			case 3 : 
				System.exit(0);
				break;

			default : 
				System.out.println("Wrong Input");
			}
		}
	}

	private void createAccount() 
	{
		System.out.println("*** ACCOUNT CREATION MODULE ***");

		sc.nextLine();

		System.out.print(" Enter Your Username: ");
		String username = sc.nextLine();

		System.out.print(" Enter Your Password: ");
		String password = sc.nextLine();

		System.out.print(" Enter Your Address: ");
		String address = sc.nextLine();
		System.out.print(" Enter Your Phone-Number: ");
		long phoneNumber = sc.nextLong();

		userObject = new UserDetails(username, password, address, phoneNumber);
	}

	private void loginUser() 
	{
		if(userObject == null)
		{
			System.out.println(" Create your Account First. ");
			return;
		}

		System.out.println();

		System.out.println("*** LOGIN MODULE ***");

		for( int i = 3; i > 0; i--)
		{
			sc.nextLine();

			System.out.print(" Username: ");
			String username = sc.nextLine();

			System.out.print(" Password: ");
			String password = sc.nextLine();

			if(this.userObject.userName.equals(username) && this.userObject.password.equals(password))
			{
				homePage.categories();
			}
			else
			{
				System.out.println(" WRONG CREDENTIALS ");
				System.out.println(" Attempts left : " + (i - 1));
			}
		}

		System.exit(0);
	}
}


class Product implements Comparable<Product>
{
	String productName;
	double price;

	public Product(String productName, double price) 
	{
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString()
	{
		return " Product Name: " + productName + ", Price: " + price;
	}

	@Override
	public int compareTo(Product o)
	{
		if(this.price < o.price)
		{
			return -1;
		}
		else if(this.price > o.price)
		{
			return 1;
		}

		return 0;
	}
}


class HomePage
{
	ArrayList<Product> cart = new ArrayList<Product>();

	Scanner sc = new Scanner(System.in);

	public void categories()
	{
		for( ; ; )
		{
			System.out.println("*** SHOP BY CATEGORIES ***");

			System.out.println(" 1. Clothes  2. Footwear  3. Electronics  4. Checkout  5. Logout");

			System.out.print(" Enter your Option : ");
			int option = sc.nextInt();

			switch(option)
			{
			case 1 :
				clothes();
				break;

			case 2 :
				footwear();
				break;

			case 3 :
				electronics();
				break;

			case 4 :
				checkOut();
				break;

			case 5 :
				logout();
				break;

			default :
				System.out.println(" WRONG INPUT ");
			}
		}
	}

	private void clothes() 
	{		
		String [] arr = { " Shirt(107) : 1000", "Jeans(108) : 1500" };

		List<String> electronics = Arrays.asList(arr);

		for( ; ; )
		{
			System.out.println("*** CLOTHES ***");

			for(String str : electronics)
			{
				System.out.println(str);
			}

			System.out.print(" Enter a ProductID : ");
			int productId = sc.nextInt();

			switch(productId)
			{
			case 107 :
				cart(new Product(" Shirt ", 1000));
				break;

			case 108 :
				cart(new Product(" Jeans ", 1500));
				break;

			case 0 :
				return;

			default :
				System.out.println(" WRONG INPUT ");
			}
		}
	}

	private void footwear() 
	{		
		String [] arr = { " Shoes(104) : 3000", "Crocs(105) : 2500", "FlipFlop(106) : 1200" };

		List<String> electronics = Arrays.asList(arr);

		for( ; ; )
		{
			System.out.println("*** FOOTWEAR MODULE ***");

			for(String str : electronics)
			{
				System.out.println(str);
			}

			System.out.print(" Enter a Product-ID : ");
			int productId = sc.nextInt();

			switch(productId)
			{
			case 104 :
				cart(new Product(" Shoes ", 3000));
				break;

			case 105 :
				cart(new Product(" Crocs ", 2500));
				break;

			case 106 :
				cart(new Product(" FlipFlop ", 1200));
				break;

			case 0 :
				return;

			default :
				System.out.println(" WRONG INPUT ");
			}
		}
	}

	private void electronics() 
	{
		String [] arr = { "Mobile(101) : 40000", "Laptop(102) : 80000", "TV(103) : 35000" };

		List<String> electronics = Arrays.asList(arr);

		for( ; ; )
		{
			System.out.println("*** ELECTRONICS ***");

			for(String str : electronics)
			{
				System.out.println(str);
			}

			System.out.print(" Enter a Product-ID : ");
			int productId = sc.nextInt();

			switch(productId)
			{
			case 101 :
				cart(new Product(" Mobile ", 40000));
				break;

			case 102 :
				cart(new Product(" Laptop ", 80000));
				break;

			case 103 :
				cart(new Product(" TV ", 35000));
				break;

			case 0 :
				return;

			default :
				System.out.println(" WRONG INPUT ");
			}
		}
	}

	private void checkOut()
	{
		Collections.sort(cart);

		for(Product product : cart)
		{
			System.out.println(product);
		}

		bill();
	}

	private void bill()
	{
		double totalBill = 0;

		for(Product product : cart)
		{
			totalBill += product.price;
		}

		System.out.println(" Your Total Bill is : " + totalBill);
	}

	private void logout() 
	{
		System.out.println(" THANK YOU & VISIT AGAIN ");

		Welcome obj = new Welcome();
		obj.welcome();
	}

	public void cart(Product product)
	{
		System.out.println(" Product added inside cart successfully ");
		cart.add(product);
	}
}

