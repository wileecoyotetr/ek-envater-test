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
public class EnvanterLogDAOjpaImpl implements EnvanterLogDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EnvanterLogDAOjpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<EnvanterLog> findAll() {
		TypedQuery<EnvanterLog> theQuery = entityManager.createQuery(" from EnvanterLog", EnvanterLog.class);
		List<EnvanterLog> result = theQuery.getResultList();
		return result;
	}

	@Override
	public EnvanterLog findByID(int theId) {
		EnvanterLog result = entityManager.find(EnvanterLog.class,theId );
		return result;
	}

	


}
