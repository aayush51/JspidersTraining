package com.qsp.bms.controller;

import java.util.ArrayList;
import java.util.List;

import com.qsp.bms.dao.AccountDAO;
import com.qsp.bms.dao.BankDAO;
import com.qsp.bms.dto.Account;
import com.qsp.bms.dto.Bank;

public class BMSController {

	public static void main(String[] args) {

		BankDAO bankDao = new BankDAO();
		AccountDAO accountDao = new AccountDAO();

		Bank bank1 = new Bank();
		bank1.setName("HDFC");
		bank1.setLocation("Pune");
		Account account1 = new Account();
		account1.setName("Mahesh");
		account1.setBalance(250000.0);
		account1.setBank(bank1);
		Account account2 = new Account();
		account2.setName("Gaurav");
		account2.setBalance(359100.0);
		account2.setBank(bank1);
		List<Account> list1 = new ArrayList<Account>();
		list1.add(account1);
		list1.add(account2);
		bank1.setAccounts(list1);

		bankDao.saveBank(bank1);
		accountDao.saveAccount(account1);
		accountDao.saveAccount(account2);

		Bank bank2 = new Bank();
		bank2.setName("SBI");
		bank2.setLocation("Mumbai");
		Account account3 = new Account();
		account3.setName("Anish");
		account3.setBalance(199000.0);
		account3.setBank(bank2);
		Account account4 = new Account();
		account4.setName("Aayush");
		account4.setBalance(563300.0);
		account4.setBank(bank2);
		List<Account> list2 = new ArrayList<Account>();
		list2.add(account3);
		list2.add(account4);
		bank2.setAccounts(list2);

		bankDao.saveBank(bank2);
		accountDao.saveAccount(account3);
		accountDao.saveAccount(account4);

		Bank bank3 = new Bank();
		bank3.setName("KOTAK");
		bank3.setLocation("Hyderabad");
		Account account5 = new Account();
		account5.setName("Tejas");
		account5.setBalance(325580.0);
		account5.setBank(bank3);
		Account account6 = new Account();
		account6.setName("Yash");
		account6.setBalance(102000.0);
		account6.setBank(bank3);
		List<Account> list3 = new ArrayList<Account>();
		list3.add(account5);
		list3.add(account6);
		bank3.setAccounts(list3);

		bankDao.saveBank(bank3);
		accountDao.saveAccount(account5);
		accountDao.saveAccount(account6);

		Bank id1Bank = bankDao.fetchBankById(1);
		System.out.println(id1Bank.getId());
		System.out.println(id1Bank.getName());
		System.out.println(id1Bank.getLocation());

		Account id1Account = accountDao.fetchAccountById(1);
		System.out.println(id1Account.getId());
		System.out.println(id1Account.getName());
		System.out.println(id1Account.getBalance());

		List<Bank> banks = bankDao.fetchAllBank();
		for (Bank bank : banks) {
			System.out.println(bank.getId());
			System.out.println(bank.getName());
			System.out.println(bank.getLocation());
			System.out.println("--------------------------");
		}

		List<Account> accounts = accountDao.fetchAllAccount();
		for (Account acc : accounts) {
			System.out.println(acc.getId());
			System.out.println(acc.getName());
			System.out.println(acc.getBalance());
			System.out.println("--------------------------");
		}

		bank1.setLocation("Chennai");
		bankDao.updateBank(bank1);

		id1Bank = bankDao.fetchBankById(1);
		System.out.println(id1Bank.getId());
		System.out.println(id1Bank.getName());
		System.out.println(id1Bank.getLocation());

		Account accDelete = accountDao.fetchAccountById(6);
		accountDao.deleteAccountOnlyById(accDelete);

	}

}
