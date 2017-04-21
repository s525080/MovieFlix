package io.EGEN.Movieflix.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.EGEN.Movieflix.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signUp(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
		return user;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		//return null;
		
	}

	@Override
	public User findUser(String id) {
		// TODO Auto-generated method stub
		
		return em.find(User.class, id);
	}

}
