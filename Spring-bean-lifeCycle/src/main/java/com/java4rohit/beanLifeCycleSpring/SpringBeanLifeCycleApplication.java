package com.java4rohit.beanLifeCycleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
         applicationContext.registerShutdownHook();
		//applicationContext.stop();
		//applicationContext.close();
	}

}
