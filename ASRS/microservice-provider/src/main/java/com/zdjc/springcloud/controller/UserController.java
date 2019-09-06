package com.zdjc.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zdjc.springcloud.entity.User;
import com.zdjc.springcloud.service.UserService;

/**
 * @ClassName:     UserController.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午11:31:26 
 */
@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public boolean addUser(@RequestBody User user){
		boolean flag = service.addUser(user);
		return flag;
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable("id") int id){
		User user = service.getUser(id);
		return user;
	}
	
	@RequestMapping(value="/getUser/list", method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		return users;
	}
}
