package Practice_IO;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Asus\\Desktop\\IO\\package in.co.rays.IO;.txt");

		// check if file exists

		if (f.exists()) {

			// name a file.
			System.out.println("Name: " + f.getName());

			// path of file.
			System.out.println("Path: " + f.getAbsolutePath());

			// Check access permission.
			System.out.println("Access Permission");
			System.out.println("Writable: " + f.canWrite());
			System.out.println("Readable: " + f.canRead());

			// Check if it is a file or directory.
			System.out.println("Is File:" + f.isFile());
			System.out.println("Is Directory: " + f.isDirectory());

			// Last Modified date of file/directory.
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified: " + d);

			// Length of File.
			long length = f.length();
			System.out.println("Length: " + length + " bytes");

		} else {

			System.out.println("File Does Not Exist");
		}

	}

}
