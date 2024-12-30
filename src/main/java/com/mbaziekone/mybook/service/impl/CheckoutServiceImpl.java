package com.mbaziekone.mybook.service.impl;

import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.stereotype.Service;

import com.mbaziekone.mybook.model.Customer;
import com.mbaziekone.mybook.model.Order;
import com.mbaziekone.mybook.model.OrderItem;
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
		
		// generate tracking number
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		// populate order with orderItems
		Set<OrderItem> orderItems = purchase.getOrderItems();
		orderItems.forEach(Item -> order.add(Item));
		
		// populate order with billingAddress and shippingAddress
		order.setBillingAddress(purchase.getBillingAddress());
		order.setShippingAddress(purchase.getShippingAddress());
		
		
		Customer customer = purchase.getCustomer();
		customer.add(order);
		
		
		customerRepository.save(customer);
		
		return null;
	}

}
