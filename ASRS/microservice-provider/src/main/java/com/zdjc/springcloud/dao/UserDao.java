package com.zdjc.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zdjc.springcloud.entity.User;

/**
 * @ClassName:     UserDao.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午11:16:11 
 */
@Mapper
public interface UserDao {
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
}
