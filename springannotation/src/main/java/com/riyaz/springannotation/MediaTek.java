package com.riyaz.springannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor{

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("MediaTek");
	}
	
}
