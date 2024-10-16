package basics;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver {
	
	public static void main(String[] args) {
		
//		Add Data
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		Student s1 = new Student();
//		s1.setId(103);
//		s1.setName("Mahesh");
//		s1.setPhone(875964585);
//		
//		et.begin();
//		em.persist(s1);
//		et.commit();
//		
//		System.out.println("Saved ! ");
		
		
		
//		Fetch data 
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		Student s = em.find(Student.class, 101);
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getPhone());
		
		
		
//		Delete data
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Student s = em.find(Student.class, 103);
//		if(s!=null) {
//			et.begin();
//			em.remove(s);
//			et.commit();
//			System.out.println("Data Deleted !");
//		}
//		else {
//			System.out.println("Id is not Present");
//		}
		
		
		
//		Update data
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Student s = em.find(Student.class, 102);
//		if(s!=null) {
//			s.setName("Raj");
//			et.begin();
//			em.merge(s);
//			et.commit();
//			System.out.println("Data Updated !");
//		}
//		else {
//			System.out.println("Id is not Present");
//		}

		
		
//		Fetch all data 
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		Query query = em.createQuery("select s from Student s");
//		List<Student> students = query.getResultList();
//		for (Student student : students) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getPhone());
//			System.out.println("-----------------------------");
//		}
		
		
		
//		Dynamic data fetching
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//		Query query = em.createQuery("select s from Student s where s.name=?1 and phone=?2");
//		query.setParameter(1, "Raj");
//		query.setParameter(2, 784596987l);
//		Student s = (Student) query.getSingleResult();
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getPhone());

	}

}
