package MyTest;

import java.util.Scanner;

public class LeapYear1 {
														//year to leap year or not
	public static void main(String[] args) {
		int year;
		
		 System.out.println("Enter Year : ");
		 
		 Scanner sc = new Scanner(System.in);
		 year=sc.nextInt();
		 
		 if((year %400 ==0) || (year%4 == 0)  && (year%100 !=0)) { 
			 System.out.println("year"+" "+year +" is a leap year.");
		 }
		 else {
			 System.out.println("year"+" "+year +" is not a leap year.");
		sc.close();
		 }
		
	}

}
