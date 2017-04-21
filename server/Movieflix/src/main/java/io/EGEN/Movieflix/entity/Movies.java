package io.EGEN.Movieflix.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({
		@NamedQuery(name="Movies.findAll",query="SELECT m from Movies m "),
		@NamedQuery(name="Movies.findByType",query="SELECT m from Movies m where m.type=:ptype"),
		@NamedQuery(name="Movies.findTopRatedMovies",query="SELECT m FROM Movies AS m WHERE m.type=:ptype ORDER BY  m.imdbProfile.imdbRating DESC"),
		@NamedQuery(name="Movies.findTopRatedTvSeries",query="SELECT m FROM Movies AS m WHERE m.type=:ptype ORDER BY  m.imdbProfile.imdbRating DESC"),
		@NamedQuery(name="Movies.sortByYear",query="SELECT m FROM Movies AS m  ORDER BY  m.year DESC"),
		@NamedQuery(name="Movies.sortByGenre",query="SELECT m FROM Movies AS m  where m.genre like CONCAT(:genre,'%')"),
		@NamedQuery(name="Movies.SortByImdbRatings",query="SELECT m FROM Movies AS m  ORDER BY  m.imdbProfile.imdbRating DESC"),
		@NamedQuery(name="Movies.SortByImdbVotes",query="SELECT m FROM Movies AS m  ORDER BY  m.imdbProfile.imdbVotes DESC"),
		@NamedQuery(name="Movies.searchByTitle",query="SELECT m FROM Movies AS m  where m.title like CONCAT(:title,'%')")
		
		

})
public class Movies {
	
	@Id
	@GenericGenerator(name="customUUID", strategy = "uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	private String title;
	private int year;
	private String genre;
	private String type;
	@OneToOne(cascade=CascadeType.ALL)
	private MovieDetails movieDetails;
	@OneToOne(cascade=CascadeType.ALL)
	private ImdbProfile imdbProfile;
	@OneToOne(cascade=CascadeType.ALL)
	private UserRatings userRatings;
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private List<UserComments> userComments;
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
	public List<UserComments> getUserComments() {
		return userComments;
	}
	public void setUserComments(List<UserComments> userComments) {
		this.userComments = userComments;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", type=" + type
				+ ", movieDetails=" + movieDetails + ", imdbProfile=" + imdbProfile + ", userRatings=" + userRatings
				+ ", userComments=" + userComments + "]";
	}
  
	

}
