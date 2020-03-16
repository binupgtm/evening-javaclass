package runtimepolymorphism;

public class Honda extends Bike{
	int a=5;
	@Override
	public void run() {
		System.out.println("honda is running");
	}
	public void displayInfo() {
		System.out.println("this is Honda class");
	}

	public static void main(String[] args) {
		Bike b=new Honda();		//dynamic binding
		b.run();
		Honda h=new Honda();	//static binding
		h.displayInfo();
		
		

	}

}
