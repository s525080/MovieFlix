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
	public List<Movies> findbyType(String type) {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.findByType", Movies.class);
		query.setParameter("ptype", type);
		return query.getResultList();
	}

	 

	@Override
	public List<Movies> findTopRatedMovies() {
		// TODO Auto-generated method stubMovies.findTopRatedMovies
		TypedQuery<Movies> query= em.createNamedQuery("Movies.findTopRatedMovies", Movies.class);
		query.setParameter("ptype", "movie");
		return query.getResultList();
	}

	@Override
	public List<Movies> findTopRatedTvSeries() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.findTopRatedTvSeries", Movies.class);
		query.setParameter("ptype", "series");
		return query.getResultList();
	}

	@Override
	public List<Movies> moviesByYear() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.sortByYear", Movies.class);
		return query.getResultList();
	}

	@Override
	public List<Movies> moviesByGenre(String genre) {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.sortByGenre", Movies.class);
		query.setParameter("genre", genre);
	
		return query.getResultList();
	}

	@Override
	public List<Movies> imdbRatings() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.SortByImdbRatings", Movies.class);
		return query.getResultList();
	}

	@Override
	public List<Movies> imdbVotes() {
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.SortByImdbVotes", Movies.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Movies updateUserRating(Movies movie) {
		// TODO Auto-generated method stub
		return em.merge(movie);
	}

	@Override
	@Transactional
	public Movies updateComment(Movies movie) {
		// TODO Auto-generated method stub
		return em.merge(movie);
	}

	@Override
	public Movies findOne(String id) {
		// TODO Auto-generated method stub
		
		return em.find(Movies.class, id);
	}

	@Override
	public List<Movies> search(String title) {
		
		// TODO Auto-generated method stub
		TypedQuery<Movies> query= em.createNamedQuery("Movies.searchByTitle", Movies.class);
		query.setParameter("title", title);
	
		return query.getResultList();
		
	}
	@Override
	@Transactional
	public Movies createMovie(Movies movie) {
		// TODO Auto-generated method stub
//		System.out.println(movie);
//		MovieDetails md= movie.getMovieDetails();
//		em.persist(md);
//		ImdbProfile imdb = movie.getImdbProfile();
//		em.persist(imdb);
//		UserRatings ur= movie.getUserRatings();
//		System.out.println(ur);
//		em.persist(ur);
//		List<UserComments> uc = movie.getUserComments();
//		for(UserComments u: uc){
//		em.persist(u);
//		}
		em.persist(movie);
		return movie;
	}

	@Override
	@Transactional
	public Movies updateMovie(Movies movie) {
		// TODO Auto-generated method stub

		return em.merge(movie);
	}

	@Override
	@Transactional
	public void deleteMovie(Movies movie) {
		// TODO Auto-generated method stub
		em.remove(movie);
	}

}
