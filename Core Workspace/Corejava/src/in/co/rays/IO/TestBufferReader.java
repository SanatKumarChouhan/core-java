package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\package in.co.rays.IO;.txt");
		 
		BufferedReader out=new BufferedReader(file);
		
		String line=out.readLine();
		
		while (line!=null) {
			
			System.out.println(line);
			
			line=out.readLine();
		}
		
	}

}
