package oopexample;

public class ConstructorExample {
	String name;
	int roll;
	static String schoolName="mahendra";
	
	ConstructorExample(String n,int r){
		name=n;
		roll=r;
	}
	ConstructorExample(){}
	public static void main(String[] args) {
		ConstructorExample s1 =new ConstructorExample("binup",1);
		System.out.println("name is:"+s1.name+"\n roll is:"+s1.roll+"\n school name is:"+s1.schoolName);
		

	}

}
