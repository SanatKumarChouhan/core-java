package Practice_IO;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class WriteByKeyboard {
	
	public static void main (String[] args) throws IOException{
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		PrintWriter pw=new PrintWriter("C:\\Users\\Asus\\Desktop\\IO\\Abhi.txt");
		
		String line=br.readLine();
		
		while (!line.equals("close")) {
			
			pw.println(line);
			
			line=br.readLine();
			
		}
		
		pw.close();
		
		br.close();
		
		
	}
	
	

}
