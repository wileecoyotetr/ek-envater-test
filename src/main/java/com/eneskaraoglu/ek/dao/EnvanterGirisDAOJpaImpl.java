package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.EnvanterGiris;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EnvanterGirisDAOJpaImpl implements EnvanterGirisDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EnvanterGirisDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<EnvanterGiris> findAll() {
		TypedQuery<EnvanterGiris> theQuery = entityManager.createQuery(" from EnvanterGiris",EnvanterGiris.class);
		List<EnvanterGiris> result = theQuery.getResultList();
		return result;
	}

	@Override
	public EnvanterGiris findByID(int theId) {
		EnvanterGiris result = entityManager.find(EnvanterGiris.class,theId );
		return result;
	}


}
