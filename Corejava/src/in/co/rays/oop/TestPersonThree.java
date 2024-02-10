package in.co.rays.oop;

import java.util.Date;

public class TestPersonThree {
	
	public static void main(String[] args) {
		
		PersonThree t=new PersonThree();
		
		
		
		t.setDob(new Date());
         t.setId(34);
         
         t.setName("prabhakar");
         
         
         System.out.println(t.getId());
         
         System.out.println(t.getName());
         System.out.println(t.getDob());
		
		
	}

}
