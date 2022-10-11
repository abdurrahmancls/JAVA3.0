
public class customerManager {
	private customer Cstmr;
	
	
	
	public customerManager(customer cstmr) {
		
		Cstmr = cstmr;
	}



	public void Save() {
		System.out.println("Müşteri kaydedildi: " +  Cstmr.getFirstName());
	}
	public void Delete() {
		System.out.println("Müşteri silindi: " +  Cstmr.getFirstName());
	}
	
	

}
