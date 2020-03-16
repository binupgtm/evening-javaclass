package inputOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputExample {

	public static void main(String[] args) {
		 try {
			 FileInputStream file= new FileInputStream("F:\\bg.txt");
			 BufferedInputStream bs=new BufferedInputStream(file);
			 int i;
			 String result=" ";
			 while((i=bs.read())!=-1) {
				 result=result+(char)i;
				
			 }
			 System.out.println((char)i);
			 bs.close();
			 file.close();
		 }catch(Exception e) {
			
			 System.out.println("file does not exists");
		 }

	}

}
