package com.equifax.bootsfaces.portlet.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ManualVerification {
	
	private String employerName;
	private String employerPhone;
	private String employerEmail;
	private String employerFax;
	private String employerAddress1;
	private String employerAddress2;
	private String employerCity;
	private String employerProvinceOrTerritory;
	private String employerPostalCode;
	private String file;
	private String upload;
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public String getEmployerEmail() {
		return employerEmail;
	}
	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}
	public String getEmployerFax() {
		return employerFax;
	}
	public void setEmployerFax(String employerFax) {
		this.employerFax = employerFax;
	}
	public String getEmployerAddress1() {
		return employerAddress1;
	}
	public void setEmployerAddress1(String employerAddress1) {
		this.employerAddress1 = employerAddress1;
	}
	public String getEmployerAddress2() {
		return employerAddress2;
	}
	public void setEmployerAddress2(String employerAddress2) {
		this.employerAddress2 = employerAddress2;
	}
	public String getEmployerCity() {
		return employerCity;
	}
	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}
	public String getEmployerProvinceOrTerritory() {
		return employerProvinceOrTerritory;
	}
	public void setEmployerProvinceOrTerritory(String employerProvinceOrTerritory) {
		this.employerProvinceOrTerritory = employerProvinceOrTerritory;
	}
	public String getEmployerPostalCode() {
		return employerPostalCode;
	}
	public void setEmployerPostalCode(String employerPostalCode) {
		this.employerPostalCode = employerPostalCode;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getUpload() {
		return upload;
	}
	public void setUpload(String upload) {
		this.upload = upload;
	}
	
	

}
