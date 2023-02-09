package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	
	private List<String> friends;
	
	private Map<String , Integer> feestructure;
	
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties Properties) {
		this.properties = Properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + "]";
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends, Map<String, Integer> feestructure) {
		super();
		this.friends = friends;
		this.feestructure = feestructure;
	}
	
	
	
}
