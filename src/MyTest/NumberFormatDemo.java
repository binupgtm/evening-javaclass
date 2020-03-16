package MyTest;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.US);
		System.out.println("US representain of:"+d+" & " +nf.format(d));

	}

}
