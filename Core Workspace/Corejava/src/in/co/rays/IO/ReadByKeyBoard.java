package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inreader=new InputStreamReader(System.in);
		
		BufferedReader bw=new BufferedReader(inreader);
		
		PrintWriter pw=new PrintWriter("C:\\Users\\Asus\\Desktop\\pic2\\sanat.txt");
		
		String line=bw.readLine();
		
		while(!line.equals("sanat")) {
			
		      pw.println(line);
			
			line=bw.readLine();
		}
		
		pw.close();
		
		bw.close();

	}

}
