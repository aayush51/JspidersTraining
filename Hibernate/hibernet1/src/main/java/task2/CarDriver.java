package task2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Car car1 = new Car();
//		car1.setId(1001);
//		car1.setBrand("Volvo");
//		
//		Engine engine1 = new Engine();
//		engine1.setId(101);
//		engine1.setCc(420);
//		
//		car1.setEngine(engine1);
//		
//		et.begin();
//		em.persist(car1);
//		em.persist(engine1);
//		et.commit();
//		System.out.println("Saved");
		
		
		
		
//		Car c = em.find(Car.class, 1001);
//		System.out.println("-----------Car-----------");
//		System.out.println(c.getId());
//		System.out.println(c.getBrand());
//		Engine e = c.getEngine();
//		System.out.println("-----------Engine-----------");
//		System.out.println(e.getId());
//		System.out.println(e.getCc());
		
		

		
//		Car c = em.find(Car.class, 1001);
//		c.setBrand("Toyota");
//		Engine e = c.getEngine();
//		e.setCc(580);
//		
//		et.begin();
//		em.merge(c);
//		em.merge(e);
//		et.commit();
//		System.out.println("Updated");
		

		
		
//		Car c = em.find(Car.class, 1001);
//		Engine e = c.getEngine();
//		et.begin();
//		em.remove(c);
//		em.remove(e);
//		et.commit();
//		System.out.println("Deleted");
		
		
		
		
		
//		Car car1 = new Car();
//		car1.setId(1004);
//		car1.setBrand("Tata");
//		
//		Engine engine1 = new Engine();
//		engine1.setId(104);
//		engine1.setCc(550);
//		
//		car1.setEngine(engine1);
//		
//		et.begin();
//		em.persist(car1);
//		em.persist(engine1);
//		et.commit();
//		System.out.println("Saved");

	}

}
