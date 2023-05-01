package com.eneskaraoglu.ek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eneskaraoglu.ek.dao.AllDAO;
import com.eneskaraoglu.ek.dao.DepoDAO;
import com.eneskaraoglu.ek.dao.DepoEnvanterDAO;
import com.eneskaraoglu.ek.dao.EnvanterCikisDAO;
import com.eneskaraoglu.ek.dao.EnvanterDAO;
import com.eneskaraoglu.ek.dao.EnvanterGirisDAO;
import com.eneskaraoglu.ek.dao.EnvanterLogDAO;
import com.eneskaraoglu.ek.dao.KatalogEnvanterDAO;
import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

@Service
public class KatalogEnvanterServiceImpl implements KatalogEnvanterService {
	
	private KatalogEnvanterDAO dao;
	
	@Autowired
	public KatalogEnvanterServiceImpl(KatalogEnvanterDAO theDAO) {
		dao = theDAO;
	}

	@Override
	public List<KatalogEnvanter> findAll() {
		return dao.findAll();
	}

	@Override
	public KatalogEnvanter findByID(int theId) {
		return dao.findByID(theId);
	}
	
}
