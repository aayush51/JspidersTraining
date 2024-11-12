package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	private EntityManager eM;

	public User1 saveUser(User1 user) {
		EntityTransaction et = eM.getTransaction();
		et.begin();
		eM.persist(user);
		et.commit();
		return user;
	}

	public User1 findByIDUser(int id) {
		return eM.find(User1.class, id);
	}

	public void deleteUser(int id) {
		EntityTransaction et = eM.getTransaction();
		User1 user = findByIDUser(id);
		if (user != null) {
			et.begin();
			eM.remove(user);
			et.commit();
		}
	}
	
	public void updateUser(User1 user) {
		EntityTransaction et = eM.getTransaction();
		et.begin();
		eM.merge(user);
		et.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<User1> findAllUsers() {
		Query query = eM.createQuery("select u from User1 u");
		return query.getResultList();
	}

}
