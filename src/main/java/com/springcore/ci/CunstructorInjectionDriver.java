package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CunstructorInjectionDriver {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ci_config.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
}
