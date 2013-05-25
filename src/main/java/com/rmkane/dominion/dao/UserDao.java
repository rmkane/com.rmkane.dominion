package com.rmkane.dominion.dao;

import com.rmkane.dominion.domain.User;

public interface UserDao extends BaseDao<User> {

	public User retrieveUserByUsername(String username);
	
	public void deleteUserByUsername(String username);

	public void resetAutoIncrement();
}
