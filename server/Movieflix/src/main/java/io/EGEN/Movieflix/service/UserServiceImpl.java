package io.EGEN.Movieflix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return repository.login(user);
	}

	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return repository.logout(user);
	}

	@Override
	public User signUp(User user) {
		// TODO Auto-generated method stub
		return repository.signUp(user);
	}

	@Override
	public User update(String id, User user) {
		// TODO Auto-generated method stub
		User existing = repository.findUser(id);
		if(existing == null){
			
		}
		return repository.update(user);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		//return null;
		User existing = repository.findUser(id);
		if(existing == null){
			
		}
		repository.delete(existing);
	}

}
