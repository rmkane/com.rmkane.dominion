package com.rmkane.dominion.manager;

import com.rmkane.dominion.domain.User;

public interface UserManager extends DomainEntityManager<User> {

	public User retrieveUserByUsername(String username);
	
	public void deleteUserByUsername(String username);

	public void resetAutoIncrement();
}
