package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifcycleconfig.xml");
	
		
		/*
		 * Samosa samosa= (Samosa) context.getBean("s1");
		 * 
		 * System.out.println(samosa);
		 * 
		 * // registering hook context.registerShutdownHook();
		 * 
		 * // to call destroy method we need to register hook , where we use now
		 * AbstractApplicationContext
		 * 
		 * System.out.println("--------------second bean ------------------"); Pepsi
		 * pepsi = (Pepsi) context.getBean("p1"); System.out.println(pepsi);
		 */
		context.registerShutdownHook();
		
		Example example = (Example)context.getBean("example");		
		System.out.println(example);
		
		//  Note : -the destroy method will be call in last 
		
		
	}

}
