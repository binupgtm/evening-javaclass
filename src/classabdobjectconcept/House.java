package classabdobjectconcept;

public class House {
	String name;
	int price;
	int adress;
	
	void CanStay() {
		System.out.println("we can stay");
	}
	void DisplayHouseDetails(House House) {
		System.out.println("the name is:"+House.name + "price:"+House.price+"adress:"+House.adress);
	}
	
	public static void main(String[] args) {
		House hse = new House();
		hse.name = "binup";
		hse.price = 300000;
		hse.adress = 17403;
		hse.DisplayHouseDetails(hse);	

	}

}
