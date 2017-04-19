package io.EGEN.Movieflix.repository;

import io.EGEN.Movieflix.entity.User;

public interface UserRepository {
	
	public User login(User user);
	public User logout(User user);
	public User signUp(User user);

}
