package one_to_one_bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = new Car();
		car.setId(101);
		car.setBrand("TATA");
		
		Engine engine = new Engine();
		engine.setId(10);
		engine.setCc(5000);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		et.begin();
		em.persist(engine);
		em.persist(car);
		et.commit();
		System.out.println("Saved");
	}

}
