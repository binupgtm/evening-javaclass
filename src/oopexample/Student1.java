package oopexample;

	class Person{
		int roll;
		void displayPerson() {
		System.out.println("this is from class Person");
	}
	
}	

	public class Student1 extends Person {
		String name;
		
		 void display() {
			 System.out.println("this is from class Student");
		 }
		 void displayResult() {
			 System.out.println("this is:"+name+" "+"and roll is:"+roll);
		 }
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();
		s.displayPerson();
		s.roll=2;
		s.name="binup";
		s.displayResult();
		
		
		

	}

}
