package inputOutputStream;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
//		File f = new File("F:\\student");
//		boolean isDirectoryExist=f.isDirectory();
		File newFile=new File("F:\\student\\ram.txt");
//		System.out.println("isDirectory");
		boolean isFileExist=newFile.exists();
		System.out.println(isFileExist);
		if(!newFile.isDirectory()) {
			newFile.mkdirs();
		}
		if(!isFileExist) {
			newFile.createNewFile();
		}

	}

}
