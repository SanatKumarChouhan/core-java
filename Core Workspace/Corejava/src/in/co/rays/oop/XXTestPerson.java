package in.co.rays.oop;

import java.util.Date;

public class XXTestPerson {
	
	public static void main(String[] args) {
		
		XXPerson xx=new XXPerson();
		
		xx.setNaam("Deepak Maali");
		xx.setDateOfbirth(new Date());
		
		System.out.println("Full Name: "+xx.getNaam());
		System.out.println("Current Date and Time: "+xx.getDateOfBirth());
		System.out.println("Age: "+xx.age);
		
	}

}
