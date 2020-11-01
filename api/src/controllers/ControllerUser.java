package controllers;

import java.util.List;

import dao.UserDao;
import models.User;

public class ControllerUser {
	static UserDao daoUser = new UserDao();

	public static List<User> getUsers() {
		List<User> lv = daoUser.findAll();
		return lv;
	}

	public static User getUser(String login) {
		if (login == null)
			return null;

		User u = daoUser.find(login);
		return u;
	}

	public static User login(String login, String password) {
		User u = daoUser.find(login);
		if (u != null && u.getPassword().equals(password))
			return u;
		return null;
	}

	public static boolean createUser(String login, String password, String firstname, String lastname) {
		User u = daoUser.find(login);
		if (u == null) {
			daoUser.create(new User(login, password, firstname, lastname));
			return true;
		}
		return false;
	}

}
