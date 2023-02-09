package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	
	private Address adress;

	public Emp() {
		System.out.println("default constructor calling ...... ");
	}
	
	public Emp(Address adress) {
		super();
		this.adress = adress;
		System.out.println("inside construsctor...");

	}

	public Address getAdress() {
		return adress;
	}
	@Autowired
	@Qualifier("temp2")
	public void setAdress(Address adress) {
		this.adress = adress;
		System.out.println("setter calling ...");
	}

	@Override
	public String toString() {
		return "Emp [adress=" + adress + "]";
	}

}
