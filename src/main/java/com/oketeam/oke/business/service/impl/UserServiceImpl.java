package com.oketeam.oke.business.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oketeam.oke.business.service.UserService;
import com.oketeam.oke.persistence.dao.UserDAO;
import com.oketeam.oke.persistence.entity.User;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void createUser(User user) {
		userDAO.createUser(user);
	}

}
