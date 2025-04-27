package Practice_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\pen.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		char[] cArray = {'H' , 'i'};
		
		bw.write(cArray);
		bw.write("     java");
		
		System.out.println("check");
		
		bw.close();
		fw.close();
		
		
		
		
		
	}

}
