package MyTest;

import java.time.*;
import java.util.*;
										//year to leap year or not
public class LeapYearTest2 {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		
		if(today.isLeapYear()) {
			System.out.println("this is a leap year");
		}
		
		else {
			System.out.println("this is not a leap year");
		}

	}

}
