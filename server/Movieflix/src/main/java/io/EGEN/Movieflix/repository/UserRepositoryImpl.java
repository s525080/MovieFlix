package io.EGEN.Movieflix.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public User login(String email) {
		// TODO Auto-generated method stub
		TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
		query.setParameter("pemail", email);
		return query.getSingleResult();
	}

	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public User signUp(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		return user;
	}

	@Override
	@Transactional
	public User update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
		return user;
	}

	@Override
	@Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		//return null;
		em.remove(user);
		
	}

	@Override
	public User findUser(String id) {
		// TODO Auto-generated method stub
		
		return em.find(User.class, id);
	}

}
