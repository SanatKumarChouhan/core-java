package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataByLine {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\RaysTech.txt", true);
		
		PrintWriter prt = new PrintWriter(file);

		for (int i = 1; i <= 7; i++) {

			prt.println("Rays");
		}

		prt.close();
		file.close();
		
		System.out.println("check");
	}

}
