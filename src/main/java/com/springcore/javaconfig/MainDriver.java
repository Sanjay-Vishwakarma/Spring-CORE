package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		// here use getStudent this name of bean which we are created already in javaconfig
		Student st = context.getBean("student",Student.class);
		System.out.println(st);
		st.study();
	}

}
