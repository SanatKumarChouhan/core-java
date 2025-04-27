package Practice_IO;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ReadDataLine {
	
	public static void main(String[] args) throws IOException{
		
		try {
			
			FileReader fr=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\package in.co.ras.IO.txt");
			
			int ch=fr.read();
			
			while (ch!=-1) {
				
				System.out.print((char)ch);
				 
				ch=fr.read();
			}
		
	}catch (FileNotFoundException e) {
		
		System.out.println(e);
		
	}

}
}