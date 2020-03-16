package ExceptionHandling;

public class NumberFormatException {

	private static final String s = null;

	public static void main(String[] args) {
		try {
			int num =Integer.parseInt(s);
			System.out.println(num);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Number format exception");
		}

	}

}
