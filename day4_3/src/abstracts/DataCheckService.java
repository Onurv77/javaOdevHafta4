package abstracts;

import java.rmi.RemoteException;

import concretes.Player;

public interface DataCheckService {
	
	public boolean checkRealPerson(Player player) throws RemoteException;

}
