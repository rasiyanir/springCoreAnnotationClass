package com.riyaz.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.riyaz.springannotation")
public class TestConfig {

	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcessor() { return new SnapDragon(); }
	 */
}
