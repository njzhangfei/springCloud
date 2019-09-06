package com.zdjc.springcloud.entity;
/**
 * @ClassName:     User.java
 * @Description:   TODO 简单一个用户实例
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午8:52:52 
 */
public class User {
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id:" + id + ", name:" + name + ", age:" + age + ", gender:" + gender + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
