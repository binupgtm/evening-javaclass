package genericclass;

public class GenericsMethodTest {

	 
		public static <T> void printArray(T[]elements) {
			for(T ele : elements) {
				System.out.println(ele + " ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			Integer[] intArray= {1,5,8,11,33,57,85,69};
			Double[] doubleArray= {1.1,5.6,8.9,2.9,9.2,0.29};
			Character[] charArray= {'B', 'I', 'N', 'U' ,'P', 'G', 'T', 'M'};
			
			System.out.println("Printing Array of Integer: ");
			printArray(intArray);
			System.out.println("Printing Array of double:");
			printArray(doubleArray);
			System.out.println("Printing Array of Charactor:");
			printArray(charArray);
		}
	

}
