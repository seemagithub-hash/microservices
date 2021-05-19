package com.sunhome.orderms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

 	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long id;
 	private String customerEmail;
 	private String customerAddress;
 
 	@OneToMany(cascade = CascadeType.ALL)
 	private List<OrderItem> items;
 	
}
