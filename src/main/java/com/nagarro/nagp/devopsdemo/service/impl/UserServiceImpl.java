package com.nagarro.nagp.devopsdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.nagp.devopsdemo.entity.User;
import com.nagarro.nagp.devopsdemo.service.IUserService;

/**
 * The Class UserServiceImpl.
 *
 * @author sahilsharma
 */
@Service
public class UserServiceImpl implements IUserService {

	@Override
	public List<User> getUsers() {
		User u1 = new User("Sahil", "Sharma", "India");
		User u2 = new User("Ravi", "Sharma", "India");
		User u3 = new User("Sunny", "Goel", "India");
		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);

		return users;
	}

}
