package ExceptionHandling;

import java.util.Scanner;

public class SchoolBannedtest {
	public static void testschool(String schoolName)throws SchoolBannedException {
	if(schoolName.equalsIgnoreCase("abc")) {
			throw new SchoolBannedException("This school is banned for now,we will contact you later");
		}else System.out.println("congratulation");
	}
	public static void main(String[] args, Object schoollName) {
		System.out.println("plase enter School name");
		Scanner sc=new Scanner(System.in);
		String schoolName=sc.nextLine();
		try {
			testschool(schoolName);
		}catch(SchoolBannedException e) {
			e.printStackTrace();
		}
		System.out.println("this is after exception");
	}
}

