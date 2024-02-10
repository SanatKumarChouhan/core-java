package in.co.rays.oop;

public class XTestAccount {
	
	public static void main(String[] args) {
		
		XAccount a=new XAccount();
		
		a.setId(635378);
		a.setFirstName("Riya");
		a.setSurname("Garhwal");
		
		System.out.println(a.getCustId());
		System.out.println(a.getFirstName());
		System.out.println(a.getSurname());
		
		
	}

}
