package com.aw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aw.beans.Person;

public class Test_1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aw/common/applicationContext_1.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}
}
/*
 * when we use ApplicationContext then we no need to register 
 * beanPostProcessor into configuration file. 
 * when also we use <contexr:annotationConfig/>
 * 
 * but in case of BeanFactory we need to register beanPostProcessor
 * every annotation have postProcessor. 
 * 
 * and register with factory or with IOC Container. 
 * 
 * 
 */