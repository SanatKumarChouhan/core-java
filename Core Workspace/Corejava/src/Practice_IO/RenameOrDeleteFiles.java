package Practice_IO;

import java.io.File;

public class RenameOrDeleteFiles {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\Asus\\Desktop\\IO\\sonu.txt");
		
		//Rename a file.
		f.renameTo(new File("C:\\Users\\Asus\\Desktop\\IO\\monu.txt"));
		
//		//Delete a file.
//		f.delete();
//		//Delete if exists.
//		f.deleteOnExit();
		
		
		
	}

}
