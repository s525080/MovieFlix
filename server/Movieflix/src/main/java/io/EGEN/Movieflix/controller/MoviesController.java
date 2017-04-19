package io.EGEN.Movieflix.controller;

import java.util.List;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.EGEN.Movieflix.entity.ImdbProfile;
import io.EGEN.Movieflix.entity.MovieDetails;
import io.EGEN.Movieflix.entity.Movies;
import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.service.MoviesService;

@RestController
@RequestMapping(path="movies")
public class MoviesController {
	
	@Autowired
	MoviesService service;
	//@RequestMapping(method=RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping(method = RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@RequestMapping(method = RequestMethod.GET,path="/movies",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> findOnlyMovies() {
		// TODO Auto-generated method stub
		return service.findOnlyMovies();
	}

	@RequestMapping(method=RequestMethod.GET,path="/tvseries",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> findOnlyTvSeries() {
		// TODO Auto-generated method stub
		return service.findOnlyTvSeries();
	}

	@RequestMapping(method=RequestMethod.GET,path="/topmovies",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> findTopRatedMovies() {
		// TODO Auto-generated method stub
		return service.findTopRatedMovies();
	}

	@RequestMapping(method=RequestMethod.GET,path="/toptv",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> findTopRatedTvSeries() {
		// TODO Auto-generated method stub
		return service.findTopRatedTvSeries();
	}

	@RequestMapping(method=RequestMethod.GET,path="/year",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> moviesByYear() {
		// TODO Auto-generated method stub
		return service.moviesByYear();
	}

	@RequestMapping(method=RequestMethod.GET,path="/genre",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> moviesByGenre() {
		// TODO Auto-generated method stub
		return service.moviesByGenre();
	}

	@RequestMapping(method=RequestMethod.GET,path="/imdbratings",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> imdbRatings() {
		// TODO Auto-generated method stub
		return service.imdbRatings();
	}

	@RequestMapping(method=RequestMethod.GET,path="/imdbvotes",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movies> imdbVotes() {
		// TODO Auto-generated method stub
		return service.imdbVotes();
	}

	
	public double updateUserRating(Movies movie, double rating) {
		// TODO Auto-generated method stub
		return service.updateUserRating(movie, rating);
	}

	
	public String updateComment(Movies movie, String comment, User user) {
		// TODO Auto-generated method stub
		return service.updateComment(movie, comment, user);
	}

	@RequestMapping(method=RequestMethod.GET,path="/{title}",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies findOne(@PathVariable("title") String title) {
		// TODO Auto-generated method stub
		return service.findOne(title);
	}

	@RequestMapping(method=RequestMethod.POST,produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies createMovie(@RequestBody Movies movie) {
		// TODO Auto-generated method stub
		return service.createMovie(movie);
	}

	@RequestMapping(method=RequestMethod.POST,path="/{id}",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies updateMovie(@PathVariable("id") String id, Movies movie) {
		// TODO Auto-generated method stub
		return service.updateMovie(id, movie);
	}

	@RequestMapping(method=RequestMethod.POST,path="/{id}",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		service.deleteMovie(id);
		
	}

}
