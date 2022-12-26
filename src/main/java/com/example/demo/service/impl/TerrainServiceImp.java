package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Terrain;
import com.example.demo.repository.TerrainRepository;
import com.example.demo.service.TerrainService;

@Service

public class TerrainServiceImp implements TerrainService {

	@Autowired
	TerrainRepository ter;
	
	@Override
	public Terrain createTer(Terrain terrainRequest) {
		terrainRequest.setNom("dd");
	Terrain newT = ter.save(terrainRequest);
		
		return newT;
	}

}
