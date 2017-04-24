package io.EGEN.Movieflix.repository;

import io.EGEN.Movieflix.entity.MinimalProfile;
import io.EGEN.Movieflix.entity.User;

public interface UserRepository {
	
	public User login(User user,MinimalProfile login);
	public User logout(User user);
	public User signUp(User user);
	public User update(User user);
	public void delete(User user);
	public User findUser(String id);
	public User findEmail(String email);

}
