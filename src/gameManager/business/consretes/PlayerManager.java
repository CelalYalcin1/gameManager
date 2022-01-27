package gameManager.business.consretes;

import gameManager.business.abstracts.PlayerService;
import gameManager.entities.concretes.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.getName()+" is added");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getName()+" is deleted");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getName()+" is updated");
		
	}

}
