package ExceptionHandling;

import java.util.Scanner;

public class RunTimeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("the division of"+a+"and"+b+"is :"+result);

		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("this is after expction");
		
	}

}
