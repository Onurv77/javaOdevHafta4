package concretes;

import abstracts.BaseGameManager;
import abstracts.Entity;

public class GameManager extends BaseGameManager{
	
	Game game;
	
	public GameManager(Game game) {
		this.game = game;
	}
	
	public void gameSale() {
		
		System.out.println("Merhaba "+this.game.getGameName()+", oyun satýþý baþarýyla tamamlanmýþtýr.");
		
	}
}
