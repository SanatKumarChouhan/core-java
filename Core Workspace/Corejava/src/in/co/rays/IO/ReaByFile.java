package in.co.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaByFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\san.txt");
		
		Scanner sc=new Scanner(fr);
		
		while (sc.hasNext()) {
			
			System.out.println(sc.nextLine());
		}
		
	}

}
