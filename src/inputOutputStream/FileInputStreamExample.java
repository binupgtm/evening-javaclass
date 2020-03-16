package inputOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("f:\\java.txt.txt");
			int i =0;
			while((i=f.read())!=-1) {
				System.out.println((char)i);
				}
			} catch (IOException e) {
				
				e.printStackTrace();

		}
		

	}

}
