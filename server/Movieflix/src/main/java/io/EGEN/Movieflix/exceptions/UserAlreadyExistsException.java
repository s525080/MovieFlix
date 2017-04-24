package io.EGEN.Movieflix.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class UserAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7172389658487118089L;

	public UserAlreadyExistsException(String msg){
		super(msg);
	}
	
	public UserAlreadyExistsException(String msg,Throwable cause){
		super(msg,cause);
	}
}