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
//	Student(){
//	}
	
	void display(Student x) {
		System.out.println("the name of student is:"+x.name +","+"roll no. is:"+x.roll+","+"age is:"+x.age);
	}
	public static void main(String[] args) {
		Student s1=new Student("binup",10,21);
		Student s2=new Student("bimal",15,19);
		s1.display(s1);
		s2.display(s2);
		

	}

}
