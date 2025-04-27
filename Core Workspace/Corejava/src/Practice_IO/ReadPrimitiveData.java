package Practice_IO;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadPrimitiveData {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\IO\\yo2.txt");
		
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		
		dis.close();
		
//		FileReader fr=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\yo2.txt");
//		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String line=br.readLine();
//		
//		while (line!=null) {
//			
//			System.out.println(line);
//			
//			line=br.readLine();
//		}
		
	}

}
