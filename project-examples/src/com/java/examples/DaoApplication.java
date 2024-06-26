package com.java.examples;

import com.java.examples.dao.CRUD;
import com.java.examples.dao.UserDAO;
import com.java.examples.dao.UserDAOImpl;
import com.java.examples.model.User;

import java.util.List;

public class DaoApplication {

    public static void main(String[] args) {

        CRUD<User> dao = new UserDAOImpl();
        dao.listAll().forEach(x -> System.out.println(x.getName()));

        UserDAO dao2 = new UserDAOImpl();
        List<String> list = dao2.listAll().stream().map(User::getName).toList();

        list.forEach(System.out::println);

    }

}
