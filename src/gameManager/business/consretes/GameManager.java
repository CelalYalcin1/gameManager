package gameManager.business.consretes;

import gameManager.business.abstracts.GameService;
import gameManager.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" is added");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" is deleted");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" is updated");
		
	}

}
