package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDriver {
	public static void main(String[] args) {

		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp = (Emp) cont.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());

	}
}
