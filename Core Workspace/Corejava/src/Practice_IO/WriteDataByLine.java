package Practice_IO;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;


public class WriteDataByLine {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\sonu.txt");
		
		PrintWriter pw=new PrintWriter(fw);
		
		for (int i=1; i<=5; i++) {
			
			pw.println("ponu");
			
		}
		
		pw.println("sonu");
		pw.println("monu");
		pw.println("tonu");
		
		System.out.println("check");
		
		pw.close();
		fw.close();
	}
	
		//System.out.println("check");

}
