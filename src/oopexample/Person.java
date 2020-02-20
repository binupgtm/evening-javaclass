package oopexample;

	class Student1{
	int roll;
	void displayPerson() {
		System.out.println("this is from class Person");
	}
	
}	

	public class Person extends Student1 {
		String name;
		
		 void display() {
			 System.out.println("this is from class Student");
		 }
		 void displayResult() {
			 System.out.println("this is"+name+"and roll is:"+roll);
		 }
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();
		s.displayPerson();
		s.roll=20;
		s.name="binup";
		s.displayResult();
		
		
		

	}

}
