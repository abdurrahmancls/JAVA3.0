
public class customer {
	private int id;
	private String firstName;
	private String lastName;
	private String NationalIdentity;
	
	

	public customer(int id, String firstName, String lastName, String nationalIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		NationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public void Save(customer Customer) {
		System.out.println("Müşteri kayededildi");
	}
	
	public void print() {
		System.out.println("İd: " + id + " Name:" + firstName+" Lastname:"+ lastName+" Nationalıty:"+ NationalIdentity);
	}
	
}
