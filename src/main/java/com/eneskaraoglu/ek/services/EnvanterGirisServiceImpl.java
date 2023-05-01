package com.eneskaraoglu.ek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eneskaraoglu.ek.dao.AllDAO;
import com.eneskaraoglu.ek.dao.DepoDAO;
import com.eneskaraoglu.ek.dao.DepoEnvanterDAO;
import com.eneskaraoglu.ek.dao.EnvanterCikisDAO;
import com.eneskaraoglu.ek.dao.EnvanterGirisDAO;
import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

@Service
public class EnvanterGirisServiceImpl implements EnvanterGirisService {
	
	private EnvanterGirisDAO dao;
	
	@Autowired
	public EnvanterGirisServiceImpl(EnvanterGirisDAO theDAO) {
		dao = theDAO;
	}

	@Override
	public List<EnvanterGiris> findAll() {
		return dao.findAll();
	}

	@Override
	public EnvanterGiris findByID(int theId) {
		return dao.findByID(theId);
	}
	
}
