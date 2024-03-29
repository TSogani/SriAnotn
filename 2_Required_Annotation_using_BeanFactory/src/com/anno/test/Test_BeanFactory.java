package com.anno.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.anno.beans.Person;

public class Test_BeanFactory {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/anno/common/application-context.xml"));
			
		// register beanPsotProcessor 
		RequiredAnnotationBeanPostProcessor bean2 = factory.getBean("requiredAnnotationBeanPostProcessor", RequiredAnnotationBeanPostProcessor.class);
		
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bean2);
		
		Person bean = factory.getBean("person", Person.class);

		System.out.println(bean);
		
	}

}
