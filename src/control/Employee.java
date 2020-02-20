package control;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address address1 =new Address("Austin","Tx","USA");
		Address address2 =new Address("Round Rock","Tx","USA");
		
		Employee emp1 =new Employee (12, "binup", address1);
		Employee emp2 =new Employee (25, "Ramesh", address2);
		
		emp1.display();
		emp2.display();
		

	}

}
