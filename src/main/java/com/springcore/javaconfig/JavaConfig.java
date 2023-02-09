package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// we can remove @CompinentScan while we use @Bean
//@ComponentScan("com.springcore.javaconfig")
public class JavaConfig {
	
	
	
	// will not use @Component to create bean 
	// here will use @Bean
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	// we can change the bean name 
	
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent()
	{
		//creating new student
		Student st = new Student(getSamosa());
		return st;
		
	}
	
	
	

}
