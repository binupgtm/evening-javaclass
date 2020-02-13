package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("please choose a number:\n ");
		System.out.println("press 1 to add");
		System.out.println("press 2 to suntract");
		System.out.println("press 3 to divide");
		System.out.println("press 4 to multiply");
		System.out.println("press anu other to exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("The sum number is:"+(a+b));
			break;
		case 2:
			System.out.println("The subtraction of two number is:"+(a-b));
			break;
		case 3:
			System.out.println("The division of two number is:"+((float)(a/b)));
			break;
		case 4:
			System.out.println("The multiplication of two number is:"+(a*b));
			break;
		default:
			System.out.println("invalid number");
			break;
		}
		

	}

}
