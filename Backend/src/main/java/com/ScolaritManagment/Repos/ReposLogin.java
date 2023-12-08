package com.ScolaritManagment.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ScolaritManagment.entites.Login;



@Repository

public interface ReposLogin  extends JpaRepository<Login,Long>{

	
    Login findByNomAndPassword(String nom, String password);
}
