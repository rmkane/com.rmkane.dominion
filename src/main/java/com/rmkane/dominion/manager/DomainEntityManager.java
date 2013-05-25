package com.rmkane.dominion.manager;

import java.util.List;

import com.rmkane.dominion.domain.DomainEntity;

public interface DomainEntityManager<T extends DomainEntity> {
	public T retrieve(Long id);

	public T insert(T object);

	public T update(T object);

	public void delete(T object);

	public List<T> retrieveAll();
}
