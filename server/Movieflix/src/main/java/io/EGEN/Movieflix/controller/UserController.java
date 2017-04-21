package io.EGEN.Movieflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.EGEN.Movieflix.entity.User;
import io.EGEN.Movieflix.service.UserService;

@RestController
@RequestMapping(path="user")
public class UserController {
	
	@Autowired
	UserService service;
	
	
	public User login(User user){
		return service.login(user);
	}
	public User logout(User user){
		return service.logout(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User signUp(@RequestBody User user){
		return service.signUp(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/id",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User update(@PathVariable("id") String id,@RequestBody User user){
		return service.update(id, user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/id")
	public void delete(@PathVariable("id") String id){
		service.delete(id);
	}

}
