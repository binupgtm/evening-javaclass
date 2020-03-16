package A_Practice;

public class FactorialNumberTest2 {
	public static void main(String[] args) {
		int a=7;
		int total=1;
		for(int i=1; i<=a; i++) {
			total = total*i;
		}
		System.out.println("The factorial of "+a+" is :" + " "+total);

	}
}
