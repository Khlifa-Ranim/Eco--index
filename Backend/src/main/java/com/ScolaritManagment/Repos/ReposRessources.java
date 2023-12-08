package com.ScolaritManagment.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ScolaritManagment.entites.Ressources;


public interface ReposRessources  extends JpaRepository<Ressources,Long> {

	  void deleteRessourcesById(Long id);
	  Ressources findRessourcesById (Long id);
	  
}
