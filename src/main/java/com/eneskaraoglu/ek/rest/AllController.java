package com.eneskaraoglu.ek.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eneskaraoglu.ek.dao.AllDAO;
import com.eneskaraoglu.ek.dao.KatalogDAO;
import com.eneskaraoglu.ek.entity.Katalog;
import com.eneskaraoglu.ek.entity.KatalogEnvanter;
import com.eneskaraoglu.ek.services.AllService;
import com.eneskaraoglu.ek.entity.Depo;
import com.eneskaraoglu.ek.entity.DepoEnvanter;
import com.eneskaraoglu.ek.entity.Envanter;
import com.eneskaraoglu.ek.entity.EnvanterCikis;
import com.eneskaraoglu.ek.entity.EnvanterGiris;
import com.eneskaraoglu.ek.entity.EnvanterLog;

@RestController
@RequestMapping("/api")
public class AllController {
	
	private AllService envanterService;
	
	public AllController(AllService theEnvanterService) {
		envanterService = theEnvanterService;
	}
	
	@GetMapping("/depolar")
	public List<Depo> findAllDepo(){
		return envanterService.findAllDepo();
	}
	
	@GetMapping("/depo_envanterler")
	public List<DepoEnvanter> findAllDepoEnvanter(){
		return envanterService.findAllDepoEnvanter();
	}
	
	@GetMapping("/envanterler")
	public List<Envanter> findAllEnvanter(){
		return envanterService.findAllEnvanter();
	}
	
	@GetMapping("/envanter_girisler")
	public List<EnvanterGiris> findAllEnvanterGiris(){
		return envanterService.findAllEnvanterGiris();
	}
	
	@GetMapping("/envanter_cikislar")
	public List<EnvanterCikis> findAllEnvanterCikis(){
		return envanterService.findAllEnvanterCikis();
	}
	
	@GetMapping("/envanter_loglar")
	public List<EnvanterLog> findAllEnvanterLog(){
		return envanterService.findAllEnvanterLog();
	}
	
	@GetMapping("/kataloglar")
	public List<Katalog> findAllKatalog(){
		return envanterService.findAllKatalog();
	}
	
	@GetMapping("/katalog_envanterler")
	public List<KatalogEnvanter> findAllKatalogEnvanter(){
		return envanterService.findAllKatalogEnvanter();
	}


}
