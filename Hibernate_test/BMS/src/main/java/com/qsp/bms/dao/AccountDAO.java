package com.qsp.bms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.bms.dto.Account;
import com.qsp.bms.dto.Bank;

public class AccountDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bms");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveAccount(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
		System.out.println("Account Saved");
	}

	public void updateAccount(Account account) {
		et.begin();
		em.merge(account);
		et.commit();
		System.out.println("Account Updated");
	}

	public void deleteAccount(Account account) {
		et.begin();
		em.remove(account);
		et.commit();
		System.out.println("Account Removed");
	}

	public Account fetchAccountById(int id) {
		return em.find(Account.class, id);
	}

	public List<Account> fetchAllAccount() {
		Query query = em.createQuery("select a from Account a");
		return query.getResultList();
	}
	
	public void giveAccountToBank(Account account, Bank bank) {
		List<Account> accountsPrev = bank.getAccounts();
		List<Account> accountsNew = new ArrayList<Account>();
		if(accountsPrev.contains(account)) {
			System.out.println("Account is already present in this Bank");
		}
		else {
			accountsNew.add(account);
			bank.setAccounts(accountsNew);
			et.begin();
			em.merge(bank);
			em.merge(account);
			et.commit();
		}
	}
	
	public void deleteAccountOnlyById(Account account) {
		et.begin();
		account.setBank(null);
		em.remove(account);
		et.commit();
		System.out.println("Account Deleted");
	}
}
