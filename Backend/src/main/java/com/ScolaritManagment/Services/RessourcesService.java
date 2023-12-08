package com.ScolaritManagment.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ScolaritManagment.Repos.ReposRessources;
import com.ScolaritManagment.entites.Ressources;

import jakarta.transaction.Transactional;
@Service

public class RessourcesService {

	private final ReposRessources reposRessources;


	
	public RessourcesService(ReposRessources reposRessources) {
		super();
		this.reposRessources = reposRessources;
	}

	public Ressources addRessources(Ressources ressources) {
		ressources.setRessourceCode(UUID.randomUUID().toString());
		
		return reposRessources.save(ressources);
	}

	public Ressources updateRessources(Ressources ressources) {		
		return reposRessources.save(ressources);
	}
	
  public List <Ressources> findAllRessources() {
		
		return reposRessources.findAll();	}
  
	public Ressources findRessourcesById(Long id) {
		
		return reposRessources.findRessourcesById(id);	}
	 
    @Transactional

     public void deleteRessourcesById(Long id) {
		
    	reposRessources.deleteRessourcesById(id);	
    	}
	
}
