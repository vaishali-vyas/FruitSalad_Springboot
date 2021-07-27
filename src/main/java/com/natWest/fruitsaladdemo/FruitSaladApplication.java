package com.natWest.fruitsaladdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.natWest.fruitsaladdemo.persistence.domain.Fruitsalad;

@SpringBootApplication
public class FruitSaladApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FruitSaladApplication.class, args);
		System.out.println(context.getBean("message", String.class));
		Fruitsalad fs = context.getBean(Fruitsalad.class);
		fs.printFruitsalad();
	}

}
