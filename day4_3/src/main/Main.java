package main;

import java.rmi.RemoteException;
import java.time.LocalDate;

import abstracts.CampaignService;
import abstracts.DataService;
import abstracts.GameService;
import abstracts.SaleService;
import concretes.Campaign;
import concretes.CampaignManager;
import concretes.DataCheckManager;
import concretes.DataManager;
import concretes.Game;
import concretes.GameManager;
import concretes.Player;
import concretes.SaleManager;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(0, "11111111111", "onur","öZcAn","Onurv77",LocalDate.of(1234, 1, 13));
		Game game1 = new Game(1,"Half Life: Black Mesa",30,3000);
		Campaign campaign1 = new Campaign("Black Friday");
		
		DataService dataManager = new DataManager(new DataCheckManager());
		
		try {
			dataManager.add(player1);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		GameService gameService = new GameManager(game1);			
		gameService.gameSale();
		
		CampaignService campaignService = new CampaignManager();
		campaignService.campaignAdd(campaign1);
		
		SaleService sale = new SaleManager();
		sale.sale(game1, player1);

	}

}
