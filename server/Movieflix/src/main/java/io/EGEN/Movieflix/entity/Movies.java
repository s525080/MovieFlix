package io.EGEN.Movieflix.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Movies {
	
	@Id
	@GenericGenerator(name="customUUID", strategy = "uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	private String title;
	private int year;
	private String genre;
	private String type;
	@OneToOne
	private MovieDetails movieDetails;
	@OneToOne
	private ImdbProfile imdbProfile;
	@OneToMany
	private UserRatings userRatings;
	@OneToMany
	private UserComments userComments;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MovieDetails getMovieDetails() {
		return movieDetails;
	}
	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}
	public ImdbProfile getImdbProfile() {
		return imdbProfile;
	}
	public void setImdbProfile(ImdbProfile imdbProfile) {
		this.imdbProfile = imdbProfile;
	}
	public UserRatings getUserRatings() {
		return userRatings;
	}
	public void setUserRatings(UserRatings userRatings) {
		this.userRatings = userRatings;
	}
	public UserComments getUserComments() {
		return userComments;
	}
	public void setUserComments(UserComments userComments) {
		this.userComments = userComments;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", type=" + type
				+ ", movieDetails=" + movieDetails + ", imdbProfile=" + imdbProfile + ", userRatings=" + userRatings
				+ ", userComments=" + userComments + "]";
	}
	
	

}
