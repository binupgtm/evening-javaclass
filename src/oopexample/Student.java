package oopexample;

public class Student {
	String name;
	int roll;
	int age;;
	
	Student(String name,int roll,int age){
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	Student(){
	}
	
	void display(Student x) {
		System.out.println("the name of student:"+x.name +"roll is:"+x.roll+"age is:"+x.age);
	}
	public static void main(String[] args) {
		Student s1=new Student("binup",10,21);
		s1.display(s1);
		

	}

}
