package Practice_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitiveDate {
	
	public static void main(String[] args) throws IOException {
		
//		DataOutputStream dos=new DataOutputStream( new FileOutputStream("C:\\Users\\Asus\\Desktop\\IO\\yo.dat"));
//	
//		dos.writeInt(5);
//		dos.writeBoolean(true);
//		dos.writeChar('a');
//		dos.writeDouble(1.2);
//		
//		dos.close();
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Asus\\Desktop\\IO\\yo2.txt");
		
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeInt(1);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.writeDouble(4.4);
		
		dos.writeChars("what are you doing.");
		
		dos.writeBytes("hi im using java.");
		
		System.out.println("check");
		
		dos.close();
	
	}
	
	

}
