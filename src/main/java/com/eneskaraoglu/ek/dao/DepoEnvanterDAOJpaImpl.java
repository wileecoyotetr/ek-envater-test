package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class DepoEnvanterDAOJpaImpl implements DepoEnvanterDAO {

	private EntityManager entityManager;
	
	@Autowired
	public DepoEnvanterDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<DepoEnvanter> findAll() {
		TypedQuery<DepoEnvanter> theQuery = entityManager.createQuery(" from DepoEnvanter",DepoEnvanter.class);
		List<DepoEnvanter> result = theQuery.getResultList();
		return result;
	}

	@Override
	public DepoEnvanter findByID(int theId) {
		DepoEnvanter result = entityManager.find(DepoEnvanter.class,theId );
		return result;
	}



}
