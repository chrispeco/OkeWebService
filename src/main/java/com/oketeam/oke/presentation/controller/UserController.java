package com.oketeam.oke.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oketeam.oke.business.service.UserService;
import com.oketeam.oke.persistence.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
}