package com.jsp.spring.autowring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Human hum=context.getBean("human",Human.class);
    	hum.startPumping();
    }
}
