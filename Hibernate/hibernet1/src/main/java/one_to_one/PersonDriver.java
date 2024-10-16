package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Person person1 = new Person();
//		person1.setId(101);
//		person1.setName("Gaurav Mohite");
//		person1.setAge(27);
//		Person person2 = new Person();
//		person2.setId(102);
//		person2.setName("Anish Khalase");
//		person2.setAge(24);
//		Person person3 = new Person();
//		person3.setId(103);
//		person3.setName("Tejas Kashyap");
//		person3.setAge(32);
//		
//		AdharCard card1 = new AdharCard();
//		card1.setId(11);
//		card1.setName("Gaurav Mohite");
//		card1.setAddress("Varangaon");
//		AdharCard card2 = new AdharCard();
//		card2.setId(12);
//		card2.setName("Anish Khalase");
//		card2.setAddress("Mumbai");
//		AdharCard card3 = new AdharCard();
//		card3.setId(13);
//		card3.setName("Tejas Kashyap");
//		card3.setAddress("Hyderabad");
//		
//		person1.setCard(card1);
//		person2.setCard(card2);
//		person3.setCard(card3);
//
//		et.begin();
//		em.persist(person1);
//		em.persist(card1);
//		em.persist(person2);
//		em.persist(card2);
//		em.persist(person3);
//		em.persist(card3);
//		et.commit();
		
		
		
		
//		Person person = em.find(Person.class, 101);
//		System.out.println("----------------Person-----------------");
//		System.out.println("ID :  "+person.getId());
//		System.out.println("Name :"+person.getName());
//		System.out.println("Age : "+person.getAge());
//		AdharCard card = person.getCard();
//		System.out.println("---------------Adharcard---------------");
//		System.out.println("Card ID :"+card.getId());
//		System.out.println("Name :   "+card.getName());
//		System.out.println("Address :"+card.getAddress());
		
		
		
		
//		Person person = em.find(Person.class, 101);
//		if(person!=null)
//		{
//			AdharCard card = person.getCard();
//			et.begin();
//			em.remove(person);
//			em.remove(card);
//			et.commit();
//			System.out.println("Removed");
//		}
		
		
		
		Person person = em.find(Person.class, 102);
		if(person!=null) {
			person.setAge(21);
			AdharCard card = person.getCard();
			card.setAddress("Kolhapur");
			et.begin();
			em.merge(person);
			em.merge(card);
			et.commit();
			System.out.println("Updated");
		}
	}

}
