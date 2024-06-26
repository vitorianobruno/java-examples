package com.java.examples.dao;

import java.util.List;

import com.java.examples.model.Admin;
import com.java.examples.model.User;

public interface AdminDAO extends CRUD<Admin>{
	
	List<User> readAccount();
}
