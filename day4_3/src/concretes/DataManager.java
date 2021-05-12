package concretes;



import abstracts.DataCheckService;
import abstracts.DataService;

public class DataManager implements DataService {

	private DataCheckService check;
	
	public DataManager(DataCheckService check) {
		
		this.check = check;
		
	}
	
	@Override
	public void add(Player player) throws Exception {

		if(check.checkRealPerson(player)) {
			
			System.out.println("Person added: "+player.getFirstName().toUpperCase());
			
		}else {
			throw new Exception("Bulunamadý");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" deleted.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+" updated.");
		
	}

	

}
