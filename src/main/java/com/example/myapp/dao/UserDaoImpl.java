package com.example.myapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.myapp.domain.User;

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
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void delete(Integer id) {
		entityManager.remove(entityManager.find(User.class, id));
	}
}
