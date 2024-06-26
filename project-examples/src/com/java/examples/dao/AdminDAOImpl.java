package com.java.examples.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.examples.model.Admin;
import com.java.examples.model.User;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public List<Admin> listAll(){
		List<Admin> list = new ArrayList<>();
		Admin admin = new Admin();
		admin.setId(1);
		admin.setName("Bruno");
		
		list.add(admin);
		
		admin = new Admin();
		admin.setId(2);
		admin.setName("Ricardo");
		
		list.add(admin);
		
		return list;
	}
	
	@Override
	public Admin readById(int id) {
		// logic
		return null;
	}
	
	@Override
	public void create(Admin admin) {
		System.out.println("Administrator "+ admin.getName() + " created");
	}
	
	@Override
	public void update(Admin admin) {
		System.out.println("Administrator "+ admin.getName() + " updated");
	}
	
	@Override
	public void delete (int id) {
		System.out.println("ID "+ id + " deleted");
	}

	@Override
	public List<User> readAccount() {
		// TODO Auto-generated method stub
		return null;
	}
}
