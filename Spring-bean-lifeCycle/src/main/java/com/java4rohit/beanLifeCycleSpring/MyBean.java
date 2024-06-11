package com.java4rohit.beanLifeCycleSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @PostConstruct
    public void start(){
        System.out.println("start method is called..");
    }

    public void myMethod(){
        System.out.println("my method executing");
    }

    @PreDestroy
    public void stop(){
        System.out.println("stop method is called..");
    }
}
