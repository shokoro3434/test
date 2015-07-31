package com.denko.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.sayHello();
    }
}
