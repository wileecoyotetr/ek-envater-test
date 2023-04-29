package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.Envanter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class KatalogDAOJpaImpl implements KatalogDAO {

	private EntityManager entityManager;
	
	@Autowired
	public KatalogDAOJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Katalog> findAll() {

		TypedQuery<Katalog> theQuery = entityManager.createQuery(" from Katalog", Katalog.class);
		List<Katalog> kataloglar = theQuery.getResultList();
		return kataloglar;
	}

}
