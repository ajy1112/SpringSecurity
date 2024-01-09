package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.User;

@Service
public class UserService {

	private List<User> list=new ArrayList<User>();

	public UserService() {
		list.add(new User(1, "Ajay", "ajay@gmail.com"));
		list.add(new User(2, "Shubham", "Shubham@gmail.com"));
		list.add(new User(1, "Vikas", "Vikas@gmail.com"));
		list.add(new User(1, "Digvijay", "Digvijay@gmail.com"));
		
	}
	
	public List<User> getUser(){
		return this.list;
	}
	
	
}
