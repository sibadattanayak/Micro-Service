package com.bridgelabz.addressservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressservice.model.Address;

@RestController
@RequestMapping("/user")
public class RequestHndler {
	
	@GetMapping("/address")
	public Address getAddress()
	{
		System.out.println("----------------------Reched in Address : -------------------------");
		Address add=new Address();
		add.setHouseNumber("VIP009");
		add.setCity("Raipur");
		add.setState("Chhattisgarh");
		add.setCountry("India");
		return add;
	}
}
