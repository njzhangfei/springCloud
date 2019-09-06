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
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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
	@HystrixCommand(fallbackMethod="hystrixGetUser") //一旦服务调用失败，就调用hystrixGetUser方法
	public User getUser(@PathVariable("id") int id){
		User user = null;
		try {
			user = service.getUser(id);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("service.getUser(id) 调用失败，不存在id=" + id + "对应的用户信息");
		}
		if(user == null){
			throw new RuntimeException("不存在id=" + id + "对应的用户信息");
		}
		return user;
	}
	public User hystrixGetUser(@PathVariable("id") int id){
		User user = new User(id, "不存在该用户----服务熔断成功！", 0,"");
		return user;
	}
	
	@RequestMapping(value="/getUser/list", method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		return users;
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="hystrixTest") //一旦服务调用失败，就调用hystrixGetUser方法
	public User test(){
		throw new RuntimeException("对应的用户信息");
	}
	public User hystrixTest(){
		User user = new User(-1, "熔断示例---服务熔断成功！", 0,"");
		return user;
	}
}
