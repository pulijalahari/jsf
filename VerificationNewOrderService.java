package com.equifax.bootsfaces.portlet.bean;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class VerificationNewOrderService implements Serializable{
	
	private static final long serialVersionUID = 1L;

    private String selectedVerificationType; 
    private String selectedPurpose;
    private String province;
    private String custRefNum;
    private String firstName;
    private String middleName;
    private String lastName;
    private String sin;
    private String dob;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String providence;
    private String postalCode;
    
    
    
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
	public String getSin() {
		return sin;
	}
	public void setSin(String sin) {
		this.sin = sin;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvidence() {
		return providence;
	}
	public void setProvidence(String providence) {
		this.providence = providence;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCustRefNum() {
		return custRefNum;
	}
	public void setCustRefNum(String custRefNum) {
		this.custRefNum = custRefNum;
	}
	public String getSelectedVerificationType() {
		return selectedVerificationType;
	}
	public void setSelectedVerificationType(String selectedVerificationType) {
		this.selectedVerificationType = selectedVerificationType;
	}
	public String getSelectedPurpose() {
		return selectedPurpose;
	}
	public void setSelectedPurpose(String selectedPurpose) {
		this.selectedPurpose = selectedPurpose;
	}  
    
    
    
    
}
