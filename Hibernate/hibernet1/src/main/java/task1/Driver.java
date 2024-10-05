package task1;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

//		Book.putBookInDB(1,"Atomic_Habit","Nepolian_Hill");
//		Book.putBookInDB(2,"Harry_Potter","J.K._Rowling");
//		Book.putBookInDB(3,"Mahabharata","Vyasa");
//		Book.putBookInDB(4,"Bhagavad_Gita","Vyasa");
//		Book.putBookInDB(5,"Ramayana","Valmiki");

//		Book b1 = Book.getBookById(2);
//		System.out.println("ID:" + b1.getId());
//		System.out.println("Name:" + b1.getName());
//		System.out.println("Author:" + b1.getAuthor());

//		Book.updateBookName(2, "Fantastic_Beasts");

//		Book b2 = Book.getBookById(2);
//		System.out.println("ID:" + b2.getId());
//		System.out.println("Name:" + b2.getName());
//		System.out.println("Author:" + b2.getAuthor());

//		ArrayList<Book> books = Book.getBookSet();
//		for (Book book : books) {
//			System.out.println("ID:" + book.getId());
//			System.out.println("Name:" + book.getName());
//			System.out.println("Author:" + book.getAuthor());
//			System.out.println("------------------------------");
//		}

//		System.out.println(Book.getQuantityOfBooks());

		
//		List<Book> b = Book.getBookByAuthor("Vyasa");
//		for (Book book : b) {
//			System.out.println("ID:" + book.getId());
//			System.out.println("Name:" + book.getName());
//			System.out.println("Author:" + book.getAuthor());
//			System.out.println("------------------------------");
//		}
		
		
	
		List<Book> b = Book.getBookSet(true);
		
//		b.sort((o1, o2) -> o1.getId() - o2.getId());
		
		for (Book book : b) {
			System.out.println("ID:" + book.getId());
			System.out.println("Name:" + book.getName());
			System.out.println("Author:" + book.getAuthor());
			System.out.println("------------------------------");
		}
		

	}

}
