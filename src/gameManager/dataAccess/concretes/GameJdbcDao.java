package gameManager.dataAccess.concretes;

import gameManager.dataAccess.abstracts.GameDao;
import gameManager.entities.concretes.Game;

public class GameJdbcDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" added to JDBC database");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" deleted from JDBC database");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" updated to JDBC database");
		
	}

}
