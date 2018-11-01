package com.equifax.bootsfaces.portlet.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@ManagedBean
@ViewScoped
public class SearchBean implements Serializable {
	
	private static final long serialVersionUID = -1137429097223126301L;
	Log log = LogFactoryUtil.getLog(SearchBean.class);
	
	// init
	
	public SearchBean() {
		processAttrs();
		getOrders();
		searchOrders(transNumber);
	}
	
	// properties
	
	private String transNumber;
	
	private List<Order> orders;
	private List<Order> searchOrders;
	private String searchKey;
	private boolean showResults;
	
	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	
	public boolean isShowResults() {
		return showResults;
	}

	public void setShowResults(boolean showResults) {
		this.showResults = showResults;
	}

	public List<Order> getSearchOrders() {
		return searchOrders;
	}

	public void setSearchOrders(List<Order> searchOrders) {
		this.searchOrders = searchOrders;
	}
	
	// utilities
	
	private void processAttrs() {
		
		FacesContext fc = FacesContext.getCurrentInstance();
		PortletRequest request = (PortletRequest) fc.getExternalContext().getRequest();
		
		String tn = request.getParameter("tn");
		if (tn != null && !tn.isEmpty()) {
			transNumber = tn.trim();
		}
		
		log.info("Transaction Number: " + tn);
	}
	
	private void getOrders() {
		orders = OrderService.createOrders(25);
	}
	
	// checks
	
	public boolean hasOrders() {
		
		if (orders != null && orders.size() > 0) {
			return true;
		}
		return false;
	}
	
	public boolean hasResults() {
		
		if (searchOrders != null && searchOrders.size() > 0) {
			return true;
		}
		return false;
	}
	
	// actions
	
	public void searchOrders() {
		searchOrders(searchKey);
	}
	
	public void searchOrders(String key) {

		log.info("Received search command: " + key);
		
		if (key != null && !key.isEmpty()) {
			key = key.trim();
			searchOrders = OrderService.searchOrders(orders, key);
		} else {
			searchOrders = orders;
		}
		
		showResults = true;
	}

	public void searchOrders(ActionEvent e) {
		searchOrders();
	}

}
