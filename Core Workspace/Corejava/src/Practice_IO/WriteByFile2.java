package Practice_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile2 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\IO\\kamlesh2.txt");
		
		char[] cArray = {'H','i'};
		//char[] san = {'t' , 'are' , 'you' , 'doing' , 'man'};
		
		fw.write(cArray);
		fw.close();
		
	}

}
