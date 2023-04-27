package com.eneskaraoglu.ek.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eneskaraoglu.ek.dao.EnvanterDAO;
import com.eneskaraoglu.ek.entity.Urun;

@RestController
@RequestMapping("/api")
public class UrunController {
	
	private EnvanterDAO envanterDAO;
	
	public UrunController(EnvanterDAO theEnvanterDAO) {
		envanterDAO = theEnvanterDAO;
	}
	
	@GetMapping("/urunler")
	public List<Urun> findAll(){
		return envanterDAO.findAll();
	}

}
