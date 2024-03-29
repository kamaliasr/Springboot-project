package com.hotel.v2soru.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Deliverboy 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryboyId;
	private String deliveryboyName;
	private long deliveryboyContact;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> order;
	

}
