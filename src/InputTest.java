import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter Your country");
		String country=sc.next();
		System.out.println("Enter Your age");
		int age=sc.nextInt();
		System.out.println("Enter your Gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter your phno");
		long phno=sc.nextLong();
		
		System.out.println("Name: "+name);
		System.out.println("country: "+country);
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("phno: "+phno);
	}

}
