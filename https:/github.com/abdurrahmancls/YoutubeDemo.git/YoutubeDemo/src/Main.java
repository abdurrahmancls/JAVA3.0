
public class Main {

	public static void main(String[] args) {
		creditManager creditmanager=new creditManager();
		creditmanager.calculate();
		creditmanager.Save();
		
		
		customer Customer=new customer(2, "Abdurrahman","Çalış","Turkiye");
		
		
		Customer.print();
		
		customerManager customermanager=new customerManager(Customer);
		customermanager.Save();
		customermanager.Delete();
		
		Company company=new Company(3, "ABC", "EFG","USA");
		company.TaxNumber="2000";
		System.out.println(company.TaxNumber);
	}

}
