package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Terrain;
import com.example.demo.service.TerrainService;

@RestController
@RequestMapping("/terrain")

public class TerrainController {
	
	@Autowired
	TerrainService ter;
	
	@PostMapping
	public  ResponseEntity<Terrain> createEmploye(@RequestBody Terrain terrainRequest) {

		

		Terrain terrainRes = ter.createTer(terrainRequest);
		

		return new ResponseEntity<Terrain>(terrainRes,HttpStatus.CREATED);
	}

}
