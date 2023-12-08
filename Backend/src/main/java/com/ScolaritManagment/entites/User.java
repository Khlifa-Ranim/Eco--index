package com.ScolaritManagment.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(nullable=false,updatable=false)
		private Long id;
		private String name;
		private String prenom;
		private String email;
		private String password;
		private String imageUrl;
		@Column(nullable=false, updatable=false)
		private String userCode;
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long id, String name, String prenom, String email, String password, String imageUrl,
				String userCode) {
			super();
			this.id = id;
			this.name = name;
			this.prenom = prenom;
			this.email = email;
			this.password = password;
			this.imageUrl = imageUrl;
			this.userCode = userCode;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public String getUserCode() {
			return userCode;
		}
		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", prenom=" + prenom + ", email=" + email + ", password="
					+ password + ", imageUrl=" + imageUrl + ", userCode=" + userCode + "]";
		}
		
       
		
		
		

}
