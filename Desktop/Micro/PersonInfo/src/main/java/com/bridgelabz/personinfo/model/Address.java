package com.bridgelabz.personinfo.model;

public class Address 
{
	private String houseNumber;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String houseNumber, String city, String state, String country) {
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

