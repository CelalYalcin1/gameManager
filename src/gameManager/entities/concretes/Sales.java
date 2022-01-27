package gameManager.entities.concretes;

import java.util.List;

import gameManager.entities.abstracts.Entity;

public class Sales implements Entity {
	private List<Game> games;
	private int salesId;
	private String salesContract;
	private double discountedPrice;
	private Game game;
	private Offer offer;
	private Player player;
	
	public Sales() {
		super();
	}

	public Sales(List<Game> games, int salesId, String salesContract, double discountedPrice, Game game, Offer offer,
			Player player) {
		super();
		this.games = games;
		this.salesId = salesId;
		this.salesContract = salesContract;
		this.discountedPrice = discountedPrice;
		this.game = game;
		this.offer = offer;
		this.player = player;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public String getSalesContract() {
		return salesContract;
	}

	public void setSalesContract(String salesContract) {
		this.salesContract = salesContract;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
