package gameManager.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import gameManager.entities.abstracts.Entity;

public class Player implements Entity {
	private int identityNumber;;
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private List<Game> games;
	
	public Player() {
		super();
	}

	public Player(int identityNumber, String name, String surname, LocalDate dateOfBirth, List<Game> games) {
		super();
		this.identityNumber = identityNumber;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.games = games;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
}
