package abstracts;

import concretes.Campaign;
import concretes.Game;
import concretes.Player;

public interface SaleService {

	public void sale(Game game, Player player, Campaign campaign);
	public void sale(Game game, Player player);
	
}
