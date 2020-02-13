package oopexample;

public class Animal {
	String name;
	int age;
	String color;
	
	Animal(String n,int a,String c){
		name=n;
		age=a;
		color=c;
		
	}
	Animal(){
		}
	void display(Animal a) {
		System.out.println("the name of animal is:"+a.name+"age is:"+a.age+"color is:"+a.color);
	}

	public static void main(String[] args) {
		Animal animal=new Animal();   //default constructor
		animal.name="dog";
		animal.age=3;
		animal.color="black";
		animal.display(animal);
//		Animal Animal=new Animal("dog",3,"black");
//		animal.display(animal);
//		
	}

}
