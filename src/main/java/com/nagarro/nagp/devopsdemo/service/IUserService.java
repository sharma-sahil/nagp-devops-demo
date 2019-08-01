package com.nagarro.nagp.devopsdemo.service;

import java.util.List;

import com.nagarro.nagp.devopsdemo.entity.User;

/**
 * The Interface IUserService.
 *
 * @author sahilsharma
 */
public interface IUserService {

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	List<User> getUsers();

}