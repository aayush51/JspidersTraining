package com.qsp.bms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.bms.dto.Account;
import com.qsp.bms.dto.Bank;

public class BankDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bms");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveBank(Bank bank) {
		et.begin();
		em.persist(bank);
		et.commit();
		System.out.println("Bank Saved");
	}

	public void updateBank(Bank bank) {
		et.begin();
		em.merge(bank);
		et.commit();
		System.out.println("Bank Updated");
	}

	public void deleteBank(Bank bank) {
		et.begin();
		em.remove(bank);
		et.commit();
		System.out.println("Bank Removed");
	}

	public Bank fetchBankById(int id) {
		return em.find(Bank.class, id);
	}

	public List<Bank> fetchAllBank() {
		Query query = em.createQuery("select b from Bank b");
		return query.getResultList();
	}

}
