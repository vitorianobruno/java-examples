package com.java.examples.dao;

import java.util.List;

public interface CRUD<T> {

	List<T> listAll();
	T readById(int id);
	void create(T t);
	void update(T t);
	void delete (int id);
}
