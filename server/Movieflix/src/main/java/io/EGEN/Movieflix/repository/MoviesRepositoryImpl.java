package io.EGEN.Movieflix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.EGEN.Movieflix.entity.ImdbProfile;
import io.EGEN.Movieflix.entity.MovieDetails;
import io.EGEN.Movieflix.entity.Movies;
import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.entity.UserComments;
import io.EGEN.Movieflix.entity.UserRatings;

@Repository
public class MoviesRepositoryImpl implements MoviesRepository {

	@PersistenceContext
	 EntityManager em;
	
	@Override
	public List<Movies> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.findAll", Movies.class);
		return query.getResultList();
	}

	@Override
	public List<Movies> findOnlyMovies() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.findOnlyMovies", Movies.class);
		query.setParameter("pmovies", "movies");
		return query.getResultList();
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
		MovieDetails md= movie.getMovieDetails();
		em.persist(md);
		ImdbProfile imdb = movie.getImdbProfile();
		em.persist(imdb);
		UserRatings ur= movie.getUserRatings();
		em.persist(ur);
		List<UserComments> uc = movie.getUserComments();
		for(UserComments u: uc){
		em.persist(u);
		}
		em.persist(movie);
		return movie;
	}

	@Override
	public Movies updateMovie(Movies movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMovie(Movies movie) {
		// TODO Auto-generated method stub
		
	}

	

}
