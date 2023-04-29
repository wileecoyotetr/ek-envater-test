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
	public List<Depo> findAllDepo() {
		TypedQuery<Depo> theQuery = entityManager.createQuery(" from Depo", Depo.class);
		List<Depo> result = theQuery.getResultList();
		return result;
	}

	@Override
	public List<DepoEnvanter> findAllDepoEnvanter() {
		TypedQuery<DepoEnvanter> theQuery = entityManager.createQuery(" from DepoEnvanter",DepoEnvanter.class);
		List<DepoEnvanter> result = theQuery.getResultList();
		return result;
	}
	

	@Override
	public List<Envanter> findAllEnvanter() {
		TypedQuery<Envanter> theQuery = entityManager.createQuery(" from Envanter", Envanter.class);
		List<Envanter> urunler = theQuery.getResultList();
		return urunler;
	}

	@Override
	public List<EnvanterGiris> findAllEnvanterGiris() {
		TypedQuery<EnvanterGiris> theQuery = entityManager.createQuery(" from EnvanterGiris",EnvanterGiris.class);
		List<EnvanterGiris> result = theQuery.getResultList();
		return result;
	}

	@Override
	public List<EnvanterCikis> findAllEnvanterCikis() {
		TypedQuery<EnvanterCikis> theQuery = entityManager.createQuery(" from EnvanterCikis",EnvanterCikis.class);
		List<EnvanterCikis> result = theQuery.getResultList();
		return result;
	}

	@Override
	public List<EnvanterLog> findAllEnvanterLog() {
		TypedQuery<EnvanterLog> theQuery = entityManager.createQuery(" from EnvanterLog", EnvanterLog.class);
		List<EnvanterLog> result = theQuery.getResultList();
		return result;
	}

	@Override
	public List<Katalog> findAllKatalog() {
		TypedQuery<Katalog> theQuery = entityManager.createQuery(" from Katalog", Katalog.class);
		List<Katalog> result = theQuery.getResultList();
		return result;
	}

	@Override
	public List<KatalogEnvanter> findAllKatalogEnvanter() {
		TypedQuery<KatalogEnvanter> theQuery = entityManager.createQuery(" from KatalogEnvanter", KatalogEnvanter.class);
		List<KatalogEnvanter> result = theQuery.getResultList();
		return result;
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
