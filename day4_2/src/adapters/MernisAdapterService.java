package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();		
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
				
	}

}
