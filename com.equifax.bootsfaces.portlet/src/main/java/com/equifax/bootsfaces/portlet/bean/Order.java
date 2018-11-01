package com.equifax.bootsfaces.portlet.bean;

/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.io.Serializable;

public class Order implements Serializable {
    

	private static final long serialVersionUID = 1L;
	public String trackingNumber;
    public String trackingUrl;
    public String custRefNumber;
    public String sin;
    public boolean status;
    public String date;
    public String firstName;
    public String lastName;
    public String submittedBy;
    public String address;

    public Order() {}
    
    

    public Order(String trackingNumber, String trackingUrl, String custRefNumber, String sin, boolean status,
			String date, String firstName, String lastName, String submittedBy, String address) {
		super();
		this.trackingNumber = trackingNumber;
		this.trackingUrl = trackingUrl;
		this.custRefNumber = custRefNumber;
		this.sin = sin;
		this.status = status;
		this.date = date;
		this.firstName = firstName;
		this.lastName = lastName;
		this.submittedBy = submittedBy;
		this.address = address;
	}



	

    public String getTrackingNumber() {
		return trackingNumber;
	}



	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}



	public String getTrackingUrl() {
		return trackingUrl;
	}



	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}



	public String getCustRefNumber() {
		return custRefNumber;
	}



	public void setCustRefNumber(String custRefNumber) {
		this.custRefNumber = custRefNumber;
	}



	public String getSin() {
		return sin;
	}



	public void setSin(String sin) {
		this.sin = sin;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getSubmittedBy() {
		return submittedBy;
	}



	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.trackingNumber != null ? this.trackingNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if ((this.trackingNumber == null) ? (other.trackingNumber != null) : !this.trackingNumber.equals(other.trackingNumber)) {
            return false;
        }
        return true;
    }
}