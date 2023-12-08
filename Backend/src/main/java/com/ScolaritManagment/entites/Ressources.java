package com.ScolaritManagment.entites;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ressources {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable=false,updatable=false)
	private Long id;
	private String titre;
	private String description;
    private String lien;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateCreaction;
	@Column(nullable=false, updatable=false)
	private String RessourceCode;
	
	
	public Ressources() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ressources(Long id, String titre, String description, String lien, String dateCreaction,
			String ressourceCode) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.lien = lien;
		this.dateCreaction = dateCreaction;
		RessourceCode = ressourceCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getDateCreaction() {
		return dateCreaction;
	}
	public void setDateCreaction(String dateCreaction) {
		this.dateCreaction = dateCreaction;
	}
	public String getRessourceCode() {
		return RessourceCode;
	}
	public void setRessourceCode(String ressourceCode) {
		RessourceCode = ressourceCode;
	}
	@Override
	public String toString() {
		return "Ressources [id=" + id + ", titre=" + titre + ", description=" + description + ", lien=" + lien
				+ ", dateCreaction=" + dateCreaction + ", RessourceCode=" + RessourceCode + "]";
	}
	
	
	
	
	
}
