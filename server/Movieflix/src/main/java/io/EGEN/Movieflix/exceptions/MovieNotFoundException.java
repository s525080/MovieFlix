package io.EGEN.Movieflix.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public class MovieNotFoundException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7172389658487118089L;

		public MovieNotFoundException(String msg){
			super(msg);
		}
		
		public MovieNotFoundException(String msg,Throwable cause){
			super(msg,cause);
		}
	}


