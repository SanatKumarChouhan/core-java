package in.co.rays.oop;

public class TestAccount {
	
	
	
	public static void main(String[] args) {
		
		Account a=new Account();
		
		a.setFirstname("sanat");
		a.setLastname("chouhan");
		String name= "sanat";
		
			
		a.setAddress("indore");
		
		a.setId(12);
		
		System.out.println(a.getId());
		
		System.out.println(a.getFirstname());
		
		System.out.println(a.getAddress());
		
		System.out.println(a.getLastname());
		
	}

}
