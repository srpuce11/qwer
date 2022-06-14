package com.baeldung.persistence.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "masterDB")
public class MasterDB  implements Serializable {

	private static final long serialVersionUID = -1879899657025244606L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_id")
	private Long roleId;

	@Column(name = "person_name")
	private String personName;
	
	@Column(name = "person_designation")
	private String personDesignation;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "address")
	private String address;

	@Column(name = "village")
	private String village;
	
	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "created_date", updatable = false)
	private LocalDateTime createdDate;

	@Column(name = "modify_date")
	private LocalDateTime modifyDate;

	@Column(name = "create_by")
	private String createBy;

	@Column(name = "modify_by")
	private String modifyBy;


	@Column(name = "username")
	private String username;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "education_qualification")
	private String educationQualification;
	
	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "marital_village")
	private String maritalVillage;
	
	@Column(name = "marital_gotra")
	private String maritalGotra;

	@Column(name = "religion")
	private String religion;

	@Column(name = "anniversary_date")
	private Date anniversarydate;

	@Column(name = "emergency_contact_no")
	private String emergencyContactNo;

	@Column(name = "aadhar_card_number")
	private String aadharCardNumber;

	@Column(name = "driving_licence_number")
	private String drivingLicenceNumber;

	@Column(name = "passport_number")
	private String passportNumber;

	@Column(name = "pan_number")
	private String panNumber;

	@Column(name = "generatedOtp")
	private String generatedOtp;

	@Column(name = "password")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonDesignation() {
		return personDesignation;
	}

	public void setPersonDesignation(String personDesignation) {
		this.personDesignation = personDesignation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalVillage() {
		return maritalVillage;
	}

	public void setMaritalVillage(String maritalVillage) {
		this.maritalVillage = maritalVillage;
	}

	public String getMaritalGotra() {
		return maritalGotra;
	}

	public void setMaritalGotra(String maritalGotra) {
		this.maritalGotra = maritalGotra;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getAnniversarydate() {
		return anniversarydate;
	}

	public void setAnniversarydate(Date anniversarydate) {
		this.anniversarydate = anniversarydate;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}

	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getGeneratedOtp() {
		return generatedOtp;
	}

	public void setGeneratedOtp(String generatedOtp) {
		this.generatedOtp = generatedOtp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	@Override
	public String toString() {
		return "MasterDB [id=" + id + ", roleId=" + roleId + ", personName=" + personName + ", personDesignation="
				+ personDesignation + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", fatherName=" + fatherName
				+ ", address=" + address + ", village=" + village + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + ", occupation=" + occupation + ", dateOfBirth=" + dateOfBirth
				+ ", createdDate=" + createdDate + ", modifyDate=" + modifyDate + ", createBy=" + createBy
				+ ", modifyBy=" + modifyBy + ", username=" + username + ", nickname=" + nickname + ", gender=" + gender
				+ ", educationQualification=" + educationQualification + ", bloodGroup=" + bloodGroup + ", nationality="
				+ nationality + ", maritalStatus=" + maritalStatus + ", maritalVillage=" + maritalVillage
				+ ", maritalGotra=" + maritalGotra + ", religion=" + religion + ", anniversarydate=" + anniversarydate
				+ ", emergencyContactNo=" + emergencyContactNo + ", aadharCardNumber=" + aadharCardNumber
				+ ", drivingLicenceNumber=" + drivingLicenceNumber + ", passportNumber=" + passportNumber
				+ ", panNumber=" + panNumber + ", generatedOtp=" + generatedOtp + ", password=" + password + "]";
	}
	
	
	
}
