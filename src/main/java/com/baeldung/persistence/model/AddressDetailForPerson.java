package com.baeldung.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_detail_for_person")
public class AddressDetailForPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6375213399606252263L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "current_address")
	private String currentAddress;
	
	@Column(name = "current_address_1")
	private String currentAddress1;

	@Column(name = "current_address_2")
	private String currentAddress2;
	
	@Column(name = "current_address_3")
	private String currentAddress3;
	
	@Column(name = "current_address_state")
	private String currentAddressState;
	
	@Column(name = "current_address_city")
	private String currentAddressCity;
	

	@Column(name = "current_address_pincode")
	private String currentAddressPincode;
	
	@Column(name = "current_address_landmark")
	private String currentAddressLandMark;
	
	@Column(name = "current_address_location_type")
	private String currentAddressLocationType;
	
	@Column(name = "current_address_residence_status")
	private String currentAddressResidenceStatus;
	
	@Column(name = "current_address_district")
	private String currentAddressDistrict;
	
	@Column(name = "current_address_taluka")
	private String currentAddressTaluka;
	
	@Column(name = "current_address_residence_type")
	private String currentAddressResidenceType;
	
	@Column(name = "current_address_rent_per_month")
	private String currentAddressRentPerMonth;
	
	@Column(name = "current_address_residancal_since")
	private String currentAddressResidancalSince;
	
	// permanent Address
	
	@Column(name = "permanent_address")
	private String permanentAddress;
	
	@Column(name = "permanent_address_1")
	private String permanentAddress1;
	
	@Column(name = "permanent_address_2")
	private String permanentAddress2;
	
	@Column(name = "permanent_address_3")
	private String permanentAddress3;
	
	@Column(name = "permanent_address_state")
	private String permanentAddressState;
	
	@Column(name = "permanent_address_city")
	private String permanentAddressCity;
	
	
	@Column(name = "permanent_address_pincode")
	private String permanentAddressPincode;
	
	@Column(name = "permanent_address_landmark")
	private String permanentAddressLandMark;
	
	@Column(name = "permanent_address_location_type")
	private String permanentAddressLocationType;
	
	@Column(name = "permanent_address_residence_status")
	private String permanentAddressResidenceStatus;
	
	@Column(name = "permanent_address_district")
	private String permanentAddressDistrict;
	
	@Column(name = "permanent_address_taluka")
	private String permanentAddressTaluka;
	
	@Column(name = "permanent_address_residence_type")
	private String permanentAddressResidenceType;
	
	@Column(name = "permanent_address_rent_per_month")
	private String permanentAddressRentPerMonth;
	
	@Column(name = "permanent_address_residancal_since")
	private String permanentAddressResidancalSince;
	
	// Office Address
	
	@Column(name = "office_address")
	private String officeAddress;
	
	@Column(name = "office_address_1")
	private String officeAddress1;
	
	@Column(name = "office_address_2")
	private String officeAddress2;
	
	@Column(name = "office_address_3")
	private String officeAddress3;
	
	@Column(name = "office_address_state")
	private String officeAddressState;
	
	@Column(name = "office_address_City")
	private String officeAddressCity;
	
	@Column(name = "office_address_pincode")
	private String officeAddressPincode;
	
	@Column(name = "office_address_landmark")
	private String officeAddressLandMark;
	
	@Column(name = "office_address_location_type")
	private String officeAddressLocationType;
	
	
	@Column(name = "office_address_district")
	private String officeAddressDistrict;
	
	@Column(name = "office_address_taluka")
	private String officeAddressTaluka;
	
	@Column(name = "office_address_residence_type")
	private String officeAddressResidenceType;
	
	@Column(name = "office_address_rent_per_month")
	private String officeAddressRentPerMonth;
	
	@Column(name = "office_address_residancal_since")
	private String officeAddressResidancalSince;
	
	
	@Column(name = "customer_id")
	private Long customerId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCurrentAddress() {
		return currentAddress;
	}


	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}


	public String getCurrentAddress1() {
		return currentAddress1;
	}


	public void setCurrentAddress1(String currentAddress1) {
		this.currentAddress1 = currentAddress1;
	}


	public String getCurrentAddress2() {
		return currentAddress2;
	}


	public void setCurrentAddress2(String currentAddress2) {
		this.currentAddress2 = currentAddress2;
	}


	public String getCurrentAddress3() {
		return currentAddress3;
	}


	public void setCurrentAddress3(String currentAddress3) {
		this.currentAddress3 = currentAddress3;
	}


	public String getCurrentAddressState() {
		return currentAddressState;
	}


	public void setCurrentAddressState(String currentAddressState) {
		this.currentAddressState = currentAddressState;
	}


	public String getCurrentAddressCity() {
		return currentAddressCity;
	}


	public void setCurrentAddressCity(String currentAddressCity) {
		this.currentAddressCity = currentAddressCity;
	}


	public String getCurrentAddressPincode() {
		return currentAddressPincode;
	}


	public void setCurrentAddressPincode(String currentAddressPincode) {
		this.currentAddressPincode = currentAddressPincode;
	}


	public String getCurrentAddressLandMark() {
		return currentAddressLandMark;
	}


	public void setCurrentAddressLandMark(String currentAddressLandMark) {
		this.currentAddressLandMark = currentAddressLandMark;
	}


	public String getCurrentAddressLocationType() {
		return currentAddressLocationType;
	}


	public void setCurrentAddressLocationType(String currentAddressLocationType) {
		this.currentAddressLocationType = currentAddressLocationType;
	}


	public String getCurrentAddressResidenceStatus() {
		return currentAddressResidenceStatus;
	}


	public void setCurrentAddressResidenceStatus(String currentAddressResidenceStatus) {
		this.currentAddressResidenceStatus = currentAddressResidenceStatus;
	}


	public String getCurrentAddressDistrict() {
		return currentAddressDistrict;
	}


	public void setCurrentAddressDistrict(String currentAddressDistrict) {
		this.currentAddressDistrict = currentAddressDistrict;
	}


	public String getCurrentAddressTaluka() {
		return currentAddressTaluka;
	}


	public void setCurrentAddressTaluka(String currentAddressTaluka) {
		this.currentAddressTaluka = currentAddressTaluka;
	}


	public String getCurrentAddressResidenceType() {
		return currentAddressResidenceType;
	}


	public void setCurrentAddressResidenceType(String currentAddressResidenceType) {
		this.currentAddressResidenceType = currentAddressResidenceType;
	}


	public String getCurrentAddressRentPerMonth() {
		return currentAddressRentPerMonth;
	}


	public void setCurrentAddressRentPerMonth(String currentAddressRentPerMonth) {
		this.currentAddressRentPerMonth = currentAddressRentPerMonth;
	}


	public String getCurrentAddressResidancalSince() {
		return currentAddressResidancalSince;
	}


	public void setCurrentAddressResidancalSince(String currentAddressResidancalSince) {
		this.currentAddressResidancalSince = currentAddressResidancalSince;
	}


	public String getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	public String getPermanentAddress1() {
		return permanentAddress1;
	}


	public void setPermanentAddress1(String permanentAddress1) {
		this.permanentAddress1 = permanentAddress1;
	}


	public String getPermanentAddress2() {
		return permanentAddress2;
	}


	public void setPermanentAddress2(String permanentAddress2) {
		this.permanentAddress2 = permanentAddress2;
	}


	public String getPermanentAddress3() {
		return permanentAddress3;
	}


	public void setPermanentAddress3(String permanentAddress3) {
		this.permanentAddress3 = permanentAddress3;
	}


	public String getPermanentAddressState() {
		return permanentAddressState;
	}


	public void setPermanentAddressState(String permanentAddressState) {
		this.permanentAddressState = permanentAddressState;
	}


	public String getPermanentAddressCity() {
		return permanentAddressCity;
	}


	public void setPermanentAddressCity(String permanentAddressCity) {
		this.permanentAddressCity = permanentAddressCity;
	}


	public String getPermanentAddressPincode() {
		return permanentAddressPincode;
	}


	public void setPermanentAddressPincode(String permanentAddressPincode) {
		this.permanentAddressPincode = permanentAddressPincode;
	}


	public String getPermanentAddressLandMark() {
		return permanentAddressLandMark;
	}


	public void setPermanentAddressLandMark(String permanentAddressLandMark) {
		this.permanentAddressLandMark = permanentAddressLandMark;
	}


	public String getPermanentAddressResidenceStatus() {
		return permanentAddressResidenceStatus;
	}


	public void setPermanentAddressResidenceStatus(String permanentAddressResidenceStatus) {
		this.permanentAddressResidenceStatus = permanentAddressResidenceStatus;
	}


	public String getPermanentAddressDistrict() {
		return permanentAddressDistrict;
	}


	public void setPermanentAddressDistrict(String permanentAddressDistrict) {
		this.permanentAddressDistrict = permanentAddressDistrict;
	}


	public String getPermanentAddressTaluka() {
		return permanentAddressTaluka;
	}


	public void setPermanentAddressTaluka(String permanentAddressTaluka) {
		this.permanentAddressTaluka = permanentAddressTaluka;
	}


	public String getPermanentAddressResidenceType() {
		return permanentAddressResidenceType;
	}


	public void setPermanentAddressResidenceType(String permanentAddressResidenceType) {
		this.permanentAddressResidenceType = permanentAddressResidenceType;
	}


	public String getPermanentAddressRentPerMonth() {
		return permanentAddressRentPerMonth;
	}


	public void setPermanentAddressRentPerMonth(String permanentAddressRentPerMonth) {
		this.permanentAddressRentPerMonth = permanentAddressRentPerMonth;
	}


	public String getPermanentAddressResidancalSince() {
		return permanentAddressResidancalSince;
	}


	public void setPermanentAddressResidancalSince(String permanentAddressResidancalSince) {
		this.permanentAddressResidancalSince = permanentAddressResidancalSince;
	}


	public String getOfficeAddress() {
		return officeAddress;
	}


	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}


	public String getOfficeAddress1() {
		return officeAddress1;
	}


	public void setOfficeAddress1(String officeAddress1) {
		this.officeAddress1 = officeAddress1;
	}


	public String getOfficeAddress2() {
		return officeAddress2;
	}


	public void setOfficeAddress2(String officeAddress2) {
		this.officeAddress2 = officeAddress2;
	}


	public String getOfficeAddress3() {
		return officeAddress3;
	}


	public void setOfficeAddress3(String officeAddress3) {
		this.officeAddress3 = officeAddress3;
	}


	public String getOfficeAddressState() {
		return officeAddressState;
	}


	public void setOfficeAddressState(String officeAddressState) {
		this.officeAddressState = officeAddressState;
	}


	public String getOfficeAddressCity() {
		return officeAddressCity;
	}


	public void setOfficeAddressCity(String officeAddressCity) {
		this.officeAddressCity = officeAddressCity;
	}


	public String getOfficeAddressPincode() {
		return officeAddressPincode;
	}


	public void setOfficeAddressPincode(String officeAddressPincode) {
		this.officeAddressPincode = officeAddressPincode;
	}


	public String getOfficeAddressLandMark() {
		return officeAddressLandMark;
	}


	public void setOfficeAddressLandMark(String officeAddressLandMark) {
		this.officeAddressLandMark = officeAddressLandMark;
	}


	public String getOfficeAddressLocationType() {
		return officeAddressLocationType;
	}


	public void setOfficeAddressLocationType(String officeAddressLocationType) {
		this.officeAddressLocationType = officeAddressLocationType;
	}


	public String getOfficeAddressDistrict() {
		return officeAddressDistrict;
	}


	public void setOfficeAddressDistrict(String officeAddressDistrict) {
		this.officeAddressDistrict = officeAddressDistrict;
	}


	public String getOfficeAddressTaluka() {
		return officeAddressTaluka;
	}


	public void setOfficeAddressTaluka(String officeAddressTaluka) {
		this.officeAddressTaluka = officeAddressTaluka;
	}


	public String getOfficeAddressResidenceType() {
		return officeAddressResidenceType;
	}


	public void setOfficeAddressResidenceType(String officeAddressResidenceType) {
		this.officeAddressResidenceType = officeAddressResidenceType;
	}


	public String getOfficeAddressRentPerMonth() {
		return officeAddressRentPerMonth;
	}


	public void setOfficeAddressRentPerMonth(String officeAddressRentPerMonth) {
		this.officeAddressRentPerMonth = officeAddressRentPerMonth;
	}


	public String getOfficeAddressResidancalSince() {
		return officeAddressResidancalSince;
	}


	public void setOfficeAddressResidancalSince(String officeAddressResidancalSince) {
		this.officeAddressResidancalSince = officeAddressResidancalSince;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "AddressDetailForCustomer [id=" + id + ", currentAddress=" + currentAddress + ", currentAddress1="
				+ currentAddress1 + ", currentAddress2=" + currentAddress2 + ", currentAddress3=" + currentAddress3
				+ ", currentAddressState=" + currentAddressState + ", currentAddressCity=" + currentAddressCity
				+ ", currentAddressPincode=" + currentAddressPincode + ", currentAddressLandMark="
				+ currentAddressLandMark + ", currentAddressLocationType=" + currentAddressLocationType
				+ ", currentAddressResidenceStatus=" + currentAddressResidenceStatus + ", currentAddressDistrict="
				+ currentAddressDistrict + ", currentAddressTaluka=" + currentAddressTaluka
				+ ", currentAddressResidenceType=" + currentAddressResidenceType + ", currentAddressRentPerMonth="
				+ currentAddressRentPerMonth + ", currentAddressResidancalSince=" + currentAddressResidancalSince
				+ ", permanentAddress=" + permanentAddress + ", permanentAddress1=" + permanentAddress1
				+ ", permanentAddress2=" + permanentAddress2 + ", permanentAddress3=" + permanentAddress3
				+ ", permanentAddressState=" + permanentAddressState + ", permanentAddressCity=" + permanentAddressCity
				+ ", permanentAddressPincode=" + permanentAddressPincode + ", permanentAddressLandMark="
				+ permanentAddressLandMark + ", permanentAddressResidenceStatus=" + permanentAddressResidenceStatus
				+ ", permanentAddressDistrict=" + permanentAddressDistrict + ", permanentAddressTaluka="
				+ permanentAddressTaluka + ", permanentAddressResidenceType=" + permanentAddressResidenceType
				+ ", permanentAddressRentPerMonth=" + permanentAddressRentPerMonth
				+ ", permanentAddressResidancalSince=" + permanentAddressResidancalSince + ", officeAddress="
				+ officeAddress + ", officeAddress1=" + officeAddress1 + ", officeAddress2=" + officeAddress2
				+ ", officeAddress3=" + officeAddress3 + ", officeAddressState=" + officeAddressState
				+ ", officeAddressCity=" + officeAddressCity + ", officeAddressPincode=" + officeAddressPincode
				+ ", officeAddressLandMark=" + officeAddressLandMark + ", officeAddressLocationType="
				+ officeAddressLocationType + ", officeAddressDistrict=" + officeAddressDistrict
				+ ", officeAddressTaluka=" + officeAddressTaluka + ", officeAddressResidenceType="
				+ officeAddressResidenceType + ", officeAddressRentPerMonth=" + officeAddressRentPerMonth
				+ ", officeAddressResidancalSince=" + officeAddressResidancalSince + ", customerId=" + customerId + "]";
	}


	


	

}