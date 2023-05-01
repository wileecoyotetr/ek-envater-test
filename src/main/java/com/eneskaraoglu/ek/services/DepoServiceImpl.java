package com.eneskaraoglu.ek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eneskaraoglu.ek.dao.AllDAO;
import com.eneskaraoglu.ek.dao.DepoDAO;
import com.eneskaraoglu.ek.dao.DepoEnvanterDAO;
import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

@Service
public class DepoServiceImpl implements DepoService {
	
	private DepoDAO dao;
	
	@Autowired
	public DepoServiceImpl(DepoDAO theDAO) {
		dao = theDAO;
	}

	@Override
	public List<Depo> findAll() {
		return dao.findAll();
	}

	@Override
	public Depo findByID(int theId) {
		return dao.findByID(theId);
	}

	@Transactional
	@Override
	public Depo save(Depo theEntity) {
		return dao.save(theEntity);
	}

	@Transactional
	@Override
	public void deleteByID(int theId) {
		dao.deleteByID(theId);
	}
	
}
