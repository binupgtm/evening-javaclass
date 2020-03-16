package A_Practice;

import java.util.Scanner;

public class FactorialNumberTest1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Factorial Of number");
		int a=sc.nextInt();
		int total=1;
		
		for(int i=1; i<=a; i++) {
			total=total*1;
			
		}
			System.out.println("The factorial of number "+a+" is: "+total);
	}

}
