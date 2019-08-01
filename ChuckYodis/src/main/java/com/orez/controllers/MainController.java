package com.orez.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orez.pojos.ChackYodaFacts;
import com.orez.services.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService service;
	
	
	@RequestMapping(method=RequestMethod.GET ,value = "/getChackYodaFact" )
	public ChackYodaFacts getChackYodaFact () {
		
		
		return this.service.getChuckNorrisRundom();
	}

	@RequestMapping(method=RequestMethod.GET ,value = "/facts" )
	public List<ChackYodaFacts> getFacts () {
		
		
		return this.service.getFacts();
	}
}
