package com.hagos.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static int countUser = 4;

	static {
		users.add(new User(1, "Jack", new Date()));
		users.add(new User(2, "HB", new Date()));
		users.add(new User(3, "Abc", new Date()));
		users.add(new User(4, "Hailay", new Date()));

	}

	// find all
	public List<User> findAll() {

		return users;
	}

	// find with id
	public User findOne(int id) {
		for (User user1 : users) {
			if (user1.getId() == id)

				return user1;

		}

		return null;
	}

	//delete
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}

		return null;
	}

	// save
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++countUser);
		}
		users.add(user);

		return user;
	}

}
