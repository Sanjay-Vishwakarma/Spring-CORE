package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// second way to get init and destroy call  using interface


public class Pepsi  implements InitializingBean , DisposableBean {
	
	public Pepsi(int price) {
		super();
		this.price = price;
	}

	private int price;

	public int getPrice() {
		return price; 
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("this is the init method ..... get it by  InitializingBean interface ");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is the destroy method ..... get it by  DisposableBean interface ");

	}
	
	
	

}
