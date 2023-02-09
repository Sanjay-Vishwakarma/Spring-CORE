package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{12+12}")
	private int x;

	@Value("#{10+10}")
	private int y;

	// static method call
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	// vriable call
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	

	// creating object
	@Value("#{new java.lang.String('Sanjay')}")
	private String name;
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
