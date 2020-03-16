package A_Practice;

public class PalindromeNumberTest3 {

	public static void main(String[] args) {
		String name= "binup";
		int len =name.length();
		String rev=" ";
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+name.charAt(i);
			System.out.println(rev);
		
		}
  
	}

}
