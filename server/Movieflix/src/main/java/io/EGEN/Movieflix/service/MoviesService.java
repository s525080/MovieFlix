package io.EGEN.Movieflix.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import io.EGEN.Movieflix.entity.ImdbProfile;
import io.EGEN.Movieflix.entity.MovieDetails;
import io.EGEN.Movieflix.entity.Movies;
import io.EGEN.Movieflix.entity.User;


public interface MoviesService {
	
	 public List<Movies> findAll();
	 //find only  movies
	 public List<Movies> findbyType(String type);
	 //find only top rated movies
	 public List<Movies> findTopRatedMovies();
	 //find only top rated tv series
	 public List<Movies> findTopRatedTvSeries();
	 //sort movies by year
	 public List<Movies> moviesByYear();
	//sort movies by Genre
	 public List<Movies> moviesByGenre(String genre);
	//sort movies by IMDB ratings
	 public List<Movies> imdbRatings();
	//sort movies by IMDB votes
	 public List<Movies> imdbVotes();
	 //update rating when user rates a movie
	 public Movies updateUserRating(Movies movie,double rating);
	 
	 public String updateComment(Movies movie,String comment,User user);
	 //Search a movie by title
	 public Movies findOne(String id);
	 public List<Movies> search(String title);
	 //post a movie 
	 public Movies createMovie(Movies movie);
	 //update movie details
	 public Movies updateMovie(String id,Movies movie);
	 //delete movie
	 public void deleteMovie(String id);

}
