package com.qsp.ems.dao;
//Data Access Object
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.ems.dto.Company;

public class CompanyDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ems");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public static void createCompany(Company company) {
		
		
	}

}