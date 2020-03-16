package A_Practice;

public class fibonacciseriesTest2 {

	public static void main(String[] args) {
		int n=100, a=0, b=1;
		System.out.println("the Fibonacci Series of :"+ ""+n);
		
		while(a<=n) {
			System.out.print(a+ " , ");
			int s= a+b;
			a=b;
			b=s;
		}

	}

}
