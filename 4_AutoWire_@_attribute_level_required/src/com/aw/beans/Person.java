package com.aw.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int eno;
	private String name;
	
	@Autowired(required=false)
	// if passport are not configure in cfg file. and required is false then no problem. 
	
	private Passport passport; 
	
	@Autowired
	private Address address;
	
	

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public Passport getPassport() {
		return passport;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [eno=" + eno + ", name=" + name + ", passport="
				+ passport + ", address=" + address + "]";
	}

}