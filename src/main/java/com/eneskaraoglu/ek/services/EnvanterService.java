package com.eneskaraoglu.ek.services;

import java.util.List;

import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;

public interface EnvanterService {

	List<Depo> findAllDepo();
	List<DepoEnvanter> findAllDepoEnvanter();
	List<Envanter> findAllEnvanter();
	List<EnvanterGiris> findAllEnvanterGiris();
	List<EnvanterCikis> findAllEnvanterCikis();
	List<EnvanterLog> findAllEnvanterLog();
	List<Katalog> findAllKatalog();
	List<KatalogEnvanter> findAllKatalogEnvanter();
	
	Depo findByIDDepo(int theId);
	DepoEnvanter findByIDDepoEnvanter(int theId);
	Envanter findByIDEnvanter(int theId);
	EnvanterGiris findByIDEnvanterGiris(int theId);
	EnvanterCikis findByIDEnvanterCikis(int theId);
	EnvanterLog findByIDEnvanterLog(int theId);
	Katalog findByIDKatalog(int theId);
	KatalogEnvanter findByIDKatalogEnvanter(int theId);
}
