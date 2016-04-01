package com.oketeam.oke.persistence.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oketeam.oke.persistence.dao.UserDAO;
import com.oketeam.oke.persistence.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void createUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
	}

}
