package io.EGEN.Movieflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.exceptions.AlreadyExistsException;
import io.EGEN.Movieflix.exceptions.NotFoundException;
import io.EGEN.Movieflix.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	@Transactional
	public User login(String email) {
		// TODO Auto-generated method stub
//		User existing = repository.findUser(user);
//		if(existing == null){
//			throw new NotFoundException("User not found");
//		}
		return repository.login(email);
	}

	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return repository.logout(user);
	}

	@Override
	@Transactional
	public User signUp(User user) {
		// TODO Auto-generated method stub
		User existing = repository.findUser(user.getEmail());
		if(existing != null){
			throw new AlreadyExistsException("User already exists");
		}
		
		return repository.signUp(user);
	}

	@Override
	@Transactional
	public User update(String id, User user) {
		// TODO Auto-generated method stub
		User existing = repository.findUser(id);
		if(existing == null){
			throw new NotFoundException("User not found");
		}
		return repository.update(user);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		//return null;
		User existing = repository.findUser(id);
		if(existing == null){
			throw new NotFoundException("User not found");
			
		}
		repository.delete(existing);
	}

}
