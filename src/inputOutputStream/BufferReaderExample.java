package inputOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Write anything.");
			String name = br.readLine();
			System.out.println("you wrote: "+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
