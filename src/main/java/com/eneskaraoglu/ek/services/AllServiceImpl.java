package com.eneskaraoglu.ek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eneskaraoglu.ek.dao.AllDAO;
import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

@Service
public class AllServiceImpl implements AllService {
	
	private AllDAO envanterAllDAO;
	
	@Autowired
	public AllServiceImpl(AllDAO theEnvanterAllDAO) {
		envanterAllDAO = theEnvanterAllDAO;
	}

	@Override
	public List<Depo> findAllDepo() {
		return envanterAllDAO.findAllDepo();
	}

	@Override
	public List<DepoEnvanter> findAllDepoEnvanter() {
		return envanterAllDAO.findAllDepoEnvanter();
	}

	@Override
	public List<Envanter> findAllEnvanter() {
		return envanterAllDAO.findAllEnvanter();
	}

	@Override
	public List<EnvanterGiris> findAllEnvanterGiris() {
		return envanterAllDAO.findAllEnvanterGiris();
	}

	@Override
	public List<EnvanterCikis> findAllEnvanterCikis() {
		return envanterAllDAO.findAllEnvanterCikis();
	}

	@Override
	public List<EnvanterLog> findAllEnvanterLog() {
		return envanterAllDAO.findAllEnvanterLog();
	}

	@Override
	public List<Katalog> findAllKatalog() {
		return envanterAllDAO.findAllKatalog();
	}

	@Override
	public List<KatalogEnvanter> findAllKatalogEnvanter() {
		return envanterAllDAO.findAllKatalogEnvanter();
	}

	@Override
	public Depo findByIDDepo(int theId) {
		return envanterAllDAO.findByIDDepo(theId);
	}

	@Override
	public DepoEnvanter findByIDDepoEnvanter(int theId) {
		return envanterAllDAO.findByIDDepoEnvanter(theId);
	}

	@Override
	public Envanter findByIDEnvanter(int theId) {
		return envanterAllDAO.findByIDEnvanter(theId);
	}

	@Override
	public EnvanterGiris findByIDEnvanterGiris(int theId) {
		return envanterAllDAO.findByIDEnvanterGiris(theId);
	}

	@Override
	public EnvanterCikis findByIDEnvanterCikis(int theId) {
		return envanterAllDAO.findByIDEnvanterCikis(theId);
	}

	@Override
	public EnvanterLog findByIDEnvanterLog(int theId) {
		return envanterAllDAO.findByIDEnvanterLog(theId);
	}

	@Override
	public Katalog findByIDKatalog(int theId) {
		return envanterAllDAO.findByIDKatalog(theId);
	}

	@Override
	public KatalogEnvanter findByIDKatalogEnvanter(int theId) {
		return envanterAllDAO.findByIDKatalogEnvanter(theId);
	}

	
}
