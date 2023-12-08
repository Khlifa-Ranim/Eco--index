package com.ScolaritManagment.entites;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Login {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable=false,updatable=false)
private Long id;
private String nom;
private String password;

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Login [id=" + id + ", nom=" + nom + ", password=" + password + "]";
}





}
