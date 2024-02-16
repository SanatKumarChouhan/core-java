package in.co.rays.basic;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class TestDate {
	
	public static void main(String[] args) throws ParseException {
		
		//print today's date.
		Date d=new Date();
		System.out.println(d);
		
		
		// print today's date in string form.
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		String s=sdf.format(d);
		System.out.println(s);
		
		
		// print any date in word form.
		String s1="12/12/1996";
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(s1);
		System.out.println("this is your day of your birht date = "+d1);
		
		
	}

}
