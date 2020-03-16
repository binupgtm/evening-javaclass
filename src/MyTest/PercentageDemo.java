package MyTest;

import java.util.Scanner;

public class PercentageDemo {

	public static void main(String[] args) {
		float percentage ;
		float total ;
		float scored ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks :");
		scored = sc.nextFloat();
		
		System.out.println("Enter your total marks :");
		total = sc.nextFloat();
		
		percentage =(float)((scored /total)*100);
		System.out.println("Percentage :" + percentage);
		
	}

}
