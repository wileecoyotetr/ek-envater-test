package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class KatalogEnvanterDAOJpaImpl implements KatalogEnvanterDAO {

	private EntityManager entityManager;
	
	@Autowired
	public KatalogEnvanterDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<KatalogEnvanter> findAll() {
		TypedQuery<KatalogEnvanter> theQuery = entityManager.createQuery(" from KatalogEnvanter", KatalogEnvanter.class);
		List<KatalogEnvanter> result = theQuery.getResultList();
		return result;
	}

	@Override
	public KatalogEnvanter findByID(int theId) {
		KatalogEnvanter result = entityManager.find(KatalogEnvanter.class,theId );
		return result;
	}
	


}
