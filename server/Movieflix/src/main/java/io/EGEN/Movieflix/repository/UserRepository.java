package io.EGEN.Movieflix.repository;

import io.EGEN.Movieflix.entity.User;

public interface UserRepository {
	
	public User login(String email);
	public User logout(User user);
	public User signUp(User user);
	public User update(User user);
	public void delete(User user);
	public User findUser(String id);

}
