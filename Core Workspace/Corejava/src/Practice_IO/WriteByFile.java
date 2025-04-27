package Practice_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile {
	
	public static void main (String[] args) throws IOException{
		
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\shanu.txt");
		
		for (int i=1; i<=7; i++) {
			
			fw.write("Happy BirthDay Vedu mishra \n");
			
		}
		
		fw.write("Happy BirthDay Shanu Mishra \n");
		
		
		fw.close();
		
		System.out.println("check");
	}

}
