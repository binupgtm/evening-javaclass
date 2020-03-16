package array;

public class SmallestInArray {

	private static int[] numbers;

	public static void main(String[] args) {
		int[] a= new int [] {1,5,7,3,12,17,20};
		int smallest = 0;
		
		for (int i=0; i<a.length;i++) {
			if (numbers[i]<smallest) {
					smallest = numbers[i] ;
			}
		}
			System.out.println("smallest numbers array is:"+smallest);
		
	}

}
