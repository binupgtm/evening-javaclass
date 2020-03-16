package StringExample;

public class StringTest1 {

	public static void main(String[] args) {
		   String st = new String();
		   String st1 = new String("Where Are You going?");
		   String st2 = new String("I have a car!");
		   
		   System.out.println(st1.getBytes());
		   System.out.println(st1.concat(st2));
		   System.out.println(st2.length());
		   System.out.println(st1.charAt(6));
		   System.out.println(st1.length());
		   System.out.println(st1.substring(6));
		   System.out.println(st2.substring(2, 6));
		   System.out.println(st1.indexOf("You"));
		   System.out.println(st1.contentEquals("You"));
		   System.out.println(st2.compareTo(st2));
		   System.out.println(st1.toLowerCase());
		   System.out.println(st2.toUpperCase());
		   
	}

}
