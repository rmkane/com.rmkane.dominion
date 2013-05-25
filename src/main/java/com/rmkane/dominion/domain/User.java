package com.rmkane.dominion.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(
		name = User.FIND_USER_BY_USERNAME,
		query = "from User where username = :username"),
	@NamedQuery(
		name = User.FIND_ALL_USERS,
		query = "from User")
})
@Entity
@Table(name = "USER")
public class User extends DomainEntity {

	private static final long serialVersionUID = -8225710766187768402L;
	public static final String FIND_USER_BY_USERNAME = "findUserByUsername";
	public static final String FIND_ALL_USERS = "findAllUsers";
	
	public User() { }

	public User(String username, String name) {
		setUsername(username);
		setName(name);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", length = 11, nullable = false)
	private Long id;

	@Basic
	@Column(name = "USERNAME", length = 32, unique = true, nullable = false)
	private String username;

	@Basic
	@Column(name = "NAME", length = 64, nullable = false)
	private String name;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}