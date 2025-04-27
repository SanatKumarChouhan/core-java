package Practice_IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TestBufferedReader {
	
	public static void main (String[] args) throws IOException {
		
		FileReader file=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\shanu.txt");
		
		BufferedReader out=new BufferedReader(file);
		
		String line=out.readLine();
		
		while (line!=null) {
			
			System.out.println(line);
			
			line=out.readLine();
		}
	}

}
