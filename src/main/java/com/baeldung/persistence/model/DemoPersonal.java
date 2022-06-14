package com.baeldung.persistence.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DemoPersonal")
public class DemoPersonal implements Serializable {
	/**
	 * 
	 */
 	private static final long serialVersionUID = 1L;
     
 	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 	
	private String name;
	private String fname;
	private String email;
	private String phone;
	private String gender;
	private String maritial;
	private String goverment;
	
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
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritial() {
		return maritial;
	}
	public void setMaritial(String maritial) {
		this.maritial = maritial;
	}
	public String getGoverment() {
		return goverment;
	}
	public void setGoverment(String goverment) {
		this.goverment = goverment;
	}
	@Override
	public String toString() {
		return "DemoPersonal [name=" + name + ", fname=" + fname + ", email=" + email + ", phone=" + phone + ", gender="
				+ gender + ", maritial=" + maritial + ", goverment=" + goverment + "]";
	}
	
	
}
