package gameManager.dataAccess.abstracts;

import gameManager.entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
}
