package calculator;

import java.util.Scanner;

public class CalculatorUsingMethods {
	static int add(int a,int b) {
		return a+b;
	}
	static int subtract(int a,int b) {
		return a-b;
	}
	static int multiply(int a,int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		System.out.println("please choose a numebr \n");
		System.out.println("press 1 to add");
		System.out.println("press 2 to subtract");
		System.out.println("press 3 to multiply");
		System.out.println("press 4 to divide");
		System.out.println("press any other to exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int result=0;
		switch(choice) {
		case 1:
			result=add(a, b);
			break;
		case 2:
			result=subtract(a, b);
			break;
		case 3:
			result=divide(a, b);
		break;
		case 4:
			result=multiply(a, b);
			break;
		default:
			System.out.println("invalid input");
			break;
		}
		System.out.println("the required result is:"+result);
		
	}

}
