package A_Practice;

import java.util.Scanner;

public class PalindromeNumberTest2 {

	public static void main(String[] args) {
		String a,b = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		a = sc.nextLine();
		int length =a.length();
		String rev = " :";
		
		for(int i=length-1; i>=0; i--)
			b = b+a.charAt(i);
		
		if(a.contentEquals(b));
			System.out.println("This is a Palindrome.");
  		else {
  			System.out.println("this is not a Palindrome");
  		}
			
	}

}
