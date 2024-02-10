package com.hotel.v2soru.dto;

import java.util.List;

import com.hotel.v2soru.entity.Admin;
import com.hotel.v2soru.entity.Deliverboy;
import com.hotel.v2soru.entity.Food;
import com.hotel.v2soru.entity.Order;
import com.hotel.v2soru.entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Admindto
{
	private int admindtoId;
	private String admindtoName;
	private String admindtoEmail;
	private String admindtoContact;
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> user;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> order;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Deliverboy> deliveryboy;
	

}
