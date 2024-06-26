package com.java.examples.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.examples.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public List<User> listAll(){
		List<User> list = new ArrayList<>();
		User user = new User();
		user.setId(1);
		user.setName("Bruno");
		
		list.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("Ricardo");
		
		list.add(user);
		
		return list;
	}
	
	@Override
	public User readById(int id) {
		// logic
		return null;
	}
	
	@Override
	public void create(User user) {
		System.out.println("User "+ user.getName() + " created");
	}
	
	@Override
	public void update(User user) {
		System.out.println("User "+ user.getName() + " updated");
	}
	
	@Override
	public void delete (int id) {
		System.out.println("ID "+ id + " deleted");
	}
}
