package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company company1 = new Company();
		company1.setId(1001);
		company1.setName("TCS");
		company1.setLocation("Mumbai");
		Company company2 = new Company();
		company2.setId(1002);
		company2.setName("Infosys");
		company2.setLocation("Pune");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Gaurav Khalase");
		employee1.setSalary(300000);
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Anish Shinde");
		employee2.setSalary(280000);
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Mahesh Mohite");
		employee3.setSalary(450000);
		Employee employee4 = new Employee();
		employee4.setId(4);
		employee4.setName("Tejas Nikam");
		employee4.setSalary(500000);
		Employee employee5 = new Employee();
		employee5.setId(5);
		employee5.setName("Rohit khaire");
		employee5.setSalary(480000);
		Employee employee6 = new Employee();
		employee6.setId(6);
		employee6.setName("Sambhaji Patil");
		employee6.setSalary(420000);
		
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(employee1);
		list1.add(employee2);
		list1.add(employee3);
		list1.add(employee4);
		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(employee5);
		list2.add(employee6);
		
		company1.setEmployees(list1);
		company2.setEmployees(list2);
		
		et.begin();
		em.persist(company1);
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		em.persist(employee4);
		em.persist(company2);
		em.persist(employee5);
		em.persist(employee6);
		et.commit();
		System.out.println("Saved");
		
		
		
		Company c1 = em.find(Company.class, 1001);
		if (c1!=null) {
			List<Employee> employees = c1.getEmployees();
			System.out.println(c1);
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
		Company c2 = em.find(Company.class, 1002);
		if (c2!=null) {
			List<Employee> employees = c2.getEmployees();
			System.out.println(c2);
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
		
		
		
		
		
//		Employee e1 = em.find(Employee.class, 4);
//		if(e1!=null) {
//			System.out.println(e1);
//			et.begin();
//			em.remove(e1);	//update or delete on table "employee" violates foreign key constraint "fkotg12ixqriqdmmrob48iyqoy9" on table "company_employee"
//			et.commit();
//		}
	}

}
