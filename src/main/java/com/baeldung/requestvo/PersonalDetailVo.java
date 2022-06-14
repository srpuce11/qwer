package com.baeldung.requestvo;

public class PersonalDetailVo {
	private String name;
	private String fname;
	private String email;
	private String phone;
	private String gender;
	private String maritial;
	private String goverment;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "PersonalDetailVo [name=" + name + ", fname=" + fname + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", maritial=" + maritial + ", goverment=" + goverment + ", password="
				+ password + "]";
	}
	
	
	

}
