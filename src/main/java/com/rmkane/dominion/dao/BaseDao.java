package com.rmkane.dominion.dao;

import java.util.List;

import com.rmkane.dominion.domain.DomainEntity;

public interface BaseDao<T extends DomainEntity> {
	public T retrieve(Long id);

	public T insert(T object);

	public T update(T object);

	public void delete(T object);

	public List<T> retrieveAll();
}
