package com.equifax.bootsfaces.portlet.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "orderService")
@ApplicationScoped
public class OrderService {

	private final static String[] trackingNumber;
	private final static String[] trackingUrl;
	private final static String[] custRefNumber;
	private final static boolean[] status;
	private final static String[] SIN;
	private final static String[] date;
	private final static String[] firstName;
	private final static String[] lastName;
	private final static String[] submittedBy;
	private final static String[] address;

	static {
		trackingNumber = new String[10];
		trackingNumber[0] = "2534534534";
		trackingNumber[1] = "2534534535";
		trackingNumber[2] = "2534534536";
		trackingNumber[3] = "2534534534";
		trackingNumber[4] = "2534534534";
		trackingNumber[5] = "2534534534";
		trackingNumber[6] = "2534534534";
		trackingNumber[7] = "2534534534";
		trackingNumber[8] = "2534534534";
		trackingNumber[9] = "2534534534";

		trackingUrl = new String[10];
		trackingUrl[0] = "www.equifax.com";
		trackingUrl[1] = "www.equifax.com";
		trackingUrl[2] = "www.equifax.com";
		trackingUrl[3] = "www.equifax.com";
		trackingUrl[4] = "www.equifax.com";
		trackingUrl[5] = "www.equifax.com";
		trackingUrl[6] = "www.equifax.com";
		trackingUrl[7] = "www.equifax.com";
		trackingUrl[8] = "www.equifax.com";
		trackingUrl[9] = "www.equifax.com";

		custRefNumber = new String[10];
		custRefNumber[0] = "2534534534";
		custRefNumber[1] = "2534534535";
		custRefNumber[2] = "2534534536";
		custRefNumber[3] = "2534534534";
		custRefNumber[4] = "2534534534";
		custRefNumber[5] = "2534534534";
		custRefNumber[6] = "2534534534";
		custRefNumber[7] = "2534534534";
		custRefNumber[8] = "2534534534";
		custRefNumber[9] = "2534534534";

		status = new boolean[10];
		status[0] = true;
		status[1] = false;
		status[2] = true;
		status[3] = false;
		status[4] = true;
		status[5] = false;
		status[6] = true;
		status[7] = false;
		status[8] = true;
		status[9] = false;

		SIN = new String[10];
		SIN[0] = "2534534534";
		SIN[1] = "2534534535";
		SIN[2] = "2534534536";
		SIN[3] = "2534534537";
		SIN[4] = "2534534538";
		SIN[5] = "2534534539";
		SIN[6] = "2534534540";
		SIN[7] = "2534534541";
		SIN[8] = "2534534542";
		SIN[9] = "2534534543";

		date = new String[10];
		date[0] = "06/14/2018";
		date[1] = "06/13/2018";
		date[2] = "06/14/2018";
		date[3] = "06/14/2018";
		date[4] = "06/14/2018";
		date[5] = "06/14/2018";
		date[6] = "06/14/2018";
		date[7] = "06/14/2018";
		date[8] = "06/14/2018";
		date[9] = "06/14/2018";

		firstName = new String[10];
		firstName[0] = "Raj";
		firstName[1] = "Ravi";
		firstName[2] = "Ram";
		firstName[3] = "Ranga";
		firstName[4] = "Ramesh";
		firstName[5] = "Rathod";
		firstName[6] = "Ravee";
		firstName[7] = "Raadha";
		firstName[8] = "Ravan";
		firstName[9] = "Reddy";

		lastName = new String[10];
		lastName[0] = "Charles";
		lastName[1] = "Bill";
		lastName[2] = "Clinton";
		lastName[3] = "Sid";
		lastName[4] = "Sunny";
		lastName[5] = "Charles";
		lastName[6] = "Charles";
		lastName[7] = "Charles";
		lastName[8] = "Charles";
		lastName[9] = "Charles";

		submittedBy = new String[10];
		submittedBy[0] = "Charles";
		submittedBy[1] = "Bill";
		submittedBy[2] = "Clinton";
		submittedBy[3] = "Sid";
		submittedBy[4] = "Sunny";
		submittedBy[5] = "Charles";
		submittedBy[6] = "Charles";
		submittedBy[7] = "Charles";
		submittedBy[8] = "Charles";
		submittedBy[9] = "Charles";

		address = new String[10];
		address[0] = "11432 LackLand Road";
		address[1] = "851 Parr Dr";
		address[2] = "715 Jefferson Blvd";
		address[3] = "11432 LackLand Road";
		address[4] = "851 Parr Dr";
		address[5] = "715 Jefferson Blvd";
		address[6] = "11432 LackLand Road";
		address[7] = "851 Parr Dr";
		address[8] = "715 Jefferson Blvd";
		address[9] = "11432 LackLand Road";
		
		

	}

	public static List<Order> createOrders(int size) {
		List<Order> list = new ArrayList<Order>();
		for (int i = 0; i < size; i++) {
			list.add(new Order(getRandomTrackingNumber(), getRandomUrl(), getRandomCustRefNumber(), getRandomSIN(), getRandomStatus(), getRandomDate(), 
					getRandomFN(), getRandomLN(), getRandomSubmittedBy(), getRandomAddress()));
		}

		return list;
	}
	
	public static List<Order> searchOrders(List<Order> orders, String key) {
		
		List<Order> newOrders = new ArrayList<Order>();
		
		if (orders != null && orders.size() > 0) {
			
			for (Order o : orders) {
				if (searchOrder(o, key)) {
					newOrders.add(o);
				}
			}
		}
		
		return newOrders;
	}
	
	public static boolean searchOrder(Order o, String key) {
		
		if (o != null && !key.isEmpty() && (o.custRefNumber.contains(key) || o.trackingNumber.contains(key))) {
			return true;
		}
		return false;
	}

	private static String getRandomTrackingNumber() {
		return UUID.randomUUID().toString().substring(0, 8);
	}

	private static String getRandomCustRefNumber() {
		return custRefNumber[(int) (Math.random() * 10)];
	}

	private static String getRandomUrl() {
		return trackingUrl[(int) (Math.random() * 10)];
	}

	private static String getRandomSIN() {
		return SIN[(int) (Math.random() * 10)];
	}

	public static boolean getRandomStatus() {
		return status[(int) (Math.random() * 10)];
	}

	public static String getRandomDate() {
		return date[(int) (Math.random() * 10)];
	}

	public static String getRandomFN() {
		return firstName[(int) (Math.random() * 10)];
	}

	public static String getRandomLN() {
		return lastName[(int) (Math.random() * 10)];
	}

	public static String getRandomSubmittedBy() {
		return submittedBy[(int) (Math.random() * 10)];
	}

	public static String getRandomAddress() {
		return address[(int) (Math.random() * 10)];
	}

	public static List<String> getTrackingnumber() {
		return Arrays.asList(trackingNumber);
	}

	public static List<String> getTrackingurl() {
		return Arrays.asList(trackingUrl);
	}

	public static List<String> getCustrefnumber() {
		return Arrays.asList(custRefNumber);
	}

	public static List<boolean[]> getStatus() {
		return Arrays.asList(status);
	}

	public static List<String> getSin() {
		return Arrays.asList(SIN);
	}

	public static List<String> getDate() {
		return Arrays.asList(date);
	}

	public static List<String> getFirstname() {
		return Arrays.asList(firstName);
	}

	public static List<String> getLastname() {
		return Arrays.asList(lastName);
	}

	public static List<String> getSubmittedby() {
		return Arrays.asList(submittedBy);
	}

	public static List<String> getAddress() {
		return Arrays.asList(address);
	}
	 
	 
}
