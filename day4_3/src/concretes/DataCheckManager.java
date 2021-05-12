package concretes;

import java.rmi.RemoteException;

import abstracts.DataCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class DataCheckManager implements DataCheckService{

	@Override
	public boolean checkRealPerson(Player player) throws RemoteException{
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirth().getYear());
		
	}

}
