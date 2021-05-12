package abstracts;

import concretes.Player;

public abstract class BaseGameManager implements GameService{
		
	public void gameSale(Player player) {
		
		System.out.println("Merhaba "+player.getUserName()+", oyun satýþý baþarýyla tamamlanmýþtýr.");
		
	}
}
