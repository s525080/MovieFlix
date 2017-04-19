package io.EGEN.Movieflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class UserRatings {
	
	@Id
	@GenericGenerator(name="customUUID", strategy = "uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	
	private double userRating;
	private double avgRating;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getUserRating() {
		return userRating;
	}
	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	
	public void setfinalRating(double rating){
		
		avgRating= (avgRating+rating)/2;
	}
	@Override
	public String toString() {
		return "UserRatings [id=" + id + ", userRating=" + userRating + ", avgRating=" + avgRating + "]";
	}
	
	

}
