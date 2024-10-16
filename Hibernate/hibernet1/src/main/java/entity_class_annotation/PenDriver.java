package entity_class_annotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Pen pen = new Pen();
		pen.setBrand("Parker");
		pen.setPrice(150.0);
		
		et.begin();
		em.persist(pen);
		et.commit();
	}

}
