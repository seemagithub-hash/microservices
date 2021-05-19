package com.sunhome.accountms.model;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;



@Table(name = "users")
@Entity
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	 @Column(name = "userid", nullable = false, length = 100)
	private String userid;
	
	 @Column(name = "password", nullable = false, length = 100)
	private String password;
	 
	 @Column(name = "role", nullable = false, length = 100)
	private String role;
	 
	 @Column(name = "email", nullable = false, length = 100)
	private String email;
	 
	 @Column(name = "phonenumber", nullable = false, length = 100)
	private int phonenumber;
	
	public User() {
		   
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	@Column(name = "userid", nullable = false) 
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setTelephoneNo(int phonenumber) {
		this.phonenumber = phonenumber;
	}
}


