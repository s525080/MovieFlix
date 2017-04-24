package io.EGEN.Movieflix.service;

import java.util.List;


import io.EGEN.Movieflix.entity.Movies;



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
	 
	 public Movies updateComment(String id,Movies movie);
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
