package com.sunny.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sunny.spring.EmailApplication.EmailClient;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello Sunny Duke!");

		EmailClient emailClient = new EmailClient();
		emailClient.sendEmail("dfdFfF");

		// tightly coupled
		// we need loosely coupled. as we know that one object depends on other.
		// here we're depending on the both sides. lets create an interface
		// claA obj = new claA();
		// Vehicle obj = new car();
		// obj.car();
		/*
		 * vehicle obj = new claB(); obj.ride();
		 * 
		 * /* Instantiating ioC container
		 **
		 * Resource resource = new FileSystemResource("beans.xml"); ClassPathResource
		 * res = new ClassPathResource("beans.xml"); BeanFactory factory = new
		 * XmlBeanFactory(res);
		 * 
		 * ApplicationContext con = new ClassPathXmlApplicationContext( new String[]
		 * {"beans.xml"}); // application context is nothing but bean factory
		 * BeanFactory fact = con;
		 */
		//
	}
}
