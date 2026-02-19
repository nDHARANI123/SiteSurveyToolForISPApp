package com.sstapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid", length = 11, nullable = false, unique = true)
	private int id;

	@Column(name = "password", length = 100, nullable = false)
	private String userPass;

	@Column(name = "name", length = 100)
	private String userFullName;

	@Column(name = "email", length = 100)
	private String userEmail;

	@Column(name = "role", length = 100)
	private String userRole;


	// Mapped to Table
	@ManyToOne
	private Organization organization;


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	public String getUserFullName() {
		return userFullName;
	}


	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}


	public Organization getOrganization() {
		return organization;
	}


	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	
	

}
