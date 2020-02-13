package classabdobjectconcept;

public class Student {

	String name;		//attributes
	int age;
	
	void add(){
		System.out.println("this is method");
	}
	int add(int a,int b) {
		return a + b;
	}
	int add1() {
		int a=3,b=0;
		return a+b;
	}
	void display() { //method with no return type and no parameters.
		int a=3,b=4;
		System.out.println("sum of two numbers is:"+(a+b));
	}
	void display(int a,int b) {
		System.out.println();
	}
	public static void main(String[] args) {
	}
	
}
