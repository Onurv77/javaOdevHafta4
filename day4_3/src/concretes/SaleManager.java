package concretes;

import abstracts.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Player player, Campaign campaign) {

		System.out.println(player.getUserName()+"'a "+game.getGameName()+" oyunu "+campaign.getCampaignName()+" kampanyasiyla satilmistir.");
		
	}

	@Override
	public void sale(Game game, Player player) {

		System.out.println(player.getUserName()+"'a "+game.getGameName()+" oyunu satilmistir.");
		
	}

}
