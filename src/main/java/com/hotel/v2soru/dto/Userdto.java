package com.hotel.v2soru.dto;

import java.util.List;

import com.hotel.v2soru.entity.Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Userdto 
{
	private int userdtoId;
	private String userdtoName;
	private String userdtoEmail;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order>order;

}
