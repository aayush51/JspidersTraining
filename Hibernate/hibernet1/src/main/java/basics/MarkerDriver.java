package basics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MarkerDriver {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Marker m1 = new Marker();
		m1.setId(101);
		m1.setBrand("Cello");
		m1.setPrice(20);
		
		Marker m2 = new Marker();
		m2.setId(102);
		m2.setBrand("Shiner");
		m2.setPrice(35);
		
		Marker m3 = new Marker();
		m3.setId(103);
		m3.setBrand("BoldMark");
		m3.setPrice(25);
		
		et.begin();
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		et.commit();
		
		System.out.println("Saved ! ");
		
	}


}
