package abstracts;

import concretes.Player;

public interface DataService {
	
	public void add(Player player) throws Exception;
	public void delete(Player player);
	public void update(Player player);
	 
}
