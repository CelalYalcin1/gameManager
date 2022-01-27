package gameManager.dataAccess.abstracts;

import gameManager.entities.concretes.Player;

public interface PlayerDao {
	void add(Player player);
	void delete(Player player);
	void update(Player player);	
}
