package gameManager.business.abstracts;

import gameManager.entities.concretes.Player;

public interface PlayerService {
	void add(Player player);
	void delete(Player player);
	void update(Player player);
}
