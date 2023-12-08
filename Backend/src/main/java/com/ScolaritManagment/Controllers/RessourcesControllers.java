package com.ScolaritManagment.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ScolaritManagment.Services.RessourcesService;
import com.ScolaritManagment.entites.Ressources;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Ressources")
public class RessourcesControllers {
	
	

		 public RessourcesService ressourcesService;

		public RessourcesControllers(RessourcesService ressourcesService) {
			super();
			this.ressourcesService = ressourcesService;
		}
		 
		@GetMapping("/all")
		public ResponseEntity <List <Ressources> > getAllProfesseur(){
		    
			List<Ressources> ressources=ressourcesService.findAllRessources();
			return  new ResponseEntity <> (ressources,HttpStatus.OK);
		}
		
		@PostMapping("/add")
		public ResponseEntity <Ressources> addRessourceById(@RequestBody Ressources ressources){
		    
			Ressources newRessources=ressourcesService.addRessources(ressources);
			return  new ResponseEntity <> (newRessources,HttpStatus.CREATED);
		}

		@PutMapping("/update")
		public ResponseEntity <Ressources> updateRessourceById(@RequestBody Ressources ressource){
		    
			Ressources updatedRessource=ressourcesService.updateRessources(ressource);
			return  new ResponseEntity <> (updatedRessource,HttpStatus.OK);
		}

		@DeleteMapping("/delete/{id}")
		public ResponseEntity <?> deleteRessourcesById(@PathVariable("id")  Long id){
		    
			ressourcesService.deleteRessourcesById(id);
			return  new ResponseEntity <> (HttpStatus.OK);
		}
		
		@GetMapping("/find/{id}")
		public ResponseEntity <Ressources> getRessourcesById(@PathVariable("id") Long id){
		    
			Ressources ressource=ressourcesService.findRessourcesById(id);
			return  new ResponseEntity <> (ressource,HttpStatus.OK);
		}
}
