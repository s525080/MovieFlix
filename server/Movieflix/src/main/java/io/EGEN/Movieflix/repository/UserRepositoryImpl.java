package io.EGEN.Movieflix.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.MinimalProfile;
import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.exceptions.UserNotFoundException;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public User login(User user,MinimalProfile login) {
		// TODO Auto-generated method stub
		String actualPassword = user.getLogin().getPassword();
		if(actualPassword.equals(login.getPassword()))
		{
		return user;
		}else {
			throw new UserNotFoundException("Password is incorrect");
		}
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

	@Override
	public User findEmail(String email) {
		// TODO Auto-generated method stub
		TypedQuery<User> query = em.createNamedQuery("User.findByEmail", User.class);
		query.setParameter("pemail", email);

		List<User> results = query.getResultList();
	    if (results.isEmpty()){
	    	return null;
	    }
	    else  {
	    	return results.get(0);
	    }
	}

}
