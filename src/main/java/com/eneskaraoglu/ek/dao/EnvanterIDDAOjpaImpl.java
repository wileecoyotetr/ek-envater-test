package com.eneskaraoglu.ek.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

import jakarta.persistence.EntityManager;

public class EnvanterIDDAOjpaImpl implements EnvanterIDDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EnvanterIDDAOjpaImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	
	@Override
	public Depo findByIDDepo(int theId) {
		Depo result = entityManager.find(Depo.class,theId );
		return result;
	}

	@Override
	public DepoEnvanter findByIDDepoEnvanter(int theId) {
		DepoEnvanter result = entityManager.find(DepoEnvanter.class,theId );
		return result;
	}

	@Override
	public Envanter findByIDEnvanter(int theId) {
		Envanter result = entityManager.find(Envanter.class,theId );
		return result;
	}

	@Override
	public EnvanterGiris findByIDEnvanterGiris(int theId) {
		EnvanterGiris result = entityManager.find(EnvanterGiris.class,theId );
		return result;
	}

	@Override
	public EnvanterCikis findByIDEnvanterCikis(int theId) {
		EnvanterCikis result = entityManager.find(EnvanterCikis.class,theId );
		return result;
	}

	@Override
	public EnvanterLog findByIDEnvanterLog(int theId) {
		EnvanterLog result = entityManager.find(EnvanterLog.class,theId );
		return result;
	}

	@Override
	public Katalog findByIDKatalog(int theId) {
		Katalog result = entityManager.find(Katalog.class,theId );
		return result;
	}

	@Override
	public KatalogEnvanter findByIDKatalogEnvanter(int theId) {
		KatalogEnvanter result = entityManager.find(KatalogEnvanter.class,theId );
		return result;
	}



}
