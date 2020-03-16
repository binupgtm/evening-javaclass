package inputOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fl = new FileWriter("F:\\abc.txt");
			fl.write("this is class of file writer ");
			fl.write('a');
			fl.close();
			System.out.println("completed");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
