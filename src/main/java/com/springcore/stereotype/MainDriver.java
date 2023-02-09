package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student st = context.getBean("student1",Student.class);
		Student st2 = context.getBean("student1",Student.class);

		System.out.println(st);
		System.out.println(st.getCity().getClass().getName());

		System.out.println("___________________________");
		System.out.println("The list of address ::"+st.getAddress());
		
		System.out.println("__________________Annotation base scope (prototype and singleton__________________)");
		
		System.out.println("1 hashcode check  :"+st.hashCode());
		System.out.println("2 hashcode check  :"+st2.hashCode());

		System.out.println("__________________xml base scope (prototype and singleton__________________)");

		Teacher t1 = context.getBean("teacherrr", Teacher.class);
		Teacher t2 = context.getBean("teacherrr", Teacher.class);
		System.out.println("t1 hashcode  "+ t1.hashCode());
		System.out.println("t2 hashcode  "+ t2.hashCode());


	}
	
}
