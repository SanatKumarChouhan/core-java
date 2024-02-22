package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBinaryfile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("C:\\Users\\Asus\\Desktop\\pic1\\kid.jpg");
		
		FileOutputStream out=new FileOutputStream("C:\\Users\\Asus\\Desktop\\pic2\\kid.jpg");
		
		int ch=in.read();
		
		while(ch!=-1) {
			
			out.write(ch);
			
			System.out.println((char)ch);
			
			ch=in.read();
		}
		
	}

}
