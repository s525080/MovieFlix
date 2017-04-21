package io.EGEN.Movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.ImdbProfile;
import io.EGEN.Movieflix.entity.MovieDetails;
import io.EGEN.Movieflix.entity.Movies;
import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.entity.UserRatings;
import io.EGEN.Movieflix.exceptions.UserNotFoundException;
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
	public List<Movies> findbyType(String type) {
		// TODO Auto-generated method stub
		return repository.findbyType(type);
	}


	@Override
	public List<Movies> findTopRatedMovies() {
		// TODO Auto-generated method stub
		return repository.findTopRatedMovies();
	}

	@Override
	public List<Movies> findTopRatedTvSeries() {
		// TODO Auto-generated method stub
		return repository.findTopRatedTvSeries();
	}

	@Override
	public List<Movies> moviesByYear() {
		// TODO Auto-generated method stub
		return repository.moviesByYear();
	}

	@Override
	public List<Movies> moviesByGenre(String genre) {
		// TODO Auto-generated method stub
		return repository.moviesByGenre(genre);
	}

	@Override
	public List<Movies> imdbRatings() {
		// TODO Auto-generated method stub
		return repository.imdbRatings();
	}

	@Override
	public List<Movies> imdbVotes() {
		// TODO Auto-generated method stub
		return repository.imdbVotes();
	}

	@Override
	@Transactional
	public Movies updateUserRating(Movies movie, double rating) {
		// TODO Auto-generated method stub
		UserRatings ur = movie.getUserRatings();
		double rate = ur.getAvgRating();
		int noOfRatings = ur.getNoOfRatings();
		int one = ur.getOneRating();
		int two = ur.getTwoRating();
		int three = ur.getThreeRating();
		int four = ur.getFourRating();
		int five = ur.getFiveRating();
		
		noOfRatings+=1;
		ur.setNoOfRatings(noOfRatings);
		if(rating == 5){
			five+=1;
			ur.setFiveRating(five);
		}else if(rating == 4){
			four+=1;
			ur.setFourRating(four);
		}else if(rating == 3){
			three+=1;
			ur.setThreeRating(three);
		}else if(rating == 2){
			two+=1;
			ur.setTwoRating(two);
		}else{
			one+=1;
			ur.setOneRating(one);
		}
		
		rate = (5*five + 4*four + 3* three + 2*two + 1*one)/noOfRatings;
		ur.setAvgRating(rate);
		
		movie.setUserRatings(ur);
		
		return repository.updateUserRating(movie);
	}

	@Override
	public String updateComment(Movies movie, String comment, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movies findOne(String id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}
	
	@Override
	public List<Movies> search(String title){
		return repository.search(title);
		
	}

	@Override
	@Transactional
	public Movies createMovie(Movies movie) {
		// TODO Auto-generated method stub
		return repository.createMovie(movie);
	}

	@Override
	@Transactional
	public Movies updateMovie(String id, Movies movie) {
		// TODO Auto-generated method stub
		 Movies existing = repository.findOne(id);
			
			if(existing == null){
				//throw new UserNotFoundException();
			}
			
		return repository.updateMovie(movie);
	}
   
	@Override
	@Transactional
	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		 Movies existing = repository.findOne(id);
			
			if(existing == null){
				//throw new UserNotFoundException();
			}
			
		repository.deleteMovie(existing);
	}

	
}
