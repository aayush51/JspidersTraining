package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// Saving Data
//		Bank b1 = new Bank();
//		b1.setId(101);
//		b1.setName("HDFC");
//		b1.setBranch("Pune");
//		
//		Account a1 = new Account();
//		a1.setId(1001);
//		a1.setIfsc("hdfc000325");
//		a1.setBalance(300000.0);
//		
//		Account a2 = new Account();
//		a2.setId(1002);
//		a2.setIfsc("hdfc000325");
//		a2.setBalance(150000.0);
//		
//		Account a3 = new Account();
//		a3.setId(1003);
//		a3.setIfsc("hdfc000325");
//		a3.setBalance(250000.0);
//		
//		List<Account> li1 = new ArrayList<Account>();
//		li1.add(a1);
//		li1.add(a2);
//		li1.add(a3);
//		
//		b1.setAccounts(li1);
//		
//		Bank b2 = new Bank();
//		b2.setId(102);
//		b2.setName("SBI");
//		b2.setBranch("Kolhapur");
//		
//		Account a4 = new Account();
//		a4.setId(1004);
//		a4.setIfsc("sbikol1256");
//		a4.setBalance(752230.0);
//		
//		Account a5 = new Account();
//		a5.setId(1005);
//		a5.setIfsc("sbikol1256");
//		a5.setBalance(65428.0);
//		
//		List<Account> li2 = new ArrayList<Account>();
//		li2.add(a4);
//		li2.add(a5);
//		
//		b2.setAccounts(li2);
//		
//		et.begin();
//		em.persist(b1);
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.persist(b2);
//		em.persist(a4);
//		em.persist(a5);
//		et.commit();
//		
//		System.out.println("saved");

		Bank bank1 = em.find(Bank.class, 101);
		List<Account> acc1 = bank1.getAccounts();
		Bank bank2 = em.find(Bank.class, 102);
		List<Account> acc2 = bank2.getAccounts();

		System.out.println(bank1);
		for (Account account : acc1) {
			System.out.println(account);
		}
		System.out.println(bank2);
		for (Account account : acc2) {
			System.out.println(account);
		}

	}

}
