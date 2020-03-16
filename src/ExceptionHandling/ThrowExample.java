package ExceptionHandling;

import java.util.Scanner;

public class ThrowExample {
	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("you can not vote");
			//System.out.println("you can not vote");
		}
		else 
			System.out.println("you can vote");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=sc.nextInt();
		validateAge(age);

	}

}
