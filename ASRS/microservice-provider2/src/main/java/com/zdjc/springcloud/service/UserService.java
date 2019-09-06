package com.zdjc.springcloud.service;

import java.util.List;

import com.zdjc.springcloud.entity.User;

public interface UserService {
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
}
