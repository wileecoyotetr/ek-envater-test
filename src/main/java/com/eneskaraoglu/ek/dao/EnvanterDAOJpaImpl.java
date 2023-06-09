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
public class EnvanterDAOJpaImpl implements EnvanterDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EnvanterDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Envanter> findAll() {
		TypedQuery<Envanter> theQuery = entityManager.createQuery(" from Envanter", Envanter.class);
		List<Envanter> urunler = theQuery.getResultList();
		return urunler;
	}

	@Override
	public Envanter findByID(int theId) {
		Envanter result = entityManager.find(Envanter.class,theId );
		return result;
	}




}
