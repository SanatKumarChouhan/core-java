package Practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\sann.txt");
		
		file.write("Hello world i'm sanat kumar chouhan and I've great java development skills");
		
		file.close();
		
		System.out.println("check");
	
	}

}
