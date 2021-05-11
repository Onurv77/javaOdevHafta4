package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public interface CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) throws RemoteException;
	
}
