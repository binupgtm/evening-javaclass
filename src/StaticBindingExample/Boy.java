package StaticBindingExample;

public class Boy extends Human{
	public void eat() {
		System.out.println("He can eat");
	}
	

	public static void main(String[] args) {
		Human h=new Human();
		h.eat();
		Boy b=new Boy();
		b.eat();
		Human hb=new Human();
		hb.eat();
		
		
	}

}
