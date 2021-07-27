package com.natWest.fruitsaladdemo.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Banana {

	@Id
	
	private Long id;
	
	@Column(name = "Banana_Type")
	int typeofbananas;
	@Column(name = "Taste_Grade")
	String taste;
	@Column(name = "Quality")
	String quality;
	

	public Banana(int typeofbananas, String taste, String quality) {
		super();
		this.typeofbananas = typeofbananas;
		this.taste = taste;
		this.quality = quality;
	}

	public Long getId() {
		return id;
	}


	public int getTypeofbananas() {
		return typeofbananas;
	}

	public void setTypeofbananas(int typeofbananas) {
		this.typeofbananas = typeofbananas;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Banana() {
		System.out.println("Bananas are the main ingredients for fruitsalad");
	}

	public void primaryingredient() {
		System.out.println("blue banana ");
	}

	
	
}
