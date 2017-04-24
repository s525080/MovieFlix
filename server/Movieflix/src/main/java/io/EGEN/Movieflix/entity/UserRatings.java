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
	
	
	private double avgRating;
	private int noOfRatings;
	private int oneRating;
	private int twoRating;
	private int threeRating;
	private int fourRating;
	private int fiveRating;
	
	public int getOneRating() {
		return oneRating;
	}
	public void setOneRating(int oneRating) {
		this.oneRating = oneRating;
	}
	public int getTwoRating() {
		return twoRating;
	}
	public void setTwoRating(int twoRating) {
		this.twoRating = twoRating;
	}
	public int getThreeRating() {
		return threeRating;
	}
	public void setThreeRating(int threeRating) {
		this.threeRating = threeRating;
	}
	public int getFourRating() {
		return fourRating;
	}
	public void setFourRating(int fourRating) {
		this.fourRating = fourRating;
	}
	public int getFiveRating() {
		return fiveRating;
	}
	public void setFiveRating(int fiveRating) {
		this.fiveRating = fiveRating;
	}
	public int getNoOfRatings() {
		return noOfRatings;
	}
	public void setNoOfRatings(int noOfRatings) {
		this.noOfRatings = noOfRatings;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	
	public double setfinalRating(double rating){
//		noOfRatings+=1;
//		if(rating == 5){
//			fiveRating+=1;
//		}else if(rating == 4){
//			fourRating+=1;
//		}else if(rating == 3){
//			threeRating+=1;
//		}else if(rating == 2){
//			twoRating+=1;
//		}else{
//			oneRating+=1;
//		}
//		
//		avgRating= (5*fiveRating + 4*fourRating + 3* threeRating + 2*twoRating + 1*oneRating)/noOfRatings;
		
		return avgRating;
	}
	
	
	

}
