package com.rmkane.dominion.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rmkane.dominion.dao.UserDao;
import com.rmkane.dominion.domain.User;
import com.rmkane.dominion.manager.UserManager;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDao userDao;

	@Transactional
	public User retrieveUserByUsername(String username) {
		return userDao.retrieveUserByUsername(username);
	}
	
	@Transactional
	public void deleteUserByUsername(String username) {
		userDao.deleteUserByUsername(username);
	}

	@Transactional
	public void resetAutoIncrement() {
		userDao.resetAutoIncrement();
	}

	public User retrieve(Long id) {
		return userDao.retrieve(id);
	}

	public User insert(User user) {
		return userDao.insert(user);
	}

	public User update(User user) {
		return userDao.update(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}

	public List<User> retrieveAll() {
		return userDao.retrieveAll();
	}
}
