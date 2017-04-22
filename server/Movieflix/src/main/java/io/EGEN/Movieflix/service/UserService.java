package io.EGEN.Movieflix.service;

import io.EGEN.Movieflix.entity.User;

public interface UserService {
	
	public User login(String email);
	public User logout(User user);
	public User signUp(User user);
	public User update(String id,User user);
	public void delete(String id);

}
