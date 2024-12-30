package com.mbaziekone.mybook.service.impl;

import org.springframework.stereotype.Service;

import com.mbaziekone.mybook.model.Order;
import com.mbaziekone.mybook.model.dto.Purchase;
import com.mbaziekone.mybook.model.dto.PurchaseResponse;
import com.mbaziekone.mybook.repository.CustomerRepository;
import com.mbaziekone.mybook.service.CheckoutService;

import jakarta.transaction.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	
	private CustomerRepository customerRepository;
	
	public CheckoutServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		
		// retrieve the order info from dto
		Order order = purchase.getOrder();
		
		// generate tracking numbe
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		
		
		
		return null;
	}

}
