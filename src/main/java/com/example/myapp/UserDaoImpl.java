package com.example.myapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}	
	
	@Override
	public void addTestUser() {
		User user = new User();
		user.setName("Patrick" + Math.random());
		entityManager.persist(user);
	}
}
