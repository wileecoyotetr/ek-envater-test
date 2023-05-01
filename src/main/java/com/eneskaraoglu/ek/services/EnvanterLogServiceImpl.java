package com.eneskaraoglu.ek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eneskaraoglu.ek.dao.EnvanterLogDAO;
import com.eneskaraoglu.ek.entity.EnvanterLog;

@Service
public class EnvanterLogServiceImpl implements EnvanterLogService {
	
	private EnvanterLogDAO dao;
	
	@Autowired
	public EnvanterLogServiceImpl(EnvanterLogDAO theDAO) {
		dao = theDAO;
	}

	@Override
	public List<EnvanterLog> findAll() {
		return dao.findAll();
	}

	@Override
	public EnvanterLog findByID(int theId) {
		return dao.findByID(theId);
	}
	
}
