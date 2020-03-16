package StringExample;

public class StringTest {

	public static void main(String[] args) {
		String s=new String();
		String s1=new String("     my name is Binup   ");
		String s2=new String("i am in Texas");
		
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(11, 16));
		System.out.println(s2.replace("Texas", "Austin"));
		System.out.println(s2.concat(s1));
		System.out.println(s1.trim());
		System.out.println(s2.charAt(2));
		
	}

}
