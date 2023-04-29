package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Envanter;

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

		TypedQuery<Envanter> theQuery = entityManager.createQuery(" from Urun", Envanter.class);
		List<Envanter> urunler = theQuery.getResultList();
		return urunler;
	}

}
