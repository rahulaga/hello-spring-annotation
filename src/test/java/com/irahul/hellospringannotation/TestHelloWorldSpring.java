package com.irahul.hellospringannotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.irahul.hellospringannotation.HelloWorldSpring;

/**
 * Load bean from XML context file manually
 * @author rahul
 *
 */
public class TestHelloWorldSpring {

	@SuppressWarnings("resource")
	@Test
	public void testHelloWorldBeans(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
 
		HelloWorldSpring obj = (HelloWorldSpring) context.getBean("helloWorldSpring");		
		
		System.out.println(obj.execute());			
		
		Assert.assertEquals("Namaste", obj.execute());
	}
}
