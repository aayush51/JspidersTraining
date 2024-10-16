package com.qsp.ems.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ems");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

}
