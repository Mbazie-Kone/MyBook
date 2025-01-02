package com.mbaziekone.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	

}
