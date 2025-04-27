 package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\rrr.txt");
		
		fw.write("Hello World I'm a fodhu java developer");
		fw.write(" hello  riya");
		
		for (int i=1; i<=10; i++) {
			
			fw.write("riya");
		}
		
//		fw.write("Hello World");
//		fw.write(" I");
//		fw.write(" am");
//		fw.write(" a");
//		fw.write(" JAVA");
//		fw.write(" Developer");
		fw.close();
		
		//System.out.println("Check");
		
		
	}

}
