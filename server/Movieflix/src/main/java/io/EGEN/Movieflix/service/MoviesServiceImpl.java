package io.EGEN.Movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.ImdbProfile;
import io.EGEN.Movieflix.entity.MovieDetails;
import io.EGEN.Movieflix.entity.Movies;
import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.repository.MoviesRepository;

@Service
public class MoviesServiceImpl implements MoviesService {
    
	@Autowired
	MoviesRepository repository;
	
	@Override
	public List<Movies> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Movies> findOnlyMovies() {
		// TODO Auto-generated method stub
		return repository.findOnlyMovies();
	}

	@Override
	public List<Movies> findOnlyTvSeries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> findTopRatedMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> findTopRatedTvSeries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> moviesByYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> moviesByGenre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> imdbRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movies> imdbVotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double updateUserRating(Movies movie, double rating) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String updateComment(Movies movie, String comment, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movies findOne(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Movies createMovie(Movies movie) {
		// TODO Auto-generated method stub
		return repository.createMovie(movie);
	}

	@Override
	public Movies updateMovie(String id, Movies movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		
	}

	
}
