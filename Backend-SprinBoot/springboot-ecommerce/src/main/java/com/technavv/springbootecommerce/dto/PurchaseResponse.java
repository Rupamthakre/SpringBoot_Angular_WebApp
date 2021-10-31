package com.technavv.springbootecommerce.dto;

//import com.technavv.springbootecommerce.entity.Order;

public class PurchaseResponse {

	//private final String orderTrackingNumber = "";
	
	private String orderTrackingNumber;
	

	public PurchaseResponse(String orderTrackingNumber) {
		// TODO Auto-generated constructor stub
		
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}


	
	
	
}
