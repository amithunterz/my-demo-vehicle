package com.nagarro.testproject.vehicle_demo_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Application Context is superset of BeanFactory
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj=(Vehicle)context.getBean("scooter");
        obj.drive();
        
    }
}
