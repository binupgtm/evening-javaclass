package A_Practice;

public class FibonacciSeriesTest1 {

	public static void main(String[] args) {
		int n3=10, n1=0, n2=1;
		
		System.out.println("Fibonacci Series of"+" " +n3 +" "+ "numbers:");
		
		for(int i=2; i<10; i++) {
			System.out.print(n1+", ");
			
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		

	}

}