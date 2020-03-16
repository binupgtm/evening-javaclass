package A_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of your size");
		int size;
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter your Number");
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();		
		}
		System.out.println(Arrays.toString(a));
	}
	
}
