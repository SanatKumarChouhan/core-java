package Practice_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile3 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\men.txt");
		FileWriter fw2=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\men.txt");
		
		fw.write("what are you doing for");
		fw2.write("how you doing for");
		
		System.out.println("check");
		
		fw.close();
		fw2.close();
		
	}

}
