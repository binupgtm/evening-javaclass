package classabdobjectconcept;

public class Bimal {
	static String name;
	static int age;
	static int hight;
	
	void HeIsHuman() {
		System.out.println("He Is Human");
	}
	void BimalDisplayDetails() {
		System.out.println("the name is :"+Bimal.name+" and age is :" +Bimal.age+",hight :"+Bimal.hight);
	}
	public static void main(String[] args) {
		Bimal Bml = new Bimal();
		Bimal.name="Bimal";
		Bimal.age = 21;
		Bimal.hight = 6 ;
		Bml.BimalDisplayDetails();
		
		Bimal Bml1 = new Bimal();
		Bimal.name="Bimalgtm";
		Bimal.age=26;
		Bimal.hight=5;
		Bml1.BimalDisplayDetails();
		
	}

}
