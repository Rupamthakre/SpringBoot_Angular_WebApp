package com.technavv.springbootecommerce.service;

import com.technavv.springbootecommerce.dto.Purchase;
import com.technavv.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

	PurchaseResponse placeOrder(Purchase purchase);
	
}
