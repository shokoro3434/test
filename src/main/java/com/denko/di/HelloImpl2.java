package com.denko.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "HelloImpl2")
public class HelloImpl2 implements IHello {

    public void sayHello() {
        System.out.println("another Hello");
    }
}
