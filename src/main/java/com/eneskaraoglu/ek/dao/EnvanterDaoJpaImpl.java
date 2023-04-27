package com.eneskaraoglu.ek.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eneskaraoglu.ek.entity.Urun;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EnvanterDaoJpaImpl implements EnvanterDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EnvanterDaoJpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Urun> findAll() {

		TypedQuery<Urun> theQuery = entityManager.createQuery(" from Urun", Urun.class);
		List<Urun> urunler = theQuery.getResultList();
		return urunler;
	}

}
