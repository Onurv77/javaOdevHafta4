package concretes;

import abstracts.CampaignService;
import abstracts.DataService;


public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campain) {
		
		System.out.println("Kampanya eklenmiþtir...   "+campain.getCampaignName());
		
	}
	
}
