package com.mbaziekone.mybook.model.dto;


import java.util.Set;

import com.mbaziekone.mybook.model.Address;
import com.mbaziekone.mybook.model.Customer;
import com.mbaziekone.mybook.model.Order;
import com.mbaziekone.mybook.model.OrderItem;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Purchase {
	
	private Customer customer;
	
	private Address shippingAddress;
	
	private Address billingAddress;
	
	private Order order;
	
	private Set<OrderItem> orderItems;
}
