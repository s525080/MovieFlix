package io.EGEN.Movieflix.repository;

import java.util.List;

import io.EGEN.Movieflix.entity.Movies;

public interface MoviesRepository {
	
	public List<Movies> findAll();
	 //find only  movies
	 public List<Movies> findOnlyMovies();
	 //find only  tv series
	 public List<Movies> findOnlyTvSeries();
	 //find only top rated movies
	 public List<Movies> findTopRatedMovies();
	 //find only top rated tv series
	 public List<Movies> findTopRatedTvSeries();
	 //sort movies by year
	 public List<Movies> moviesByYear();
	//sort movies by Genre
	 public List<Movies> moviesByGenre();
	//sort movies by IMDB ratings
	 public List<Movies> imdbRatings();
	//sort movies by IMDB votes
	 public List<Movies> imdbVotes();
	 //update rating when user rates a movie
	 public double updateUserRating(String movieID);
	 //Search a movie by title
	 public Movies findOne(String title);
	 //post a movie 
	 public Movies createMovie(Movies movie);
	 //update movie details
	 public Movies updateMovie(Movies movie);
	 //delete movie
	 public void deleteMovie(Movies movie);

}
