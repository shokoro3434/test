package com.denko.di;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired
    @Qualifier(value = "HelloImpl2")
    private IHello hello;

    public void sayHello() {
        hello.sayHello();
    }
}