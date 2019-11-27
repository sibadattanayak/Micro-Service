package com.bridgelabz.personinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bridgelabz.personinfo.model.Address;
import com.bridgelabz.personinfo.model.User;

@RestController
@RequestMapping("/user")
public class RequestHandler {
	
	@Autowired
	private RestTemplate restTemplete;
 
	@GetMapping("/info")
	public User getUser()
	{
		Address address = restTemplete.getForObject("http://user-address-info/user/address", Address.class);
		User user=new User();
		user.setName("Ajay Dewangan");
		user.setEmail("dewangan143.ajay@gmail.com");
		user.setAddress(address);
		return user;
	}
}
