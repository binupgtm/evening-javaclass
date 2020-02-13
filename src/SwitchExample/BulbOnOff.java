package SwitchExample;

import java.util.Scanner;

public class BulbOnOff {

	public static void main(String[] args) {
//		System.out.println("please select 1 or 0");
//		Scanner sc=new Scanner(System.in);
//		int value=sc.nextInt();
//		switch(value) {
//		case 1:
//			statement
//			System.out.println("light is turned On");
//			break;
//		case 0:
//			statement
//			System.out.println("lights is turned Off");
//			break;
//			default:
//				ststement
//				System.out.println("Invalid input");
		
	int day = 2;
	String dayString;
	switch (day) {
	case 1:
		dayString = "Monday";
		break;
	case 2:
		dayString = "Tuesday";
		break;
//	case 3:
//		System.out.println("Wednesday");
//		break;
//	case 4:
//		System.out.println("Thursday");
//		break;
//	case 5:
//		System.out.println("Friday");
//		break;
//	case 6:
//		System.out.println("Saturday");
//		break;
//	case 7:
		default:
			dayString = "Invalid day";
			break;}
		System.out.println(dayString);
		
		
		
		
		
	}
//	System.out.println("enter a character");
//	char value='i';
//	switch(value) {
//	case 'i':
//		System.out.println("i for IT babu");
//	case 'b':
//		System.out.println("B for Binup babu");
	}
	
	


