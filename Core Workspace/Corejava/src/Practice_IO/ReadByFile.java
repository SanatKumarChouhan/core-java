package Practice_IO;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\Asus\\Desktop\\IO\\package in.co.rays.IO;.txt");
		
		Scanner sc=new Scanner(fr);
		
		while (sc.hasNext()) {
			
			System.out.println(sc.nextLine());
		}
		
	}

}
