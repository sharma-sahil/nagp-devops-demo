package com.nagarro.nagp.devopsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.devopsdemo.entity.User;
import com.nagarro.nagp.devopsdemo.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping()
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
	}

}
