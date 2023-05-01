package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Depo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class DepoDAOJpaImpl implements DepoDAO {

	private EntityManager entityManager;
	
	@Autowired
	public DepoDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Depo> findAll() {
		TypedQuery<Depo> theQuery = entityManager.createQuery(" from Depo", Depo.class);
		List<Depo> result = theQuery.getResultList();
		return result;
	}

	@Override
	public Depo findByID(int theId) {
		Depo result = entityManager.find(Depo.class,theId );
		return result;
	}

	@Override
	public Depo save(Depo theEntity) {
		Depo result = entityManager.merge(theEntity);
		return result;
	}

	@Override
	public void deleteByID(int theId) {
		Depo result = entityManager.find(Depo.class,theId );
		entityManager.remove(result);
	}



}
