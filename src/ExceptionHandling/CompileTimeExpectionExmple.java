package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExpectionExmple {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\student.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
		}
		System.out.println("we are reading anout exception handling.");
		System.out.println("this is mext statement.");
	}

}
