package com.mbaziekone.mybook.service;

import com.mbaziekone.mybook.model.dto.Purchase;
import com.mbaziekone.mybook.model.dto.PurchaseResponse;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);
}
