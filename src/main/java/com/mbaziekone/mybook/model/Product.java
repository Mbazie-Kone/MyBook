package com.mbaziekone.mybook.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	private String imagePath;
	
	private boolean active;
	
	private int unitsInStock;
	
	private Date dateCreated;
	
	private Date lastUpdate;
	
	private ProductCategory category;

}
