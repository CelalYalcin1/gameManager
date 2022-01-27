package gameManager.dataAccess.concretes;

import gameManager.dataAccess.abstracts.PlayerDao;
import gameManager.entities.concretes.Player;

public class PlayerJdbcDao implements PlayerDao{

	@Override
	public void add(Player player) {
		System.out.println(player.getName()+" added to JDBC database");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName()+" deleted from JDBC database");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getName()+" updated to JDBC database");
		
	}

}
