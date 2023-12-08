package com.ScolaritManagment.Services;

import org.springframework.stereotype.Service;

import com.ScolaritManagment.Repos.ReposLogin;
import com.ScolaritManagment.entites.Login;

@Service
public class loginService {

	private ReposLogin reposLogin;
	
	
	
	public loginService(ReposLogin reposLogin) {
		super();
		this.reposLogin = reposLogin;
	}



	public Login login(String nom ,String password) {
		Login user=reposLogin.findByNomAndPassword(nom, password);
				return user;
		
	}
	
	
}
