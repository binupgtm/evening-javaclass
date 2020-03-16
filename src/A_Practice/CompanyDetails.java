package A_Practice;
public class CompanyDetails {
	String name;
	int ranked;
	Address address;
	
	public CompanyDetails(String name,int ranked,Address address) { 
		this.name=name;
		this.ranked=ranked;
		this.address=address;
	}
	void display() {
		System.out.println("#"+ranked +" "+ name+" Company");
		System.out.println(address.Street+" "+address.City+" "+address.State+" "+address.zipCode);
	}
	public static void main(String[] args) {
		Address ad1 = new Address("Crazy arm rd","Round Rock,","Tx,",78664);
		Address ad2= new Address("Wells Branch pkwy","Austin,","tx,",78728);
		
		CompanyDetails c1= new CompanyDetails("abc", 1, ad1);
		CompanyDetails c2 = new CompanyDetails("xys",5, ad2);
		
		c1.display();
		c2.display();
	}

}
