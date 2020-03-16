package A_Practice;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeNumberTest1 {

	public static void main(String[] args) {
		String name = "binup";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str =sc.next();
		String rev = new StringBuffer(str).reverse().toString();
		
		if(str.equals(rev));
			System.out.println("this is a Palindrome Number");	
		else
			System.out.println("this is not a palindrome number");
			
	}

}
