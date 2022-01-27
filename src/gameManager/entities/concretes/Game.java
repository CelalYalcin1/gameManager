package gameManager.entities.concretes;

import gameManager.entities.abstracts.Entity;

public class Game implements Entity {
	
	private String name;
	private int id;
	private double price;
	private double discountedPrice;
	
	public Game() {
		super();
	}
	
	public Game(String name, int id, double price, double discountedPrice) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.discountedPrice = discountedPrice;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
}
