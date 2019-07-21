package com.riyaz.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(TestConfig.class); 
		
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}
}
