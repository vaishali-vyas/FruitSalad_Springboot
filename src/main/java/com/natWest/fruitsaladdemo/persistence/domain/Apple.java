package com.natWest.fruitsaladdemo.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Apple {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Apple_Type")
	String typeofapple;
	@Column(name = "Quality")
	String quality;
	@Column(name = "Taste_Grade")
	String taste;
	


	public Apple( String typeofapple, String quality, String taste) {
		super();

		this.typeofapple = typeofapple;
		this.quality = quality;
		this.taste = taste;
	}

	public Long getId() {
		return id;
	}


	public String getTypeofapple() {
		return typeofapple;
	}

	public void setTypeofapple(String typeofapple) {
		this.typeofapple = typeofapple;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Apple() {
		System.out.println("Apples are good contributor to the salad");
	}
	
	public void secondaryingredient () {
		System.out.println("Sweet Royal gala ");
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", typeofapple=" + typeofapple + ", quality=" + quality + ", taste=" + taste + "]";
	}
	
	
}
