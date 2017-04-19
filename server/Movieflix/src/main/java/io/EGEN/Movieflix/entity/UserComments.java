package io.EGEN.Movieflix.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class UserComments {
	
	@Id
	@GenericGenerator(name="customUUID", strategy = "uuid2")
	@GeneratedValue(generator="customUUID")
	private int id;
	
	private List<String> allComments;
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getAllComments() {
		return allComments;
	}
	public void setAllComments(List<String> allComments) {
		this.allComments = allComments;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setAddComment(String comment){
		
	 allComments.add(comment);
		
	}
	@Override
	public String toString() {
		return "UserComments [id=" + id + ", allComments=" + allComments + ", user=" + user + "]";
	}
	
	
	

}
