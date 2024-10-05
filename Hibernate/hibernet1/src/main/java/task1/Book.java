package task1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Entity
public class Book {

	@Id
	private int id;
	private String name;
	private String author;

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static void putBookInDB(int ID, String name, String author) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Book b = new Book();
		b.setId(ID);
		b.setName(name);
		b.setAuthor(author);

		et.begin();
		em.persist(b);
		et.commit();

		System.out.println(name + " book added");
	}

	public static Book getBookById(int ID) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Book b = em.find(Book.class, ID);
		return b;
	}

	public static void updateBookName(int ID, String newName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Book b = em.find(Book.class, ID);
		if (b != null) {
			b.setName(newName);
			et.begin();
			em.merge(b);
			et.commit();
		}
		System.out.println("Book(ID:" + ID + ") Name Updated");
	}

	public static void deleteBookById(int ID) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Book b = em.find(Book.class, ID);
		if (b != null) {
			et.begin();
			em.remove(b);
			et.commit();
		}
		System.out.println("Book(ID:" + ID + ") Deleted !");
	}

	public static long getQuantityOfBooks() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select count(b.id) from Book b");

		return (long) query.getSingleResult();
	}

	public static ArrayList<Book> getBookSet() {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b = null;
		long numOfBooks = getQuantityOfBooks();
		for (int i = 1, added = 0; added < numOfBooks; i++) {
			System.out.println(numOfBooks);
			System.out.println(added);
			b = Book.getBookById(i);
			if (b != null) {
				books.add(b);
				added++;
			}
		}
		return books;
	}
	public static List<Book> getBookSet(Boolean newMethod) {
		if(newMethod==true) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select b from Book b");
		List<Book> books = query.getResultList();
		return books;
		}
		else {
			return getBookSet();
		}
	}
	
	public static List<Book> getBookByAuthor(String author) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select b from Book b where b.author=?1");
		query.setParameter(1, author);
		List<Book> books = query.getResultList();
		return books;
	}

}
