package com.epicode.U5D1.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
@MappedSuperclass
@Getter
public abstract class Item {

	protected int calories;
	protected double price;

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

	public Item(){}

}
