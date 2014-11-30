package com.example.cw18555051201419;

public class Coffee {
	private int imageId;
	private String coffeeName;
	private int coffeePrice;
	
	public Coffee(int imageId, String coffeeName, int coffeePrice) {
		super();
		this.imageId = imageId;
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	
	
}
