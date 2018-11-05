package com.equifax.bootsfaces.portlet.bean;

import java.io.File;

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
	private File fileOfEmployerDocumentation;
	private File fileOfGeneralDocumentation;
	
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
	
	public File getFileOfEmployerDocumentation() {
		return fileOfEmployerDocumentation;
	}
	public void setFileOfEmployerDocumentation(File fileOfEmployerDocumentation) {
		this.fileOfEmployerDocumentation = fileOfEmployerDocumentation;
	}
	public File getFileOfGeneralDocumentation() {
		return fileOfGeneralDocumentation;
	}
	public void setFileOfGeneralDocumentation(File fileOfGeneralDocumentation) {
		this.fileOfGeneralDocumentation = fileOfGeneralDocumentation;
	}
	public void submitManualVerification(){
		System.out.println("submitManualVerification****************");
	}
	public void backToNewOrder(){
		System.out.println("backToNewOrder****************");
	}
	
	

}
