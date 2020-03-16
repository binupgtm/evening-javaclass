package genericclass;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("The division of "+a+" and "+b+" is "+result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("This is after exception.");

	}

}
