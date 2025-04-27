package in.co.rays.IO;

import java.io.FileReader;

public class ReadDateLine {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader file=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\rrr.txt");
			
			int ch=file.read();
		
			while (ch!=-1) {
				
				System.out.print((char)ch);
				
				ch=file.read();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}

}
