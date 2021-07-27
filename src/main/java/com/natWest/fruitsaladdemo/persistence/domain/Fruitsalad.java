package com.natWest.fruitsaladdemo.persistence.domain;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Fruitsalad {

	@Autowired
	private Apple apple;
	@Autowired
	private Banana banana;

	public void printFruitsalad() {
		System.out.println("Mix fruits together");

		apple.secondaryingredient();
		banana.primaryingredient();

	}

}
