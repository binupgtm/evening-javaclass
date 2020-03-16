package oop.overriding;

public class AccessSpecifier {
	String name;
	String faculty;
	int roll;
	
	public AccessSpecifier(String name,String faculty,int roll) {
		this.name=name;
		this.faculty=faculty;
		this.roll=roll;
	}
	public AccessSpecifier() {}
	
	void display() {
		System.out.println("the name is:"+name+ " ," +"the faculty is:"+faculty+", "+"the roll is:"+roll);
	}
	

	public static void main(String[] args) {
		AccessSpecifier asp = new AccessSpecifier("Bimal","Science",5);
		asp.display();

	}

}
