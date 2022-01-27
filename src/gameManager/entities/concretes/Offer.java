package gameManager.entities.concretes;

import java.util.List;

import javax.xml.validation.Validator;

import gameManager.entities.abstracts.Entity;

public class Offer implements Entity {
	private int offerId;
	private String name;
	private double discount;
	private List<Game> games;
	private Validator valid;
	
	public Offer() {
		super();
	}
	public Offer(int offerId, String name, double discount, List<Game> games, Validator valid) {
		super();
		this.offerId = offerId;
		this.name = name;
		this.discount = discount;
		this.games = games;
		this.valid = valid;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public Validator getValid() {
		return valid;
	}
	public void setValid(Validator valid) {
		this.valid = valid;
	}

	
	

}
