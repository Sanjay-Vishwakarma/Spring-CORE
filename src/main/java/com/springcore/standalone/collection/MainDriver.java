package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/aloneconfig.xml");

		Person person = context.getBean("person1", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("______________________________________");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		System.out.println("_____________________________________");
		System.out.println(person.getProperties());

	}

}
