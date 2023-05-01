package com.eneskaraoglu.ek.dao;

import java.util.List;

import com.eneskaraoglu.ek.entity.EnvanterLog;

public interface EnvanterLogDAO {
	
	List<EnvanterLog> findAll();
	EnvanterLog findByID(int theId);

}
