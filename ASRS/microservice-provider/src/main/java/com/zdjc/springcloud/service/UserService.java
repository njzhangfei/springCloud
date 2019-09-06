package com.zdjc.springcloud.service;

import java.util.List;

import com.zdjc.springcloud.entity.User;

/**
 * @ClassName:     ConsumerApplication.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午11:18:19 
 */
public interface UserService {
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
}
