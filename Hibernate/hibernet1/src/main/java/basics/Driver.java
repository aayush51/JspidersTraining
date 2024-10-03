package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Sambhaji");
		s1.setPhone(985657456);
		
		et.begin();
		em.persist(s1);
		et.commit();
		
		System.out.println("Saved ! ");
		
	}

}
