package com.ScolaritManagment.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ScolaritManagment.entites.User;


public interface ReposUser extends JpaRepository<User,Long>{
	  void deleteUserById(Long id);
	  User findUserById (Long id);

}
