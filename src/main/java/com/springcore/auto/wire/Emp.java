package com.springcore.auto.wire;

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

	public void setAdress(Address adress) {
		this.adress = adress;
		System.out.println("setter calling ...");
	}

	@Override
	public String toString() {
		return "Emp [adress=" + adress + "]";
	}

}
