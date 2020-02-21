package SuperKeywordExample;

public class Technician extends Person {
	public void message() {
		System.out.println("this is form Technician class");
	}
	
	public void display() {
		message();
		super.message();
	}

	public static void main(String[] args) {
		Technician tech = new Technician();
		tech.display();
		

	}

}
