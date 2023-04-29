package com.eneskaraoglu.ek.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eneskaraoglu.ek.dao.EnvanterDAO;
import com.eneskaraoglu.ek.dao.KatalogDAO;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.Envanter;

@RestController
@RequestMapping("/api")
public class UrunController {
	
	private EnvanterDAO envanterDAO;
	private KatalogDAO katalogDAO;
	
	
	public UrunController(EnvanterDAO theEnvanterDAO, KatalogDAO theKatalogDAO) {
		envanterDAO = theEnvanterDAO;
		katalogDAO = theKatalogDAO;
	}
	
	
	@GetMapping("/urunler")
	public List<Envanter> findAllUrunler(){
		return envanterDAO.findAll();
	}
	
	
	@GetMapping("/kataloglar")
	public List<Katalog> findAllKatalog(){
		return katalogDAO.findAll();
	}


}
