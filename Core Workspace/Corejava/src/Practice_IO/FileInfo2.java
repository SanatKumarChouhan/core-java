package Practice_IO;

import java.io.File;

public class FileInfo2 {
	
	public static void main(String[] args) {
		
		//file object refer to c:/temp folder.
		
		File directory=new File("D:\\sagar iPhone\\doc");
		
		//get the list of files and subdirectories.
		
		String[] files = directory.list();
		
		for (String f: files) {
			System.out.println(f);
		}
		
	}

}
