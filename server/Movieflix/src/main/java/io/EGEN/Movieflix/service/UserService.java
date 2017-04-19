package io.EGEN.Movieflix.service;

import io.EGEN.Movieflix.entity.User;

public interface UserService {
	
	public User login(User user);
	public User logout(User user);
	public User signUp(User user);

}
