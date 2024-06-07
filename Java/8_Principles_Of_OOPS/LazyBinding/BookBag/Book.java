package LazyBinding.BookBag;

public class Book {
	String BookName;
	String Author;
	int Price;
	int NoOfPages;
	
	public Book()
	{
		
	}
	
	Book(String name, String author, int price, int pages) {
		BookName = name;
		Author = author;
		Price = price;
		NoOfPages = pages;
	}
	
	public void showBook()
	{
		System.out.println("Book Name: " + BookName);
		System.out.println("Author: " + Author);
		System.out.println("Price: " + Price);
		System.out.println("No of Pages: " + NoOfPages);
	}

}
