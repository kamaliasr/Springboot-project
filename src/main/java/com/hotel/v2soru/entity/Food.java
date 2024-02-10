package com.hotel.v2soru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Food 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	private String foodName;
	private double price;
	

}
